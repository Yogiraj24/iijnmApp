/**
 * $Id: ExcelParser.java 1590 2009-03-23 11:28:59Z ranjank@hpmedia.in $
 */
package com.edu.iijnm.framework;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExcelParser {






	/**
	 * Parses the excel data and returns a List of HashMaps. HashMap keys are
	 * the column headers in row 1 of the sheet
	 * 
	 * @param data
	 * @return
	 */
	public List parse(byte[] data) {

		List list = new ArrayList();

		try {

			HSSFWorkbook wb = null;
			try {
				InputStream is = new ByteArrayInputStream(data);
				POIFSFileSystem fs = new POIFSFileSystem(is);
				wb = new HSSFWorkbook(fs);
			} catch (IOException e) {
				System.out.println(e.getMessage());
				return null;
			}

			int numOfSheets = wb.getNumberOfSheets();

			for (int i = 0; i < numOfSheets; i++) {
				HSSFSheet sheet = wb.getSheetAt(i);

				Iterator<?> rows = sheet.rowIterator();
				List<String> columnHeaders = new ArrayList<String>();

				if (rows.hasNext()) {
					HSSFRow columnHeaderRow = (HSSFRow) rows.next();
					short c1 = columnHeaderRow.getFirstCellNum();
					short c2 = columnHeaderRow.getLastCellNum();
					for (short c = c1; c < c2; c++) {
						HSSFCell cell = columnHeaderRow.getCell(c);
						if (cell != null) {
							String cellValue = getCellValue(cell);
							if (cellValue != null && cellValue.trim().length() > 0) {
								columnHeaders.add(cellValue);
							}
						}
					}

				}

				while (rows.hasNext()) {
					HSSFRow row = (HSSFRow) rows.next();
					short c1 = row.getFirstCellNum();
					short c2 = row.getLastCellNum();

					
					if(isBlankRow(row)) {
						continue;
					}
					Map map = new HashMap();
					// loop for every cell in each row
					for (short c = c1; c < c2; c++) {
						HSSFCell cell = row.getCell(c);
						if (cell != null) {
							String cellValue = getCellValue(cell);
							if (cellValue != null && cellValue.trim().length() > 0) {
								String columnHeader = "";
								try {
									columnHeader = (String) columnHeaders.get(c);
								} catch (Exception e) {
									System.out.println(e.getMessage());
									columnHeader = "Unknown " + c;
								}

								map.put(columnHeader, cellValue);
							}
						}
					}
				
					list.add(map);
				}
				
			}
		} catch (Throwable t) {
			System.out.println(t.getMessage());
			
		}
		return list;
	}

	/**
	 * This is a helper method to retrieve the value of a cell regardles of its
	 * type, which will be converted into a String.
	 * 
	 * @param cell
	 * @return
	 */
	private String getCellValue(HSSFCell cell) {
		if (cell == null)
			return null;

		String result = null;

		int cellType = cell.getCellType();
		switch (cellType) {
		case HSSFCell.CELL_TYPE_BLANK:
			result = "";
			break;
		case HSSFCell.CELL_TYPE_BOOLEAN:
			result = cell.getBooleanCellValue() ? "true" : "false";
			break;
		case HSSFCell.CELL_TYPE_ERROR:
			result = "ERROR: " + cell.getErrorCellValue();
			break;
		case HSSFCell.CELL_TYPE_FORMULA:
			result = cell.getCellFormula();
			break;
		case HSSFCell.CELL_TYPE_NUMERIC:
			HSSFCellStyle cellStyle = cell.getCellStyle();
			short dataFormat = cellStyle.getDataFormat();

			// assumption is made that dataFormat = 15,
			// when cellType is HSSFCell.CELL_TYPE_NUMERIC
			// is equal to a DATE format.
			if (dataFormat == 15) {
				result = cell.getDateCellValue().toString();
			} else {
				result = String.valueOf(cell.getNumericCellValue());
			}

			break;
		case HSSFCell.CELL_TYPE_STRING:
			result = cell.getStringCellValue();
			break;
		default:
			break;
		}

		return result;
	}
	
	private boolean isBlankRow(HSSFRow row) {
		if (row == null)
			return true;
		else {
			int noOfColumns = row.getLastCellNum();
			for (short i = 0; i < noOfColumns; ++i) {
				HSSFCell cell = row.getCell(i);
				if (cell == null)
					continue;

				switch (cell.getCellType()) {
				case HSSFCell.CELL_TYPE_BLANK:
					continue;
				case HSSFCell.CELL_TYPE_ERROR:
					continue;
				case HSSFCell.CELL_TYPE_NUMERIC:
					double db = cell.getNumericCellValue();
					if (new Double(db).toString().equals(""))
						continue;
					else
						return false;
				default:
					String str = cell.getStringCellValue();
					if (str == null)
						continue;
					str = str.trim();
					if ("".equals(str))
						continue;
					return false;
				}
			}
			return true;
		}
	}

}
