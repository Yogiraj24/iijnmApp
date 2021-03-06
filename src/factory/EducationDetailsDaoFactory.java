/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.edu.iijnm.factory;

import java.sql.Connection;
import com.edu.iijnm.dao.*;
import com.edu.iijnm.jdbc.*;

public class EducationDetailsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return EducationDetailsDao
	 */
	public static EducationDetailsDao create()
	{
		return new EducationDetailsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return EducationDetailsDao
	 */
	public static EducationDetailsDao create(Connection conn)
	{
		return new EducationDetailsDaoImpl( conn );
	}

}
