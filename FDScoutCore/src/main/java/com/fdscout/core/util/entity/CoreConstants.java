package com.fdscout.core.util.entity;

public class CoreConstants {
	public static final String QUEUE_BENEFIT_INVESTIGATION = "benefitInvestigationQueue";
	public static final String QUEUE_PRIOR_AUTH = "priorAuthQueue";
	public static final String QUEUE_DATA_ENTRY = "dataEntryQueue";
	public static final String QUEUE_DRUG_UTILIZATION_REVIEW = "drugUtilizationReviewQueue";
	public static final String QUEUE_CONSULTATION = "consultationQueue";
	public static final String QUEUE_RX_DISPENSE = "rxDispenseQueue";
	public static final String QUEUE_BENEFIT_COORDINATION = "benefitCoordinationQueue";
	public static final String QUEUE_PACK_SHIP = "packShipQueue";
	public static final String QUEUE_EXCEPTION = "exceptionQueue";
	
	
	public static final int CODE_STATUS_ACTIVE = 1;
	public static final int CODE_STATUS_INACTIVE = 0;
	public static final int CODE_STATUS_CLOSED = 9;
	
	public static final int CODE_STUDENT_CHECKED_IN = 1;
	public static final int CODE_STUDENT_CHECKED_OUT = 7;
	

	public static final int CODE_TAB_MAIN_PAGE = 11;
	
	public static final int CODE_MENU_DASHBOARD = 101;
	public static final int CODE_MENU_SYSTEMSETUP = 102;
	public static final int CODE_MENU_PREFERENCESSETUP = 103;
	
	public static final int CODE_PATIENT_DRUG_PROFILE_STAGING = 0;
	public static final int CODE_PATIENT_DRUG_PROFILE_PENDING = 1;
	public static final int CODE_PATIENT_DRUG_PROFILE_ACTIVE = 2;
	public static final int CODE_PATIENT_DRUG_PROFILE_CANCELLED = 3;
	public static final int CODE_PATIENT_DRUG_PROFILE_DISCONTINUED = 4;

	public static final int CODE_FILL_STATUS_STAGING = 0;
	public static final int CODE_FILL_STATUS_BENEFIT_INVESTIGATION = 5;
	public static final int CODE_FILL_STATUS_PRIOR_AUTHORIZATION = 10;
	public static final int CODE_FILL_STATUS_DATA_ENTRY = 15;
	public static final int CODE_FILL_STATUS_DUR = 20;
	public static final int CODE_FILL_STATUS_CONSULTATION = 25;
	public static final int CODE_FILL_STATUS_DISPENSE = 30;
	public static final int CODE_FILL_STATUS_PACK_SHIP = 40;
	public static final int CODE_FILL_STATUS_CLOSED = 99;
	
	public static final int CODE_PATIENT = 1;
	public static final int CODE_PRESCRIBER = 2;
	public static final int CODE_FILL_PROCESS = 3;
	
	public static final int CODE_YES = 1;
	public static final int CODE_NO = 0;
	
	public static final int CODE_ENTITY_ACCESS_TYPE_EDIT = 1;
	public static final int CODE_ENTITY_ACCESS_TYPE_VIEW = 2;
	

}
