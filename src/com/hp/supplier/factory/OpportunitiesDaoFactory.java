/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.hp.supplier.factory;

import java.sql.Connection;
import com.hp.supplier.dao.*;
import com.hp.supplier.jdbc.*;

public class OpportunitiesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return OpportunitiesDao
	 */
	public static OpportunitiesDao create()
	{
		return new OpportunitiesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return OpportunitiesDao
	 */
	public static OpportunitiesDao create(Connection conn)
	{
		return new OpportunitiesDaoImpl( conn );
	}

}
