/**
 * $Id: ExcelSheetDataBean.java 429 2009-02-03 06:54:07Z ram@hpmedia.in $
 */

package com.edu.iijnm.framework;


import java.util.List;
import java.util.Map;

/**
 */
public class ExcelSheetDataBean {

	private List rowDataBeanList = null;
	private String sheetHeading = "";
	private String sheetName = "";

	public List getRowDataBeanList() {
		return rowDataBeanList;
	}

	public String getSheetHeading() {
		return sheetHeading;
	}

	public String getSheetName() {
		return sheetName;
	}

	public Map getColumnHeadings() {
		return columnHeadings;
	}

	private Map columnHeadings = null;

	public ExcelSheetDataBean(List rowDataBeanList, String sheetHeading, String sheetName, Map columnHeadings) {
		System.out.println("rowDataBeanList.size():" + rowDataBeanList.size());
		this.rowDataBeanList = rowDataBeanList;
		this.sheetHeading = sheetHeading;
		this.sheetName = sheetName;
		this.columnHeadings = columnHeadings;
	}
	
	

	
	
}
