/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.hp.supplier.jdbc;

import com.hp.supplier.dao.*;
import com.hp.supplier.factory.*;
import java.util.Date;
import com.hp.supplier.dto.*;
import com.hp.supplier.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class MarketsDaoImpl extends AbstractDAO implements MarketsDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT id, supplier_id, england, northen_ireland, scotland, wales, africa, asia_pacific, australia, canada, europe, latin_america, mexico, united_stated, date_created, date_modification FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id, supplier_id, england, northen_ireland, scotland, wales, africa, asia_pacific, australia, canada, europe, latin_america, mexico, united_stated, date_created, date_modification ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id = ?, supplier_id = ?, england = ?, northen_ireland = ?, scotland = ?, wales = ?, africa = ?, asia_pacific = ?, australia = ?, canada = ?, europe = ?, latin_america = ?, mexico = ?, united_stated = ?, date_created = ?, date_modification = ? WHERE id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id = ?";

	/** 
	 * Index of column id
	 */
	protected static final int COLUMN_ID = 1;

	/** 
	 * Index of column supplier_id
	 */
	protected static final int COLUMN_SUPPLIER_ID = 2;

	/** 
	 * Index of column england
	 */
	protected static final int COLUMN_ENGLAND = 3;

	/** 
	 * Index of column northen_ireland
	 */
	protected static final int COLUMN_NORTHEN_IRELAND = 4;

	/** 
	 * Index of column scotland
	 */
	protected static final int COLUMN_SCOTLAND = 5;

	/** 
	 * Index of column wales
	 */
	protected static final int COLUMN_WALES = 6;

	/** 
	 * Index of column africa
	 */
	protected static final int COLUMN_AFRICA = 7;

	/** 
	 * Index of column asia_pacific
	 */
	protected static final int COLUMN_ASIA_PACIFIC = 8;

	/** 
	 * Index of column australia
	 */
	protected static final int COLUMN_AUSTRALIA = 9;

	/** 
	 * Index of column canada
	 */
	protected static final int COLUMN_CANADA = 10;

	/** 
	 * Index of column europe
	 */
	protected static final int COLUMN_EUROPE = 11;

	/** 
	 * Index of column latin_america
	 */
	protected static final int COLUMN_LATIN_AMERICA = 12;

	/** 
	 * Index of column mexico
	 */
	protected static final int COLUMN_MEXICO = 13;

	/** 
	 * Index of column united_stated
	 */
	protected static final int COLUMN_UNITED_STATED = 14;

	/** 
	 * Index of column date_created
	 */
	protected static final int COLUMN_DATE_CREATED = 15;

	/** 
	 * Index of column date_modification
	 */
	protected static final int COLUMN_DATE_MODIFICATION = 16;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 16;

	/** 
	 * Index of primary-key column id
	 */
	protected static final int PK_COLUMN_ID = 1;

	/** 
	 * Inserts a new row in the markets table.
	 */
	public MarketsPk insert(Markets dto) throws MarketsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isSupplierIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "supplier_id" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isEnglandModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "england" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNorthenIrelandModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "northen_ireland" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isScotlandModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "scotland" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isWalesModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "wales" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isAfricaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "africa" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isAsiaPacificModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "asia_pacific" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isAustraliaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "australia" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCanadaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "canada" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isEuropeModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "europe" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isLatinAmericaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "latin_america" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMexicoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "mexico" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isUnitedStatedModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "united_stated" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDateCreatedModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "date_created" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDateModificationModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "date_modification" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdModified()) {
				stmt.setInt( index++, dto.getId() );
			}
		
			if (dto.isSupplierIdModified()) {
				stmt.setInt( index++, dto.getSupplierId() );
			}
		
			if (dto.isEnglandModified()) {
				stmt.setString( index++, dto.getEngland() );
			}
		
			if (dto.isNorthenIrelandModified()) {
				stmt.setString( index++, dto.getNorthenIreland() );
			}
		
			if (dto.isScotlandModified()) {
				stmt.setString( index++, dto.getScotland() );
			}
		
			if (dto.isWalesModified()) {
				stmt.setString( index++, dto.getWales() );
			}
		
			if (dto.isAfricaModified()) {
				stmt.setString( index++, dto.getAfrica() );
			}
		
			if (dto.isAsiaPacificModified()) {
				stmt.setString( index++, dto.getAsiaPacific() );
			}
		
			if (dto.isAustraliaModified()) {
				stmt.setString( index++, dto.getAustralia() );
			}
		
			if (dto.isCanadaModified()) {
				stmt.setString( index++, dto.getCanada() );
			}
		
			if (dto.isEuropeModified()) {
				stmt.setString( index++, dto.getEurope() );
			}
		
			if (dto.isLatinAmericaModified()) {
				stmt.setString( index++, dto.getLatinAmerica() );
			}
		
			if (dto.isMexicoModified()) {
				stmt.setString( index++, dto.getMexico() );
			}
		
			if (dto.isUnitedStatedModified()) {
				stmt.setString( index++, dto.getUnitedStated() );
			}
		
			if (dto.isDateCreatedModified()) {
				stmt.setTimestamp(index++, dto.getDateCreated()==null ? null : new java.sql.Timestamp( dto.getDateCreated().getTime() ) );
			}
		
			if (dto.isDateModificationModified()) {
				stmt.setTimestamp(index++, dto.getDateModification()==null ? null : new java.sql.Timestamp( dto.getDateModification().getTime() ) );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MarketsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the markets table.
	 */
	public void update(MarketsPk pk, Markets dto) throws MarketsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id=?" );
				modified=true;
			}
		
			if (dto.isSupplierIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "supplier_id=?" );
				modified=true;
			}
		
			if (dto.isEnglandModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "england=?" );
				modified=true;
			}
		
			if (dto.isNorthenIrelandModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "northen_ireland=?" );
				modified=true;
			}
		
			if (dto.isScotlandModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "scotland=?" );
				modified=true;
			}
		
			if (dto.isWalesModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "wales=?" );
				modified=true;
			}
		
			if (dto.isAfricaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "africa=?" );
				modified=true;
			}
		
			if (dto.isAsiaPacificModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "asia_pacific=?" );
				modified=true;
			}
		
			if (dto.isAustraliaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "australia=?" );
				modified=true;
			}
		
			if (dto.isCanadaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "canada=?" );
				modified=true;
			}
		
			if (dto.isEuropeModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "europe=?" );
				modified=true;
			}
		
			if (dto.isLatinAmericaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "latin_america=?" );
				modified=true;
			}
		
			if (dto.isMexicoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "mexico=?" );
				modified=true;
			}
		
			if (dto.isUnitedStatedModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "united_stated=?" );
				modified=true;
			}
		
			if (dto.isDateCreatedModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "date_created=?" );
				modified=true;
			}
		
			if (dto.isDateModificationModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "date_modification=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdModified()) {
				stmt.setInt( index++, dto.getId() );
			}
		
			if (dto.isSupplierIdModified()) {
				stmt.setInt( index++, dto.getSupplierId() );
			}
		
			if (dto.isEnglandModified()) {
				stmt.setString( index++, dto.getEngland() );
			}
		
			if (dto.isNorthenIrelandModified()) {
				stmt.setString( index++, dto.getNorthenIreland() );
			}
		
			if (dto.isScotlandModified()) {
				stmt.setString( index++, dto.getScotland() );
			}
		
			if (dto.isWalesModified()) {
				stmt.setString( index++, dto.getWales() );
			}
		
			if (dto.isAfricaModified()) {
				stmt.setString( index++, dto.getAfrica() );
			}
		
			if (dto.isAsiaPacificModified()) {
				stmt.setString( index++, dto.getAsiaPacific() );
			}
		
			if (dto.isAustraliaModified()) {
				stmt.setString( index++, dto.getAustralia() );
			}
		
			if (dto.isCanadaModified()) {
				stmt.setString( index++, dto.getCanada() );
			}
		
			if (dto.isEuropeModified()) {
				stmt.setString( index++, dto.getEurope() );
			}
		
			if (dto.isLatinAmericaModified()) {
				stmt.setString( index++, dto.getLatinAmerica() );
			}
		
			if (dto.isMexicoModified()) {
				stmt.setString( index++, dto.getMexico() );
			}
		
			if (dto.isUnitedStatedModified()) {
				stmt.setString( index++, dto.getUnitedStated() );
			}
		
			if (dto.isDateCreatedModified()) {
				stmt.setTimestamp(index++, dto.getDateCreated()==null ? null : new java.sql.Timestamp( dto.getDateCreated().getTime() ) );
			}
		
			if (dto.isDateModificationModified()) {
				stmt.setTimestamp(index++, dto.getDateModification()==null ? null : new java.sql.Timestamp( dto.getDateModification().getTime() ) );
			}
		
			stmt.setInt( index++, pk.getId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MarketsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the markets table.
	 */
	public void delete(MarketsPk pk) throws MarketsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MarketsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the markets table that matches the specified primary-key value.
	 */
	public Markets findByPrimaryKey(MarketsPk pk) throws MarketsDaoException
	{
		return findByPrimaryKey( pk.getId() );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'id = :id'.
	 */
	public Markets findByPrimaryKey(int id) throws MarketsDaoException
	{
		Markets ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id = ?", new Object[] {  new Integer(id) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the markets table that match the criteria ''.
	 */
	public Markets[] findAll() throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id", null );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'supplier_id = :supplierId'.
	 */
	public Markets[] findBySubmissionForm(int supplierId) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE supplier_id = ?", new Object[] {  new Integer(supplierId) } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'id = :id'.
	 */
	public Markets[] findWhereIdEquals(int id) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id = ? ORDER BY id", new Object[] {  new Integer(id) } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'supplier_id = :supplierId'.
	 */
	public Markets[] findWhereSupplierIdEquals(int supplierId) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE supplier_id = ? ORDER BY supplier_id", new Object[] {  new Integer(supplierId) } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'england = :england'.
	 */
	public Markets[] findWhereEnglandEquals(String england) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE england = ? ORDER BY england", new Object[] { england } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'northen_ireland = :northenIreland'.
	 */
	public Markets[] findWhereNorthenIrelandEquals(String northenIreland) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE northen_ireland = ? ORDER BY northen_ireland", new Object[] { northenIreland } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'scotland = :scotland'.
	 */
	public Markets[] findWhereScotlandEquals(String scotland) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE scotland = ? ORDER BY scotland", new Object[] { scotland } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'wales = :wales'.
	 */
	public Markets[] findWhereWalesEquals(String wales) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE wales = ? ORDER BY wales", new Object[] { wales } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'africa = :africa'.
	 */
	public Markets[] findWhereAfricaEquals(String africa) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE africa = ? ORDER BY africa", new Object[] { africa } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'asia_pacific = :asiaPacific'.
	 */
	public Markets[] findWhereAsiaPacificEquals(String asiaPacific) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE asia_pacific = ? ORDER BY asia_pacific", new Object[] { asiaPacific } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'australia = :australia'.
	 */
	public Markets[] findWhereAustraliaEquals(String australia) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE australia = ? ORDER BY australia", new Object[] { australia } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'canada = :canada'.
	 */
	public Markets[] findWhereCanadaEquals(String canada) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE canada = ? ORDER BY canada", new Object[] { canada } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'europe = :europe'.
	 */
	public Markets[] findWhereEuropeEquals(String europe) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE europe = ? ORDER BY europe", new Object[] { europe } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'latin_america = :latinAmerica'.
	 */
	public Markets[] findWhereLatinAmericaEquals(String latinAmerica) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE latin_america = ? ORDER BY latin_america", new Object[] { latinAmerica } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'mexico = :mexico'.
	 */
	public Markets[] findWhereMexicoEquals(String mexico) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE mexico = ? ORDER BY mexico", new Object[] { mexico } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'united_stated = :unitedStated'.
	 */
	public Markets[] findWhereUnitedStatedEquals(String unitedStated) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE united_stated = ? ORDER BY united_stated", new Object[] { unitedStated } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'date_created = :dateCreated'.
	 */
	public Markets[] findWhereDateCreatedEquals(Date dateCreated) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE date_created = ? ORDER BY date_created", new Object[] { dateCreated==null ? null : new java.sql.Timestamp( dateCreated.getTime() ) } );
	}

	/** 
	 * Returns all rows from the markets table that match the criteria 'date_modification = :dateModification'.
	 */
	public Markets[] findWhereDateModificationEquals(Date dateModification) throws MarketsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE date_modification = ? ORDER BY date_modification", new Object[] { dateModification==null ? null : new java.sql.Timestamp( dateModification.getTime() ) } );
	}

	/**
	 * Method 'MarketsDaoImpl'
	 * 
	 */
	public MarketsDaoImpl()
	{
	}

	/**
	 * Method 'MarketsDaoImpl'
	 * 
	 * @param userConn
	 */
	public MarketsDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "supplierdb.markets";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Markets fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Markets dto = new Markets();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Markets[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Markets dto = new Markets();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Markets ret[] = new Markets[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Markets dto, ResultSet rs) throws SQLException
	{
		dto.setId( rs.getInt( COLUMN_ID ) );
		dto.setSupplierId( rs.getInt( COLUMN_SUPPLIER_ID ) );
		dto.setEngland( rs.getString( COLUMN_ENGLAND ) );
		dto.setNorthenIreland( rs.getString( COLUMN_NORTHEN_IRELAND ) );
		dto.setScotland( rs.getString( COLUMN_SCOTLAND ) );
		dto.setWales( rs.getString( COLUMN_WALES ) );
		dto.setAfrica( rs.getString( COLUMN_AFRICA ) );
		dto.setAsiaPacific( rs.getString( COLUMN_ASIA_PACIFIC ) );
		dto.setAustralia( rs.getString( COLUMN_AUSTRALIA ) );
		dto.setCanada( rs.getString( COLUMN_CANADA ) );
		dto.setEurope( rs.getString( COLUMN_EUROPE ) );
		dto.setLatinAmerica( rs.getString( COLUMN_LATIN_AMERICA ) );
		dto.setMexico( rs.getString( COLUMN_MEXICO ) );
		dto.setUnitedStated( rs.getString( COLUMN_UNITED_STATED ) );
		dto.setDateCreated( rs.getTimestamp(COLUMN_DATE_CREATED ) );
		dto.setDateModification( rs.getTimestamp(COLUMN_DATE_MODIFICATION ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Markets dto)
	{
		dto.setIdModified( false );
		dto.setSupplierIdModified( false );
		dto.setEnglandModified( false );
		dto.setNorthenIrelandModified( false );
		dto.setScotlandModified( false );
		dto.setWalesModified( false );
		dto.setAfricaModified( false );
		dto.setAsiaPacificModified( false );
		dto.setAustraliaModified( false );
		dto.setCanadaModified( false );
		dto.setEuropeModified( false );
		dto.setLatinAmericaModified( false );
		dto.setMexicoModified( false );
		dto.setUnitedStatedModified( false );
		dto.setDateCreatedModified( false );
		dto.setDateModificationModified( false );
	}

	/** 
	 * Returns all rows from the markets table that match the specified arbitrary SQL statement
	 */
	public Markets[] findByDynamicSelect(String sql, Object[] sqlParams) throws MarketsDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MarketsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the markets table that match the specified arbitrary SQL statement
	 */
	public Markets[] findByDynamicWhere(String sql, Object[] sqlParams) throws MarketsDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MarketsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
