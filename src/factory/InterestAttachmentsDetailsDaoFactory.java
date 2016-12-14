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

public class InterestAttachmentsDetailsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return InterestAttachmentsDetailsDao
	 */
	public static InterestAttachmentsDetailsDao create()
	{
		return new InterestAttachmentsDetailsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return InterestAttachmentsDetailsDao
	 */
	public static InterestAttachmentsDetailsDao create(Connection conn)
	{
		return new InterestAttachmentsDetailsDaoImpl( conn );
	}

}
