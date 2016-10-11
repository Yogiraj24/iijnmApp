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

public interface SubmissionFormDao
{
	/** 
	 * Inserts a new row in the submission_form table.
	 */
	public SubmissionFormPk insert(SubmissionForm dto) throws SubmissionFormDaoException;

	/** 
	 * Updates a single row in the submission_form table.
	 */
	public void update(SubmissionFormPk pk, SubmissionForm dto) throws SubmissionFormDaoException;

	/** 
	 * Deletes a single row in the submission_form table.
	 */
	public void delete(SubmissionFormPk pk) throws SubmissionFormDaoException;

	/** 
	 * Returns the rows from the submission_form table that matches the specified primary-key value.
	 */
	public SubmissionForm findByPrimaryKey(SubmissionFormPk pk) throws SubmissionFormDaoException;

	/** 
	 * Returns all rows from the submission_form table that match the criteria 'id = :id'.
	 */
	public SubmissionForm findByPrimaryKey(int id) throws SubmissionFormDaoException;

	/** 
	 * Returns all rows from the submission_form table that match the criteria ''.
	 */
	public SubmissionForm[] findAll() throws SubmissionFormDaoException;

	/** 
	 * Returns all rows from the submission_form table that match the criteria 'id = :id'.
	 */
	public SubmissionForm[] findWhereIdEquals(int id) throws SubmissionFormDaoException;

	/** 
	 * Returns all rows from the submission_form table that match the criteria 'auto_sign = :autoSign'.
	 */
	public SubmissionForm[] findWhereAutoSignEquals(String autoSign) throws SubmissionFormDaoException;

	/** 
	 * Returns all rows from the submission_form table that match the criteria 'organization = :organization'.
	 */
	public SubmissionForm[] findWhereOrganizationEquals(String organization) throws SubmissionFormDaoException;

	/** 
	 * Returns all rows from the submission_form table that match the criteria 'contact_name = :contactName'.
	 */
	public SubmissionForm[] findWhereContactNameEquals(String contactName) throws SubmissionFormDaoException;

	/** 
	 * Returns all rows from the submission_form table that match the criteria 'contact_title = :contactTitle'.
	 */
	public SubmissionForm[] findWhereContactTitleEquals(String contactTitle) throws SubmissionFormDaoException;

	/** 
	 * Returns all rows from the submission_form table that match the criteria 'email_adress = :emailAdress'.
	 */
	public SubmissionForm[] findWhereEmailAdressEquals(String emailAdress) throws SubmissionFormDaoException;

	/** 
	 * Returns all rows from the submission_form table that match the criteria 'phone_number = :phoneNumber'.
	 */
	public SubmissionForm[] findWherePhoneNumberEquals(String phoneNumber) throws SubmissionFormDaoException;

	/** 
	 * Returns all rows from the submission_form table that match the criteria 'date_created = :dateCreated'.
	 */
	public SubmissionForm[] findWhereDateCreatedEquals(Date dateCreated) throws SubmissionFormDaoException;

	/** 
	 * Returns all rows from the submission_form table that match the criteria 'date_modifed = :dateModifed'.
	 */
	public SubmissionForm[] findWhereDateModifedEquals(Date dateModifed) throws SubmissionFormDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the submission_form table that match the specified arbitrary SQL statement
	 */
	public SubmissionForm[] findByDynamicSelect(String sql, Object[] sqlParams) throws SubmissionFormDaoException;

	/** 
	 * Returns all rows from the submission_form table that match the specified arbitrary SQL statement
	 */
	public SubmissionForm[] findByDynamicWhere(String sql, Object[] sqlParams) throws SubmissionFormDaoException;

}