/*
 * Created on Jan 31, 2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.hp.supplier.framework;

/**
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ExcelRowDataBean {

	private String name;
	private int age;
	
	/*
	private String colName="";
	//private String colType= We will take string to start with
	private List colValues=null;
	
	public ExcelBean(String colName, List colValues){
		this.colName = colName;
		this.colValues = colValues;
	}
	*/
	public ExcelRowDataBean(String name, int age){
		this.name = name;
		this.age = age;
	}

	/**
	 * @return Returns the age.
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age The age to set.
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}
}
