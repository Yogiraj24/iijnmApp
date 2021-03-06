/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.hp.supplier.dao;

import java.util.Date;
import com.hp.supplier.dto.*;
import com.hp.supplier.exceptions.*;

public interface MarketsDao
{
	/** 
	 * Inserts a new row in the markets table.
	 */
	public MarketsPk insert(Markets dto) throws MarketsDaoException;

	/** 
	 * Updates a single row in the markets table.
	 */
	public void update(MarketsPk pk, Markets dto) throws MarketsDaoException;

	/** 
	 * Deletes a single row in the markets table.
	 */
	public void delete(MarketsPk pk) throws MarketsDaoException;

	/** 
	 * Returns the rows from the markets table that matches the specified primary-key value.
	 */
	public Markets findByPrimaryKey(MarketsPk pk) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'id = :id'.
	 */
	public Markets findByPrimaryKey(int id) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria ''.
	 */
	public Markets[] findAll() throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'supplier_id = :supplierId'.
	 */
	public Markets[] findBySubmissionForm(int supplierId) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'id = :id'.
	 */
	public Markets[] findWhereIdEquals(int id) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'supplier_id = :supplierId'.
	 */
	public Markets[] findWhereSupplierIdEquals(int supplierId) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'england = :england'.
	 */
	public Markets[] findWhereEnglandEquals(String england) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'northen_ireland = :northenIreland'.
	 */
	public Markets[] findWhereNorthenIrelandEquals(String northenIreland) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'scotland = :scotland'.
	 */
	public Markets[] findWhereScotlandEquals(String scotland) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'wales = :wales'.
	 */
	public Markets[] findWhereWalesEquals(String wales) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'africa = :africa'.
	 */
	public Markets[] findWhereAfricaEquals(String africa) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'asia_pacific = :asiaPacific'.
	 */
	public Markets[] findWhereAsiaPacificEquals(String asiaPacific) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'australia = :australia'.
	 */
	public Markets[] findWhereAustraliaEquals(String australia) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'canada = :canada'.
	 */
	public Markets[] findWhereCanadaEquals(String canada) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'europe = :europe'.
	 */
	public Markets[] findWhereEuropeEquals(String europe) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'latin_america = :latinAmerica'.
	 */
	public Markets[] findWhereLatinAmericaEquals(String latinAmerica) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'mexico = :mexico'.
	 */
	public Markets[] findWhereMexicoEquals(String mexico) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'united_stated = :unitedStated'.
	 */
	public Markets[] findWhereUnitedStatedEquals(String unitedStated) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'date_created = :dateCreated'.
	 */
	public Markets[] findWhereDateCreatedEquals(Date dateCreated) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the criteria 'date_modification = :dateModification'.
	 */
	public Markets[] findWhereDateModificationEquals(Date dateModification) throws MarketsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the markets table that match the specified arbitrary SQL statement
	 */
	public Markets[] findByDynamicSelect(String sql, Object[] sqlParams) throws MarketsDaoException;

	/** 
	 * Returns all rows from the markets table that match the specified arbitrary SQL statement
	 */
	public Markets[] findByDynamicWhere(String sql, Object[] sqlParams) throws MarketsDaoException;

}
