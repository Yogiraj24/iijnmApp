package com.hp.supplier.logic;

import java.util.ArrayList;
import java.util.List;
import com.hp.supplier.dao.MarketsDao;
import com.hp.supplier.factory.MarketsDaoFactory;
import com.hp.supplier.dao.BusinessInfoDao;
import com.hp.supplier.dao.ProductservicesDao;
import com.hp.supplier.dao.SubmissionFormDao;
import com.hp.supplier.dao.SupplierDetailsDao;
import com.hp.supplier.dto.BusinessInfo;
import com.hp.supplier.dto.Markets;
import com.hp.supplier.dto.MarketsPk;
import com.hp.supplier.dto.BusinessInfoPk;
import com.hp.supplier.dto.Productservices;
import com.hp.supplier.dto.ProductservicesPk;
import com.hp.supplier.dto.SubmissionFormPk;
import com.hp.supplier.dto.SupplierDetails;
import com.hp.supplier.dto.SupplierDetailsPk;
import com.hp.supplier.exceptions.BusinessInfoDaoException;
import com.hp.supplier.exceptions.MarketsDaoException;
import com.hp.supplier.exceptions.ProductservicesDaoException;
import com.hp.supplier.exceptions.SubmissionFormDaoException;
import com.hp.supplier.exceptions.SupplierDetailsDaoException;
import com.hp.supplier.factory.BusinessInfoDaoFactory;
import com.hp.supplier.factory.ProductservicesDaoFactory;
import com.hp.supplier.factory.SubmissionFormDaoFactory;
import com.hp.supplier.factory.SupplierDetailsDaoFactory;
import com.hp.supplier.form.BusinessInfoForm;
import com.hp.supplier.form.MarketInfoForm;
import com.hp.supplier.form.SubmissionForm1;
import com.hp.supplier.dto.SubmissionForm;
import com.hp.supplier.form.SupplierForm;
import com.hp.supplier.form.TypesOfBusinessForm;

public class SupplierLogic {

	public boolean saveSupplier(SupplierForm form) {

		SupplierDetailsDao detailsDao = SupplierDetailsDaoFactory.create();
		SupplierDetails details = new SupplierDetails();

		details.setName(form.getSupplierName());
		details.setContactno(form.getContactNumber());
		details.setAddress(form.getAddress());
		details.setRemarks(form.getRemarks());
		details.setContactPerson(form.getContactPerson());

		try {
			SupplierDetailsPk detailsPk = detailsDao.insert(details);
			if (detailsPk.getId() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SupplierDetailsDaoException e) {
			e.printStackTrace();
		}
		return true;

	}

/*	public List<SupplierDetails> searchSupplierDetails(SupplierForm form) {

		SupplierDetailsDao detailsDao = SupplierDetailsDaoFactory.create();
		SupplierDetails details = new SupplierDetails();
		List<SupplierDetails> list = new ArrayList<SupplierDetails>();
		details.setName(form.getSupplierName());
		details.setN
		try {
			SupplierDetails supplierDetails[] = detailsDao
					.findWhereNameEquals(form.getSupplierName());
			for (int i = 0; i < supplierDetails.length; i++) {
				list.add(supplierDetails[i]);
			}
		} catch (SupplierDetailsDaoException e) {
			e.printStackTrace();
		}

		return list;

	}*/
	
	public List searchSupplierDetails(SubmissionForm1 form) {

		SubmissionFormDao formDao = SubmissionFormDaoFactory.create();
		List<SubmissionForm> list = new ArrayList<SubmissionForm>();
		Object[]sqlParams = new Object[]{form.getOrganization(),form.getContactName(),form.getEmailaddress()};
		try {
			
			SubmissionForm[] submissionForms = 
				formDao.findByDynamicWhere(" organization = ? or contact_name = ? or email_adress like ? ", sqlParams);
			
			for (int i = 0; i < submissionForms.length; i++) {
				
				list.add(submissionForms[i]);
			}
		} catch (SubmissionFormDaoException e) {
			e.printStackTrace();
		}

		return list;

	}

	public boolean submitSupplierDetails(SubmissionForm1 form) {

		SubmissionFormDao formDao = SubmissionFormDaoFactory.create();
		com.hp.supplier.dto.SubmissionForm submissionForm = new com.hp.supplier.dto.SubmissionForm();
		submissionForm.setAutoSign(form.getAuthorizer());
		submissionForm.setOrganization(form.getOrganization());
		submissionForm.setContactName(form.getContactName());
		submissionForm.setContactTitle(form.getContactTitle());
		submissionForm.setEmailAdress(form.getEmailaddress());
		submissionForm.setPhoneNumber(form.getPhoneaddress());

		try {

			SubmissionFormPk formPk = formDao.insert(submissionForm);
			if (formPk.getId() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SubmissionFormDaoException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean submitBizInfoDetails(BusinessInfoForm form) {

		BusinessInfoDao businessInfoDao = BusinessInfoDaoFactory.create();
		BusinessInfo businessInfo = new BusinessInfo();
		businessInfo.setUk(form.getUk());
		businessInfo.setEec(form.getEec());
		businessInfo.setNonEec(form.getNoneec());
		businessInfo.setDisabledPer(form.getDisabled_per());
		businessInfo.setWomenPer(form.getWomen_per());
		businessInfo.setCompanyName(form.getCompany_name());
		businessInfo.setAddressLine1(form.getAddress1());
		businessInfo.setAdderssLine2(form.getAddress2());
		businessInfo.setCity(form.getCity());
		businessInfo.setCountry(form.getCountry());
		businessInfo.setPostalCode(form.getPostalCode());
		businessInfo.setWebSite(form.getWebSite());
		businessInfo.setContactName(form.getContactName());
		businessInfo.setTitle(form.getTitle());
		businessInfo.setPhone(form.getPhone());
		businessInfo.setEmail(form.getEmail());
		// businessInfo.setDunsNumber(Integer.parseInt(form.getDun()));
		businessInfo.setCompanyRegNumber(form.getRegNumber());
		businessInfo.setIsAcademic(form.getAcademic());
		businessInfo.setIsCharity(form.getCharity());
		businessInfo.setOrgEstablished(form.getEstablishedYear());
		businessInfo.setAnnualGross(form.getAnnualGross());
		businessInfo.setNetWorth(form.getNetWorth());
		businessInfo.setIsSingleEmp(form.getSingle());
		businessInfo.setIsMicroEmp(form.getMicro());
		businessInfo.setIsSmallEmp(form.getSmall());
		businessInfo.setIsMediumEmp(form.getMedium());
		businessInfo.setIsLargeEmp(form.getLarge());
		businessInfo.setIsProfitable(form.getProfit());
		businessInfo.setTradeElectronically(form.getTradeEce());
		businessInfo.setBroadBand(form.getBroadband());
		businessInfo.setIsPublicLimited(form.getPvtltd());
		businessInfo.setIsLimited(form.getLimited());
		businessInfo.setSubsidiary(form.getSubsidiary());
		businessInfo.setIsFranchise(form.getFranchise());
		businessInfo.setIsGeneralPartnership(form.getPartnership());
		businessInfo.setIsLimited(form.getLimitedPartner());
		businessInfo.setIsPropritory(form.getSole());
		businessInfo.setIsRegCharity(form.getRegisteredCharity());
		businessInfo.setIsAcademicInstitute(form.getAcademicInstitute());
		businessInfo.setSupplierId(1);

		try {

			BusinessInfoPk formPk = businessInfoDao.insert(businessInfo);
			if (formPk.getId() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (BusinessInfoDaoException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean submitBizTypesDetails(TypesOfBusinessForm form) {
		Productservices productservices = new Productservices();

		productservices.setIsManufacturing(form.getMan());
		productservices.setIsBusiness(form.getBiz());
		productservices.setIsConstruction(form.getConstruction());
		productservices.setIsEdu(form.getEdu());
		productservices.setIsFacilityMgmt(form.getFacilityMgmt());
		productservices.setIsFinancialServices(form.getFinancial());
		productservices.setIsFood(form.getFood());
		productservices.setIsHealth(form.getHealth());
		productservices.setIsItc(form.getItc());
		productservices.setIsLogistic(form.getLogistic());
		productservices.setIsMarketing(form.getMarketing());
		productservices.setIsRealestate(form.getRealEstate());
		productservices.setIsRecruitment(form.getRecruiting());
		productservices.setIsRetail(form.getRetail());
		productservices.setIsSocial(form.getSocialCare());
		productservices.setIsOtherServices(form.getOther1());
		productservices.setIsFacilitiesService(form.getFacilitiesOffice());
		productservices.setIsHardware(form.getHardware());
		productservices.setIsLogistic(form.getLogistic());
		productservices.setIsMarketing(form.getMarketingPrint());
		productservices.setIsRecruitmentHr(form.getRechr());
		productservices.setIsSoftware(form.getSoftware());
		productservices.setIsSpecilist(form.getSpcialist());
		productservices.setIsTelecom(form.getTelecom());
		productservices.setIsOtherProducts(form.getOthers2());
		productservices.setIsUtilityServices(form.getUtilities());
		productservices.setIsBuildingProducts(form.getBizProducts());
		productservices.setIsComputer(form.getComDesktop());
		productservices.setIsElectronic(form.getElectronic());
		productservices.setIsEnvionmental(form.getEnvironmental());
		productservices.setIsFurniture(form.getFurniture());
		productservices.setIsGeneral(form.getGeneralOffice());
		productservices.setIsHealthSafety(form.getHealthSafety());
		productservices.setIsItAccess(form.getItAcess());
		productservices.setIsLaptop(form.getLaptop());
		productservices.setIsMainframe(form.getMainframe());
		productservices.setIsMonitors(form.getMonitor());
		productservices.setIsMobileTech(form.getMobile());
		productservices.setIsNetworkCabeling(form.getNetworkCabeling());
		// productservices.setIsPackaging(form.getp)
		productservices.setIsPhotocopiers(form.getPhotocopiers());
		productservices.setIsPrinters(form.getPrintingServices());
		productservices.setIsPrinterInk(form.getPrintingServices()); // issues
		productservices.setIsSecurity(form.getSecurity());
		productservices.setIsScanners(form.getScanners());
		productservices.setIsSoftwatePkg(form.getSoftwarePkg());
		productservices.setIsTouchpad(form.getTouchpad());
		productservices.setIsOtherBusiness(form.getOthers3());

		productservices.setIsAssetRecovery(form.getAssetRecovery());
		productservices.setIsConIt(form.getConIT());
		productservices.setIsConMedia(form.getConMedia());
		productservices.setIsConFacility(form.getConFacility());
		productservices.setIsCourier(form.getCourier());
		productservices.setIsFacilityMgmt(form.getFacilityMgmt());
		productservices.setIsFinancialServices(form.getFinancialService());
		productservices.setIsHealthSafety(form.getHealthSafety());
		// productservices.setisr
		productservices.setIsFrieght(form.getFreight());
		productservices.setIsMediaMarketing(form.getMediaMarketing());
		productservices.setIsNetworkCabeling(form.getNetworkCabeling1());
		productservices.setIsPrinting(form.getPrintingServices());
		productservices.setIsPhotograpic(form.getPhotographic());
		productservices.setIsReseller(form.getReseller());
		productservices.setIsSecurity1(form.getSecurity1());
		productservices.setIsSdRd(form.getSdrd());
		productservices.setIsSsm(form.getSsm());
		productservices.setIsTechServices(form.getTechnologyService());
		productservices.setIsTrainingIt(form.getTrainingIT());
		productservices.setIsSpecilist(form.getSpcialist());
		productservices.setIsGeneral(form.getGeneralOffice());
		productservices.setIsTravel(form.getTravelService());
		productservices.setIsUtilityServices(form.getUtilities());
		productservices.setIsOthersServices(form.getOthers4());

		productservices.setSupplierId(1);

		ProductservicesDao dao2 = ProductservicesDaoFactory.create();

		ProductservicesPk formPk;
		try {
			formPk = dao2.insert(productservices);
			if (formPk.getId() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (ProductservicesDaoException e) {
			e.printStackTrace();
		}

		return true;
	}

	public boolean submitMarketInfo(MarketInfoForm marketInfoForm) {

		MarketsDao dao = MarketsDaoFactory.create();
		Markets markets = new Markets();
		markets.setEngland(marketInfoForm.getEngland());
		markets.setScotland(marketInfoForm.getScotland());
		markets.setMexico(marketInfoForm.getOthers());
		markets.setSupplierId(1);

		MarketsPk formPk;
		try {
			formPk = dao.insert(markets);

			if (formPk.getId() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (MarketsDaoException e) {
			e.printStackTrace();
		}

		return true;
	}

}
