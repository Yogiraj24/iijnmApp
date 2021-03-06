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

public interface ProductservicesDao
{
	/** 
	 * Inserts a new row in the productservices table.
	 */
	public ProductservicesPk insert(Productservices dto) throws ProductservicesDaoException;

	/** 
	 * Updates a single row in the productservices table.
	 */
	public void update(ProductservicesPk pk, Productservices dto) throws ProductservicesDaoException;

	/** 
	 * Deletes a single row in the productservices table.
	 */
	public void delete(ProductservicesPk pk) throws ProductservicesDaoException;

	/** 
	 * Returns the rows from the productservices table that matches the specified primary-key value.
	 */
	public Productservices findByPrimaryKey(ProductservicesPk pk) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'id = :id'.
	 */
	public Productservices findByPrimaryKey(int id) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria ''.
	 */
	public Productservices[] findAll() throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'supplier_id = :supplierId'.
	 */
	public Productservices[] findBySubmissionForm(int supplierId) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'id = :id'.
	 */
	public Productservices[] findWhereIdEquals(int id) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'supplier_id = :supplierId'.
	 */
	public Productservices[] findWhereSupplierIdEquals(int supplierId) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_manufacturing = :isManufacturing'.
	 */
	public Productservices[] findWhereIsManufacturingEquals(String isManufacturing) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_business = :isBusiness'.
	 */
	public Productservices[] findWhereIsBusinessEquals(String isBusiness) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_construction = :isConstruction'.
	 */
	public Productservices[] findWhereIsConstructionEquals(String isConstruction) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_edu = :isEdu'.
	 */
	public Productservices[] findWhereIsEduEquals(String isEdu) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_facility = :isFacility'.
	 */
	public Productservices[] findWhereIsFacilityEquals(String isFacility) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_fanancial = :isFanancial'.
	 */
	public Productservices[] findWhereIsFanancialEquals(String isFanancial) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_food = :isFood'.
	 */
	public Productservices[] findWhereIsFoodEquals(String isFood) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_health = :isHealth'.
	 */
	public Productservices[] findWhereIsHealthEquals(String isHealth) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_itc = :isItc'.
	 */
	public Productservices[] findWhereIsItcEquals(String isItc) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_logistic_service = :isLogisticService'.
	 */
	public Productservices[] findWhereIsLogisticServiceEquals(String isLogisticService) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_marketing = :isMarketing'.
	 */
	public Productservices[] findWhereIsMarketingEquals(String isMarketing) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_realestate = :isRealestate'.
	 */
	public Productservices[] findWhereIsRealestateEquals(String isRealestate) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_recruitment = :isRecruitment'.
	 */
	public Productservices[] findWhereIsRecruitmentEquals(String isRecruitment) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_retail = :isRetail'.
	 */
	public Productservices[] findWhereIsRetailEquals(String isRetail) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_social = :isSocial'.
	 */
	public Productservices[] findWhereIsSocialEquals(String isSocial) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_utilities = :isUtilities'.
	 */
	public Productservices[] findWhereIsUtilitiesEquals(String isUtilities) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_other_business = :isOtherBusiness'.
	 */
	public Productservices[] findWhereIsOtherBusinessEquals(String isOtherBusiness) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_facilities_service = :isFacilitiesService'.
	 */
	public Productservices[] findWhereIsFacilitiesServiceEquals(String isFacilitiesService) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_hardware = :isHardware'.
	 */
	public Productservices[] findWhereIsHardwareEquals(String isHardware) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_logistic = :isLogistic'.
	 */
	public Productservices[] findWhereIsLogisticEquals(String isLogistic) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_marketing_service = :isMarketingService'.
	 */
	public Productservices[] findWhereIsMarketingServiceEquals(String isMarketingService) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_recruitment_hr = :isRecruitmentHr'.
	 */
	public Productservices[] findWhereIsRecruitmentHrEquals(String isRecruitmentHr) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_software = :isSoftware'.
	 */
	public Productservices[] findWhereIsSoftwareEquals(String isSoftware) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_specilist = :isSpecilist'.
	 */
	public Productservices[] findWhereIsSpecilistEquals(String isSpecilist) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_telecom = :isTelecom'.
	 */
	public Productservices[] findWhereIsTelecomEquals(String isTelecom) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_other_services = :isOtherServices'.
	 */
	public Productservices[] findWhereIsOtherServicesEquals(String isOtherServices) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_building_products = :isBuildingProducts'.
	 */
	public Productservices[] findWhereIsBuildingProductsEquals(String isBuildingProducts) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_computer = :isComputer'.
	 */
	public Productservices[] findWhereIsComputerEquals(String isComputer) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_electronic = :isElectronic'.
	 */
	public Productservices[] findWhereIsElectronicEquals(String isElectronic) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_envionmental = :isEnvionmental'.
	 */
	public Productservices[] findWhereIsEnvionmentalEquals(String isEnvionmental) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_furniture = :isFurniture'.
	 */
	public Productservices[] findWhereIsFurnitureEquals(String isFurniture) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_general_1 = :isGeneral1'.
	 */
	public Productservices[] findWhereIsGeneral1Equals(String isGeneral1) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_health_safety_1 = :isHealthSafety1'.
	 */
	public Productservices[] findWhereIsHealthSafety1Equals(String isHealthSafety1) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_it_access = :isItAccess'.
	 */
	public Productservices[] findWhereIsItAccessEquals(String isItAccess) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_laptop = :isLaptop'.
	 */
	public Productservices[] findWhereIsLaptopEquals(String isLaptop) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_mainframe = :isMainframe'.
	 */
	public Productservices[] findWhereIsMainframeEquals(String isMainframe) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_monitors = :isMonitors'.
	 */
	public Productservices[] findWhereIsMonitorsEquals(String isMonitors) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_mobile_tech = :isMobileTech'.
	 */
	public Productservices[] findWhereIsMobileTechEquals(String isMobileTech) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_networking = :isNetworking'.
	 */
	public Productservices[] findWhereIsNetworkingEquals(String isNetworking) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_packaging = :isPackaging'.
	 */
	public Productservices[] findWhereIsPackagingEquals(String isPackaging) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_photocopiers = :isPhotocopiers'.
	 */
	public Productservices[] findWhereIsPhotocopiersEquals(String isPhotocopiers) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_printers = :isPrinters'.
	 */
	public Productservices[] findWhereIsPrintersEquals(String isPrinters) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_printer_ink = :isPrinterInk'.
	 */
	public Productservices[] findWhereIsPrinterInkEquals(String isPrinterInk) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_security_1 = :isSecurity1'.
	 */
	public Productservices[] findWhereIsSecurity1Equals(String isSecurity1) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_scanners = :isScanners'.
	 */
	public Productservices[] findWhereIsScannersEquals(String isScanners) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_softwate_pkg = :isSoftwatePkg'.
	 */
	public Productservices[] findWhereIsSoftwatePkgEquals(String isSoftwatePkg) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_touchpad = :isTouchpad'.
	 */
	public Productservices[] findWhereIsTouchpadEquals(String isTouchpad) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_other_products = :isOtherProducts'.
	 */
	public Productservices[] findWhereIsOtherProductsEquals(String isOtherProducts) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_asset_recovery = :isAssetRecovery'.
	 */
	public Productservices[] findWhereIsAssetRecoveryEquals(String isAssetRecovery) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_con_it = :isConIt'.
	 */
	public Productservices[] findWhereIsConItEquals(String isConIt) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_con_media = :isConMedia'.
	 */
	public Productservices[] findWhereIsConMediaEquals(String isConMedia) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_con_facility = :isConFacility'.
	 */
	public Productservices[] findWhereIsConFacilityEquals(String isConFacility) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_courier = :isCourier'.
	 */
	public Productservices[] findWhereIsCourierEquals(String isCourier) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_facility_mgmt = :isFacilityMgmt'.
	 */
	public Productservices[] findWhereIsFacilityMgmtEquals(String isFacilityMgmt) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_financial_services = :isFinancialServices'.
	 */
	public Productservices[] findWhereIsFinancialServicesEquals(String isFinancialServices) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_health_safety = :isHealthSafety'.
	 */
	public Productservices[] findWhereIsHealthSafetyEquals(String isHealthSafety) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_is_hr = :isIsHr'.
	 */
	public Productservices[] findWhereIsIsHrEquals(String isIsHr) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_frieght = :isFrieght'.
	 */
	public Productservices[] findWhereIsFrieghtEquals(String isFrieght) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_media_marketing = :isMediaMarketing'.
	 */
	public Productservices[] findWhereIsMediaMarketingEquals(String isMediaMarketing) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_network_cabeling = :isNetworkCabeling'.
	 */
	public Productservices[] findWhereIsNetworkCabelingEquals(String isNetworkCabeling) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_printing = :isPrinting'.
	 */
	public Productservices[] findWhereIsPrintingEquals(String isPrinting) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_photograpic = :isPhotograpic'.
	 */
	public Productservices[] findWhereIsPhotograpicEquals(String isPhotograpic) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_reseller = :isReseller'.
	 */
	public Productservices[] findWhereIsResellerEquals(String isReseller) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_security = :isSecurity'.
	 */
	public Productservices[] findWhereIsSecurityEquals(String isSecurity) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_sd_rd = :isSdRd'.
	 */
	public Productservices[] findWhereIsSdRdEquals(String isSdRd) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_ssm = :isSsm'.
	 */
	public Productservices[] findWhereIsSsmEquals(String isSsm) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_tech_services = :isTechServices'.
	 */
	public Productservices[] findWhereIsTechServicesEquals(String isTechServices) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_training_it = :isTrainingIt'.
	 */
	public Productservices[] findWhereIsTrainingItEquals(String isTrainingIt) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_general = :isGeneral'.
	 */
	public Productservices[] findWhereIsGeneralEquals(String isGeneral) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_travel = :isTravel'.
	 */
	public Productservices[] findWhereIsTravelEquals(String isTravel) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_utility_services = :isUtilityServices'.
	 */
	public Productservices[] findWhereIsUtilityServicesEquals(String isUtilityServices) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'is_others_services = :isOthersServices'.
	 */
	public Productservices[] findWhereIsOthersServicesEquals(String isOthersServices) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'date_created = :dateCreated'.
	 */
	public Productservices[] findWhereDateCreatedEquals(Date dateCreated) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the criteria 'date_modified = :dateModified'.
	 */
	public Productservices[] findWhereDateModifiedEquals(Date dateModified) throws ProductservicesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the productservices table that match the specified arbitrary SQL statement
	 */
	public Productservices[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProductservicesDaoException;

	/** 
	 * Returns all rows from the productservices table that match the specified arbitrary SQL statement
	 */
	public Productservices[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProductservicesDaoException;

}
