/**
 * $Id $
 */
package com.hp.supplier.framework;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 */
public class ExcelUtils {
	//private static final Logger log = new Logger(ExcelUtils.class);

	private static final int SHEET_HEADING_ROWNUM = 0;// ROW 1 willbe empty
	private static final int COLUMN_HEADING_ROWNUM = 2;
	private static final int DATA_START_ROWNUM = 3;

	private static final String HEADING_FONT_TYPE = "Arial";

	// List of ExcelSheetDataBeanList

	public void generateExcel(List sheetsDataList, String fileName) {

		if (sheetsDataList == null || sheetsDataList.size() <= 0) {
			System.out.println("ExcelUtils.generateExcel: Data is not provided for the Excel Sheet");
			//log.info("ExcelUtils.generateExcel: Data is not provided for the Excel Sheet");
			return;
		}

		// Create the file that will hold the excel sheet.
		File file = new File(fileName);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("ExcelUtils.generateExcel: File path provided is not correct");
			//log.info("ExcelUtils.generateExcel: File path provided is not correct");
			return;
			// e.printStackTrace();
		}
		generateExcel(sheetsDataList, fos);
	}
	
	public void generateExcel(List sheetsDataList, OutputStream os) {
		System.out.println("Check size of the sheetsDataList :"+sheetsDataList.size());
		//log.debug("Check size of the sheetsDataList :"+sheetsDataList.size());	

		if (sheetsDataList == null || sheetsDataList.size() <= 0) {
			System.out.println("ExcelUtils.generateExcel: Data is not provided for the Excel Sheet");
			//log.info("ExcelUtils.generateExcel: Data is not provided for the Excel Sheet");
			return;
		}

		// Create the workbook
		HSSFWorkbook workbook = new HSSFWorkbook();

		// create the sheets and fill data in each sheet.
		for (int i = 0; i < sheetsDataList.size(); i++) {
			// Get the Sheet data
			ExcelSheetDataBean sheetDataBean = ((ExcelSheetDataBean) (sheetsDataList.get(i)));
			// Get the desired sheet name and create the sheet.
			String sheetName = sheetDataBean.getSheetName();
			HSSFSheet sheet = workbook.createSheet(sheetName);// Create the
			// sheet

			// Find the number of cols to draw heading
			int numColumns = sheetDataBean.getColumnHeadings().size();

			HSSFCellStyle sheetHeadStyle = setSheetHeadingStyle(workbook);
			populateSheetHeading(sheet, sheetDataBean.getSheetHeading(), numColumns, sheetHeadStyle);

			populateData(sheet, sheetDataBean);

		}

		writeWorkbook(workbook, os);

	}


	protected HSSFCellStyle setSheetHeadingStyle(HSSFWorkbook workbook) {
		HSSFCellStyle sheetHeadStyle = workbook.createCellStyle();

		// Setting Sheet Heading Style
		HSSFFont headingFont = workbook.createFont();
		headingFont.setColor((short) 9/* HSSFColor.WHITE */);
		headingFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		// headingFont.setFontHeightInPoints((short)HEADING_FONT_SIZE);
		headingFont.setFontName(HEADING_FONT_TYPE);

		sheetHeadStyle.setFillForegroundColor((short) 12/* HSSFColor.BLUE */);
		sheetHeadStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		sheetHeadStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		sheetHeadStyle.setFont(headingFont);

		return sheetHeadStyle;
	}


	protected void populateData(HSSFSheet sheet, ExcelSheetDataBean sheetDataBean) {

		if (sheetDataBean == null || sheetDataBean.getRowDataBeanList() == null || sheetDataBean.getRowDataBeanList().size() <= 0) {
			System.out.println("ExcelUtils.populateData: Sheet Data is not populated");
			///log.info("ExcelUtils.populateData: Sheet Data is not populated");
			return;
		}

		// Get the first Bean from the list and call populateColumnHeading to
		// create the column headings
		int numOfColumns = populateColumnHeading(sheet, sheetDataBean.getColumnHeadings());
		if (numOfColumns == -1) {
			System.out.println("ExcelUtils.populateData: Columns Heading could not be drawn");
			//log.info("ExcelUtils.populateData: Columns Heading could not be drawn");
			return;
		}

		populateRowData(sheet, sheetDataBean.getRowDataBeanList(), sheetDataBean.getColumnHeadings());
	}

	protected void populateSheetHeading(HSSFSheet sheet, String sheetHeading, int numColumns, HSSFCellStyle sheetHeadingStyle) {

		HSSFRow row = sheet.createRow(SHEET_HEADING_ROWNUM);
		HSSFCell cell = row.createCell((short) 0);
		cell.setCellStyle(sheetHeadingStyle);
		cell.setCellValue(sheetHeading);

		for (short i = 1; i < numColumns; i++) {
			cell = row.createCell(i);
			cell.setCellStyle(sheetHeadingStyle);
		}

		// Create an empty row after the Heading
		row = sheet.createRow(SHEET_HEADING_ROWNUM + 1);
		for (int i = 0; i < numColumns; i++) {
			cell = row.createCell((short) i);
		}
	}

	/**
	 * populate column headings using retrieval of bean field names using
	 * Reflection.
	 * 
	 * @param sheet
	 * @param rowDataObj
	 */
	protected int populateColumnHeading(HSSFSheet sheet, Map columnHeadings) {

		if (columnHeadings == null) {
			System.out.println("ExcelUtils.populateColumnHeading: Data not present for first row");
			//log.info("ExcelUtils.populateColumnHeading: Data not present for first row");
			return -1;
		}

		HSSFRow row = sheet.createRow(COLUMN_HEADING_ROWNUM);

		Iterator headings = columnHeadings.values().iterator();

		int i = 0;
		while (headings.hasNext()) {
			HSSFCell cell = row.createCell((short) i);
			cell.setCellValue((String) headings.next());
			i++;
		}
		return columnHeadings.size();
	}

	protected void populateRowData(HSSFSheet sheet, List rowDataBeanList, Map columnHeadings) {

		int numRows = rowDataBeanList.size();
		int z =0;
		for (int i = 0; i < numRows; i++) {
			HSSFRow row = sheet.createRow((DATA_START_ROWNUM + z) + i);			
			Object rowDataObj = rowDataBeanList.get(i);

			Iterator headings = columnHeadings.keySet().iterator();
			
			int j = 0;
			int counter = 0;
			
			while(headings.hasNext()){
				String eventNames = null;
				String dynaValue = null;				
				String fieldName = (String)headings.next();
				String getMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
				//log.debug("ExcelUtils.populateRowData: method name: " + getMethodName);
				Method method = null;
				try {
					method = rowDataObj.getClass().getMethod(getMethodName, null);
				//	log.debug("ExcelUtils.populateRowData: method name: " + method);
				} catch (SecurityException e) {
					System.out.println(e);
					//log.errorException(e);
				} catch (NoSuchMethodException e) {
					System.out.println(e);
					//log.errorException(e);
				}

				String val = "";
				HSSFCell cell = row.createCell((short) j);			
				try {
					Object obj = method.invoke(rowDataObj, null);
					if (obj instanceof Integer) {
						cell.setCellValue((Integer)obj);
					} else if(obj instanceof Short){
						cell.setCellValue((Short)obj);
					} else if(obj instanceof Float){
						cell.setCellValue((Float)obj);
					} else if(obj instanceof Double){
						cell.setCellValue((Double)obj);
					} else if(obj instanceof Long){
						cell.setCellValue((Long)obj);
					}else if(obj instanceof Date){
						cell.setCellValue((String)PlatformUtil.format((Date)obj, PlatformUtil.DATE_SHORT_TIME));
					}else {
						cell.setCellValue((String)obj);
					}
				} catch (IllegalArgumentException e1) {
					System.out.println(e1);
					//log.errorException(e1);
				} catch (IllegalAccessException e1) {
					System.out.println(e1);
					//log.errorException(e1);
				} catch (InvocationTargetException e1) {
					System.out.println(e1);
					//log.errorException(e1);
				} j++;
				
			}
			z = z+counter;		
		}		
	}

	/**
	 * Write workbook to the OutputStream.
	 */
	protected void writeWorkbook(HSSFWorkbook wb, OutputStream out) {
		try {
			wb.write(out);
			out.flush();
			out.close();
		} catch (IOException ioe) {
			System.out.println("ExcelUtils.generateExcel: File could not be created at provided path");
			//log.info("ExcelUtils.generateExcel: File could not be created at provided path");
			return;
		}
	}


	public static void main(String[] args) {

		// Create the ExcelRowDataBean to hold data for each row of first Sheet.
		ExcelRowDataBean bean1 = new ExcelRowDataBean("Col1", 2);
		ExcelRowDataBean bean2 = new ExcelRowDataBean("Col2", 3);

		// Added the rows in a List. This reprsents one sheet data.
		List sheetDataBeanList = new ArrayList();
		sheetDataBeanList.add(bean1);
		sheetDataBeanList.add(bean2);

		Map columnHeadings = new LinkedHashMap();
		columnHeadings.put("name", "NAAAME");
		//columnHeadings.put("age", "AGEE");

		// Create the work sheet data
		ExcelSheetDataBean sheetDataBean = new ExcelSheetDataBean(sheetDataBeanList, "HEADING", "sheet1", columnHeadings);

		// Creat list of Sheets
		List sheetsDataList = new ArrayList();
		sheetsDataList.add(sheetDataBean);

		ExcelUtils excelUtils = new ExcelUtils();
		excelUtils.generateExcel(sheetsDataList, "c:\\pankaj1.xls");

	}
}
