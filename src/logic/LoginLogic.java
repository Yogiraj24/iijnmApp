package com.edu.iijnm.logic;

import com.edu.iijnm.dao.LoginDetailsDao;
import com.edu.iijnm.dao.PersonalDetailsDao;
import com.edu.iijnm.dto.LoginDetails;
import com.edu.iijnm.dto.LoginDetailsPk;
import com.edu.iijnm.dto.PersonalDetails;
import com.edu.iijnm.dto.PersonalDetailsPk;
import com.edu.iijnm.exceptions.LoginDetailsDaoException;
import com.edu.iijnm.exceptions.PersonalDetailsDaoException;
import com.edu.iijnm.factory.LoginDetailsDaoFactory;
import com.edu.iijnm.factory.PersonalDetailsDaoFactory;
import com.edu.iijnm.form.SignForm;

public class LoginLogic {

	public boolean registration(SignForm signForm) {

		PersonalDetailsDao personalDetailsDao = PersonalDetailsDaoFactory.create();
		PersonalDetails personalDetails = new PersonalDetails();

		personalDetails.setFullName(signForm.getFullname());
		personalDetails.setMobileNumber(signForm.getPhonenumber());
		personalDetails.setEmailId(signForm.getEmail());

		try {
			PersonalDetailsPk detailsPk = personalDetailsDao.insert(personalDetails);
			if (detailsPk.getId() > 0) {
				LoginDetailsDao detailsDao = LoginDetailsDaoFactory.create();
				LoginDetails details = new LoginDetails();
				details.setPassword(signForm.getPassword());
				details.setUsername(signForm.getEmail());
				try {
					LoginDetailsPk detailsPk2 = detailsDao.insert(details);
				} catch (LoginDetailsDaoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			} else {
				return false;
			}
		} catch (PersonalDetailsDaoException e) {
			e.printStackTrace();
		}
		return false;

	}

}
