/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.edu.iijnm.jdbc;

import com.edu.iijnm.dao.*;
import com.edu.iijnm.factory.*;
import java.util.Date;
import com.edu.iijnm.dto.*;
import com.edu.iijnm.exceptions.*;
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

public class InterestAttachmentsDetailsDaoImpl extends AbstractDAO implements InterestAttachmentsDetailsDao
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
	protected final String SQL_SELECT = "SELECT id, student_id, accomplishments, special_skills, hobbies, other_interests, upload_reference, academic_certificates, supporting_docs, upload_essay, how_iijnm, created_date, modified_date FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id, student_id, accomplishments, special_skills, hobbies, other_interests, upload_reference, academic_certificates, supporting_docs, upload_essay, how_iijnm, created_date, modified_date ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id = ?, student_id = ?, accomplishments = ?, special_skills = ?, hobbies = ?, other_interests = ?, upload_reference = ?, academic_certificates = ?, supporting_docs = ?, upload_essay = ?, how_iijnm = ?, created_date = ?, modified_date = ? WHERE id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id = ?";

	/** 
	 * Index of column id
	 */
	protected static final int COLUMN_ID = 1;

	/** 
	 * Index of column student_id
	 */
	protected static final int COLUMN_STUDENT_ID = 2;

	/** 
	 * Index of column accomplishments
	 */
	protected static final int COLUMN_ACCOMPLISHMENTS = 3;

	/** 
	 * Index of column special_skills
	 */
	protected static final int COLUMN_SPECIAL_SKILLS = 4;

	/** 
	 * Index of column hobbies
	 */
	protected static final int COLUMN_HOBBIES = 5;

	/** 
	 * Index of column other_interests
	 */
	protected static final int COLUMN_OTHER_INTERESTS = 6;

	/** 
	 * Index of column upload_reference
	 */
	protected static final int COLUMN_UPLOAD_REFERENCE = 7;

	/** 
	 * Index of column academic_certificates
	 */
	protected static final int COLUMN_ACADEMIC_CERTIFICATES = 8;

	/** 
	 * Index of column supporting_docs
	 */
	protected static final int COLUMN_SUPPORTING_DOCS = 9;

	/** 
	 * Index of column upload_essay
	 */
	protected static final int COLUMN_UPLOAD_ESSAY = 10;

	/** 
	 * Index of column how_iijnm
	 */
	protected static final int COLUMN_HOW_IIJNM = 11;

	/** 
	 * Index of column created_date
	 */
	protected static final int COLUMN_CREATED_DATE = 12;

	/** 
	 * Index of column modified_date
	 */
	protected static final int COLUMN_MODIFIED_DATE = 13;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 13;

	/** 
	 * Index of primary-key column id
	 */
	protected static final int PK_COLUMN_ID = 1;

	/** 
	 * Inserts a new row in the interest_attachments_details table.
	 */
	public InterestAttachmentsDetailsPk insert(InterestAttachmentsDetails dto) throws InterestAttachmentsDetailsDaoException
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
		
			if (dto.isStudentIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "student_id" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isAccomplishmentsModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "accomplishments" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isSpecialSkillsModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "special_skills" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isHobbiesModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "hobbies" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isOtherInterestsModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "other_interests" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isUploadReferenceModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "upload_reference" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isAcademicCertificatesModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "academic_certificates" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isSupportingDocsModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "supporting_docs" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isUploadEssayModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "upload_essay" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isHowIijnmModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "how_iijnm" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCreatedDateModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "created_date" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isModifiedDateModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "modified_date" );
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
		
			if (dto.isStudentIdModified()) {
				if (dto.isStudentIdNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getStudentId() );
				}
		
			}
		
			if (dto.isAccomplishmentsModified()) {
				stmt.setString( index++, dto.getAccomplishments() );
			}
		
			if (dto.isSpecialSkillsModified()) {
				stmt.setString( index++, dto.getSpecialSkills() );
			}
		
			if (dto.isHobbiesModified()) {
				stmt.setString( index++, dto.getHobbies() );
			}
		
			if (dto.isOtherInterestsModified()) {
				stmt.setString( index++, dto.getOtherInterests() );
			}
		
			if (dto.isUploadReferenceModified()) {
				super.setBlobColumn(stmt, index++, dto.getUploadReference() );
			}
		
			if (dto.isAcademicCertificatesModified()) {
				super.setBlobColumn(stmt, index++, dto.getAcademicCertificates() );
			}
		
			if (dto.isSupportingDocsModified()) {
				super.setBlobColumn(stmt, index++, dto.getSupportingDocs() );
			}
		
			if (dto.isUploadEssayModified()) {
				super.setBlobColumn(stmt, index++, dto.getUploadEssay() );
			}
		
			if (dto.isHowIijnmModified()) {
				stmt.setString( index++, dto.getHowIijnm() );
			}
		
			if (dto.isCreatedDateModified()) {
				stmt.setTimestamp(index++, dto.getCreatedDate()==null ? null : new java.sql.Timestamp( dto.getCreatedDate().getTime() ) );
			}
		
			if (dto.isModifiedDateModified()) {
				stmt.setTimestamp(index++, dto.getModifiedDate()==null ? null : new java.sql.Timestamp( dto.getModifiedDate().getTime() ) );
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
			throw new InterestAttachmentsDetailsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the interest_attachments_details table.
	 */
	public void update(InterestAttachmentsDetailsPk pk, InterestAttachmentsDetails dto) throws InterestAttachmentsDetailsDaoException
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
		
			if (dto.isStudentIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "student_id=?" );
				modified=true;
			}
		
			if (dto.isAccomplishmentsModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "accomplishments=?" );
				modified=true;
			}
		
			if (dto.isSpecialSkillsModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "special_skills=?" );
				modified=true;
			}
		
			if (dto.isHobbiesModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "hobbies=?" );
				modified=true;
			}
		
			if (dto.isOtherInterestsModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "other_interests=?" );
				modified=true;
			}
		
			if (dto.isUploadReferenceModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "upload_reference=?" );
				modified=true;
			}
		
			if (dto.isAcademicCertificatesModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "academic_certificates=?" );
				modified=true;
			}
		
			if (dto.isSupportingDocsModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "supporting_docs=?" );
				modified=true;
			}
		
			if (dto.isUploadEssayModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "upload_essay=?" );
				modified=true;
			}
		
			if (dto.isHowIijnmModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "how_iijnm=?" );
				modified=true;
			}
		
			if (dto.isCreatedDateModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "created_date=?" );
				modified=true;
			}
		
			if (dto.isModifiedDateModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "modified_date=?" );
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
		
			if (dto.isStudentIdModified()) {
				if (dto.isStudentIdNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getStudentId() );
				}
		
			}
		
			if (dto.isAccomplishmentsModified()) {
				stmt.setString( index++, dto.getAccomplishments() );
			}
		
			if (dto.isSpecialSkillsModified()) {
				stmt.setString( index++, dto.getSpecialSkills() );
			}
		
			if (dto.isHobbiesModified()) {
				stmt.setString( index++, dto.getHobbies() );
			}
		
			if (dto.isOtherInterestsModified()) {
				stmt.setString( index++, dto.getOtherInterests() );
			}
		
			if (dto.isUploadReferenceModified()) {
				super.setBlobColumn(stmt, index++, dto.getUploadReference() );
			}
		
			if (dto.isAcademicCertificatesModified()) {
				super.setBlobColumn(stmt, index++, dto.getAcademicCertificates() );
			}
		
			if (dto.isSupportingDocsModified()) {
				super.setBlobColumn(stmt, index++, dto.getSupportingDocs() );
			}
		
			if (dto.isUploadEssayModified()) {
				super.setBlobColumn(stmt, index++, dto.getUploadEssay() );
			}
		
			if (dto.isHowIijnmModified()) {
				stmt.setString( index++, dto.getHowIijnm() );
			}
		
			if (dto.isCreatedDateModified()) {
				stmt.setTimestamp(index++, dto.getCreatedDate()==null ? null : new java.sql.Timestamp( dto.getCreatedDate().getTime() ) );
			}
		
			if (dto.isModifiedDateModified()) {
				stmt.setTimestamp(index++, dto.getModifiedDate()==null ? null : new java.sql.Timestamp( dto.getModifiedDate().getTime() ) );
			}
		
			stmt.setInt( index++, pk.getId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new InterestAttachmentsDetailsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the interest_attachments_details table.
	 */
	public void delete(InterestAttachmentsDetailsPk pk) throws InterestAttachmentsDetailsDaoException
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
			throw new InterestAttachmentsDetailsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the interest_attachments_details table that matches the specified primary-key value.
	 */
	public InterestAttachmentsDetails findByPrimaryKey(InterestAttachmentsDetailsPk pk) throws InterestAttachmentsDetailsDaoException
	{
		return findByPrimaryKey( pk.getId() );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'id = :id'.
	 */
	public InterestAttachmentsDetails findByPrimaryKey(int id) throws InterestAttachmentsDetailsDaoException
	{
		InterestAttachmentsDetails ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id = ?", new Object[] {  new Integer(id) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria ''.
	 */
	public InterestAttachmentsDetails[] findAll() throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id", null );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'student_id = :studentId'.
	 */
	public InterestAttachmentsDetails[] findByPersonalDetails(int studentId) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE student_id = ?", new Object[] {  new Integer(studentId) } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'id = :id'.
	 */
	public InterestAttachmentsDetails[] findWhereIdEquals(int id) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id = ? ORDER BY id", new Object[] {  new Integer(id) } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'student_id = :studentId'.
	 */
	public InterestAttachmentsDetails[] findWhereStudentIdEquals(int studentId) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE student_id = ? ORDER BY student_id", new Object[] {  new Integer(studentId) } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'accomplishments = :accomplishments'.
	 */
	public InterestAttachmentsDetails[] findWhereAccomplishmentsEquals(String accomplishments) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE accomplishments = ? ORDER BY accomplishments", new Object[] { accomplishments } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'special_skills = :specialSkills'.
	 */
	public InterestAttachmentsDetails[] findWhereSpecialSkillsEquals(String specialSkills) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE special_skills = ? ORDER BY special_skills", new Object[] { specialSkills } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'hobbies = :hobbies'.
	 */
	public InterestAttachmentsDetails[] findWhereHobbiesEquals(String hobbies) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE hobbies = ? ORDER BY hobbies", new Object[] { hobbies } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'other_interests = :otherInterests'.
	 */
	public InterestAttachmentsDetails[] findWhereOtherInterestsEquals(String otherInterests) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE other_interests = ? ORDER BY other_interests", new Object[] { otherInterests } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'upload_reference = :uploadReference'.
	 */
	public InterestAttachmentsDetails[] findWhereUploadReferenceEquals(byte[] uploadReference) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE upload_reference = ? ORDER BY upload_reference", new Object[] { uploadReference } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'academic_certificates = :academicCertificates'.
	 */
	public InterestAttachmentsDetails[] findWhereAcademicCertificatesEquals(byte[] academicCertificates) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE academic_certificates = ? ORDER BY academic_certificates", new Object[] { academicCertificates } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'supporting_docs = :supportingDocs'.
	 */
	public InterestAttachmentsDetails[] findWhereSupportingDocsEquals(byte[] supportingDocs) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE supporting_docs = ? ORDER BY supporting_docs", new Object[] { supportingDocs } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'upload_essay = :uploadEssay'.
	 */
	public InterestAttachmentsDetails[] findWhereUploadEssayEquals(byte[] uploadEssay) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE upload_essay = ? ORDER BY upload_essay", new Object[] { uploadEssay } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'how_iijnm = :howIijnm'.
	 */
	public InterestAttachmentsDetails[] findWhereHowIijnmEquals(String howIijnm) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE how_iijnm = ? ORDER BY how_iijnm", new Object[] { howIijnm } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'created_date = :createdDate'.
	 */
	public InterestAttachmentsDetails[] findWhereCreatedDateEquals(Date createdDate) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE created_date = ? ORDER BY created_date", new Object[] { createdDate==null ? null : new java.sql.Timestamp( createdDate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the criteria 'modified_date = :modifiedDate'.
	 */
	public InterestAttachmentsDetails[] findWhereModifiedDateEquals(Date modifiedDate) throws InterestAttachmentsDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE modified_date = ? ORDER BY modified_date", new Object[] { modifiedDate==null ? null : new java.sql.Timestamp( modifiedDate.getTime() ) } );
	}

	/**
	 * Method 'InterestAttachmentsDetailsDaoImpl'
	 * 
	 */
	public InterestAttachmentsDetailsDaoImpl()
	{
	}

	/**
	 * Method 'InterestAttachmentsDetailsDaoImpl'
	 * 
	 * @param userConn
	 */
	public InterestAttachmentsDetailsDaoImpl(final java.sql.Connection userConn)
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
		return "iijnmdb.interest_attachments_details";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected InterestAttachmentsDetails fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			InterestAttachmentsDetails dto = new InterestAttachmentsDetails();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected InterestAttachmentsDetails[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			InterestAttachmentsDetails dto = new InterestAttachmentsDetails();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		InterestAttachmentsDetails ret[] = new InterestAttachmentsDetails[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(InterestAttachmentsDetails dto, ResultSet rs) throws SQLException
	{
		dto.setId( rs.getInt( COLUMN_ID ) );
		dto.setStudentId( rs.getInt( COLUMN_STUDENT_ID ) );
		if (rs.wasNull()) {
			dto.setStudentIdNull( true );
		}
		
		dto.setAccomplishments( rs.getString( COLUMN_ACCOMPLISHMENTS ) );
		dto.setSpecialSkills( rs.getString( COLUMN_SPECIAL_SKILLS ) );
		dto.setHobbies( rs.getString( COLUMN_HOBBIES ) );
		dto.setOtherInterests( rs.getString( COLUMN_OTHER_INTERESTS ) );
		dto.setUploadReference( super.getBlobColumn(rs, COLUMN_UPLOAD_REFERENCE ) );
		dto.setAcademicCertificates( super.getBlobColumn(rs, COLUMN_ACADEMIC_CERTIFICATES ) );
		dto.setSupportingDocs( super.getBlobColumn(rs, COLUMN_SUPPORTING_DOCS ) );
		dto.setUploadEssay( super.getBlobColumn(rs, COLUMN_UPLOAD_ESSAY ) );
		dto.setHowIijnm( rs.getString( COLUMN_HOW_IIJNM ) );
		dto.setCreatedDate( rs.getTimestamp(COLUMN_CREATED_DATE ) );
		dto.setModifiedDate( rs.getTimestamp(COLUMN_MODIFIED_DATE ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(InterestAttachmentsDetails dto)
	{
		dto.setIdModified( false );
		dto.setStudentIdModified( false );
		dto.setAccomplishmentsModified( false );
		dto.setSpecialSkillsModified( false );
		dto.setHobbiesModified( false );
		dto.setOtherInterestsModified( false );
		dto.setUploadReferenceModified( false );
		dto.setAcademicCertificatesModified( false );
		dto.setSupportingDocsModified( false );
		dto.setUploadEssayModified( false );
		dto.setHowIijnmModified( false );
		dto.setCreatedDateModified( false );
		dto.setModifiedDateModified( false );
	}

	/** 
	 * Returns all rows from the interest_attachments_details table that match the specified arbitrary SQL statement
	 */
	public InterestAttachmentsDetails[] findByDynamicSelect(String sql, Object[] sqlParams) throws InterestAttachmentsDetailsDaoException
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
			throw new InterestAttachmentsDetailsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the interest_attachments_details table that match the specified arbitrary SQL statement
	 */
	public InterestAttachmentsDetails[] findByDynamicWhere(String sql, Object[] sqlParams) throws InterestAttachmentsDetailsDaoException
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
			throw new InterestAttachmentsDetailsDaoException( "Exception: " + _e.getMessage(), _e );
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