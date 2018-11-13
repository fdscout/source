use fdscout;

create table ps_data_dictionary (
	table_nm		varchar(100),		-- 64 chars max.
    column_nm		varchar(100),		-- 64 chars max.
    data_type		varchar(30),
    data_value		varchar(200),
    description		varchar(200)
) ENGINE=InnoDB;


    create table fdscoutc_dev.fds_address(
       address_id INT not null auto_increment,
       street_1 VARCHAR(80),
       street_2 VARCHAR(80),
       city VARCHAR(50),
       state VARCHAR(20),
       country VARCHAR(20),
       postal_cd VARCHAR(20),
       create_time TIMESTAMP default CURRENT_TIMESTAMP not null,
       primary key (address_id)
    );
    create unique index PRIMARY on fdscoutc_dev.fds_address(address_id);

drop table fds_meta_data;
    create table fds_meta_data(
       meta_data_id INT not null auto_increment,
       last_update_dt DATETIME,
       terms VARCHAR(50),
       results_skip MEDIUMINT,
       results_total MEDIUMINT,
       results_limit MEDIUMINT,
       license VARCHAR(50),
       disclaimer VARCHAR(500),
       create_time TIMESTAMP default CURRENT_TIMESTAMP not null,
       primary key (meta_data_id)
    );
    ALTER TABLE fdscoutc_dev.fds_meta_data AUTO_INCREMENT=1101;


	create table fdscoutc_dev.fds_portal_access_log (
		 log_id				int NOT NULL AUTO_INCREMENT,
		 ip_address			varchar(50) not null,
		 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
		 PRIMARY KEY (log_id)
	) ENGINE=InnoDB;         
	ALTER TABLE fds_portal_access_log AUTO_INCREMENT=1;
	
















CREATE TABLE ps_user (
     user_id		INT NOT NULL AUTO_INCREMENT,
     first_nm 		varchar(50) not null,
     middle_nm 		varchar(50),
     last_nm 		varchar(50) not null,
     gender			char not null,
     user_nm 		varchar(50) not null comment 'always email as user name',
     password 		varchar(200) not null,  
     email		    varchar(100) not null,
 	 status_cd		tinyint not null comment '0 - inactive, 1 - active, 3 - due for email verification, 7 - reset required at next login, ',
	 create_user_id int not null,
	 update_user_id int,
	 create_time 	DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 	DATETIME ON UPDATE CURRENT_TIMESTAMP,
     PRIMARY KEY (user_id)
) ENGINE=InnoDB;
ALTER TABLE ps_user AUTO_INCREMENT=1101;


CREATE TABLE ps_user_hist (
     user_id		INT NOT NULL,
     first_nm 		varchar(50) not null,
     middle_nm 		varchar(50),
     last_nm 		varchar(50) not null,
     gender			char not null,
     user_nm 		varchar(50) not null comment 'always email as user name',
     password 		varchar(200) not null,  
     email		    varchar(100) not null,
 	 status_cd		tinyint not null comment '0 - inactive, 1 - active, 7 - reset required at next login',
	 create_user_id int not null,
	 update_user_id int,
	 create_time 	DATETIME,
	 update_time 	DATETIME,
	 trigger_type	tinyint not null comment '1- insert, 2 - update,  3 - delete', 
	 trigger_time 	DATETIME DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB;

create table ps_user_session (
	 user_id			int not null,
     session_id			varchar(50) not null,
	 last_req_time 		DATETIME,
     last_proc_time		datetime,
     status_cd			tinyint default 1,
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (user_id) REFERENCES ps_user(user_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         






create table presphere.ps_property (
	 property_id 	smallint NOT NULL,
	 property_nm	varchar(80) NOT NULL,
 	 status_cd		tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id int not null,
	 update_user_id int,
	 create_time 	DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 	DATETIME ON UPDATE CURRENT_TIMESTAMP,
     CONSTRAINT unq_prop_name UNIQUE (property_nm),
     PRIMARY KEY (property_id)
) ENGINE=InnoDB;
ALTER TABLE presphere.ps_property AUTO_INCREMENT=1001;

create table presphere.ps_property_value (
	 property_value_id 	smallint PRIMARY KEY NOT NULL AUTO_INCREMENT,
     property_id		smallint NOT NULL,
     value_cd			tinyint not null,
	 value_short_de		varchar(30) NOT NULL,
	 value_long_de		varchar(100) NOT NULL,
	 disp_order_cd		tinyint NOT NULL,	
     status_cd		tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id int not null,
	 update_user_id int,
	 create_time 	DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 	DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (property_id) REFERENCES ps_property(property_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     CONSTRAINT unq_prop_cd UNIQUE (property_id, value_cd)
) ENGINE=InnoDB;
ALTER TABLE presphere.ps_property_value AUTO_INCREMENT=1001;


create table presphere.ps_address (
	 address_id 	int primary key NOT NULL AUTO_INCREMENT,
	 type_cd		tinyint not null default 0 comment '0 - residental, 1 - work, 2 - business, 3 - pharmacy, 99 - other',
     attn			varchar(50),
	 company_nm		varchar(100),
     street_line_1	varchar(120) not null,
     street_line_2	varchar(120),
     city			varchar(50) not null,
     state_cd		varchar(2) not null,
     zip			varchar(5) not null,
     zip_ext		varchar(4),
 	 status_cd		tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id int not null,
	 update_user_id int,
	 create_time 	DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 	DATETIME ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;
ALTER TABLE ps_address AUTO_INCREMENT=1001;

-- alter table presphere.ps_address modify status_cd tinyint not null default 1;

create table ps_organization (
	 organization_id	int primary key NOT NULL AUTO_INCREMENT,
	 organization_nm	varchar(50) not null,
	 tax_id				varchar(30),
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;         
ALTER TABLE ps_organization AUTO_INCREMENT=1001;


create table ps_pharmacy (
	 pharmacy_id	int primary key NOT NULL AUTO_INCREMENT,
     organization_id int not null,
	 pharmacy_nm	varchar(50) not null,
	 type_cd		tinyint not null,
 	 status_cd			tinyint not null comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (organization_id) REFERENCES ps_organization(organization_id) ON UPDATE CASCADE ON DELETE RESTRICT
     
) ENGINE=InnoDB;         
ALTER TABLE ps_pharmacy AUTO_INCREMENT=1001;


create table ps_pharmacy_user_xref (
	 pharmacy_id	int not null,
     user_id		int not null,
 	 status_cd			tinyint not null comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (pharmacy_id) REFERENCES ps_pharmacy(pharmacy_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     FOREIGN KEY (user_id) REFERENCES ps_user(user_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
   

create table ps_user_role (
	 user_role_id		int not null primary key AUTO_INCREMENT,
     role_cd			varchar(10) not null,
     role_de			varchar(50) not null,
 	 status_cd			tinyint not null comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
	CONSTRAINT unq_role_cd UNIQUE (role_cd)
) ENGINE=InnoDB;         
ALTER TABLE ps_user_role AUTO_INCREMENT=1001;

create table ps_user_role_xref (
     user_id			int not null,
	 user_role_id		int not null,
 	 status_cd			tinyint not null comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (user_id) REFERENCES ps_user(user_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     FOREIGN KEY (user_role_id) REFERENCES ps_user_role(user_role_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         

create table ps_menu_tab (
	 menu_tab_id		int not null PRIMARY KEY AUTO_INCREMENT,
     menu_label			varchar(30) not null,
     group_cd			tinyint not null,
     parent_id			smallint not null default 0,
     url				varchar(250) not null,
     sub_menu_cd		smallint not null default 0,
     disp_order_cd		smallint not null,
 	 status_cd			tinyint not null comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;         
ALTER TABLE ps_menu_tab AUTO_INCREMENT=1001;

create table ps_menu_role_xref (
     menu_tab_id		int not null,
	 user_role_id		int not null,
 	 status_cd			tinyint not null comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (menu_tab_id) REFERENCES ps_menu_tab(menu_tab_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     FOREIGN KEY (user_role_id) REFERENCES ps_user_role(user_role_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     CONSTRAINT unq_menu_role UNIQUE (menu_tab_id, user_role_id)
) ENGINE=InnoDB;         


use presphere;
create table ps_staff_timeoff (
	 staff_timeoff_id		int not null PRIMARY KEY AUTO_INCREMENT,
     user_id				int not null,
     leave_dt				date not null,
     return_dt				date not null,
     note_txt				varchar(100) not null,
     approver_user_id		int default 0,
     approve_time			DATETIME DEFAULT null,
 	 status_cd				tinyint not null comment '0 - inactive, 1 - active, 3 - pending for approval',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (user_id) REFERENCES ps_user(user_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE ps_menu_tab AUTO_INCREMENT=1001;

-- drop table presphere.ps_staff_timeoff;
-- use presphere;
-- insert into presphere.ps_staff_timeoff (user_id, leave_dt, return_dt, note_txt, status_cd, create_user_id)
-- values (1, str_to_date("09/05/2017","%m/%d/%Y"), str_to_date("09/08/2017","%m/%d/%Y"), 'why I need time off', 3, 1);
-- select * from presphere.ps_staff_timeoff;

create table presphere.ps_disease_state (
	 disease_state_id	int not null PRIMARY KEY AUTO_INCREMENT,
     state_nm			varchar(100),
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_disease_state AUTO_INCREMENT=1001;


create table presphere.ps_drug (
	 drug_id			int not null PRIMARY KEY AUTO_INCREMENT,
     generic_nm			varchar(50),
     chemical_nm		varchar(100),
     disease_state_id	int,
	 rems_fl			tinyint,
     pregnancy_stp_fl	tinyint,
     refillable_fl		tinyint,
     dflt_refill_ct		tinyint default 5,
	 normal_days_supply tinyint default 30,
 	 status_cd				tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     foreign key (disease_state_id) references presphere.ps_disease_state(disease_state_id) on update cascade on delete restrict,
	CONSTRAINT unq_drug_logic_cd UNIQUE (generic_nm)
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_drug AUTO_INCREMENT=1001;



create table presphere.ps_drug_org_xref (
	 drug_id			int not null PRIMARY KEY AUTO_INCREMENT,
     organization_id	int not null,
   
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     foreign key (organization_id) references presphere.ps_organization(organization_id) on update cascade on delete restrict,
     foreign key (drug_id) references presphere.ps_drug(drug_id) on update cascade on delete restrict,
     CONSTRAINT unq_drug_org_xref UNIQUE (drug_id, organization_id)
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_drug_org_xref AUTO_INCREMENT=1001;


use presphere;
create table presphere.ps_patient (
	 patient_id		int not null PRIMARY KEY AUTO_INCREMENT,
     first_nm		varchar(50) not null,
     middle_nm		varchar(50),
     last_nm		varchar(50) not null,
     gender			varchar(1) not null,
     dob			date not null,
 	 status_cd				tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_patient AUTO_INCREMENT=1001;



create table presphere.ps_patient_pref (
	 patinet_id		int not null PRIMARY KEY,
 	 status_cd				tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_patient AUTO_INCREMENT=1001;


create table presphere.ps_patient_view_hist (
	 patient_id		int not null,
	 user_id			int not null,
 	 status_cd				tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
     foreign key (patient_id) references presphere.ps_patient(patient_id) on update cascade on delete restrict,
     foreign key (user_id) references presphere.ps_user(user_id) on update cascade on delete restrict,
	 CONSTRAINT unq_pt_vw UNIQUE (patient_id, user_id, create_time)
) ENGINE=InnoDB;         

use presphere;
create table ps_patient_org_xref (
	 patient_id			int not null,
     organization_id	int not null,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (patient_id) REFERENCES ps_patient(patient_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     FOREIGN KEY (organization_id) REFERENCES ps_organization(organization_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     CONSTRAINT unq_pt_org_xref UNIQUE (patient_id, organization_id)
) ENGINE=InnoDB;         
   
use presphere;
create table presphere.ps_phone (
	 phone_id			int not null PRIMARY KEY AUTO_INCREMENT,
     type_cd			smallint not null,
     ph_number			varchar(10) not null,
     extention			varchar(7),
     cell_fl			smallint not null,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_phone AUTO_INCREMENT=1001;


use presphere;
create table presphere.ps_patient_phone_xref (
	 patient_phone_xref_id int not null PRIMARY KEY AUTO_INCREMENT,
	 patient_id			int not null,
	 phone_id			int not null,
     preferred_fl		smallint not null,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (patient_id) REFERENCES ps_patient(patient_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     FOREIGN KEY (phone_id) REFERENCES ps_phone(phone_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_patient_phone_xref AUTO_INCREMENT=1001;




use presphere;
create table presphere.ps_patient_phone_xref (
	 patient_phone_xref_id int not null PRIMARY KEY AUTO_INCREMENT,
	 patient_id			int not null,
	 phone_id			int not null,
     preferred_fl		smallint not null,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (patient_id) REFERENCES ps_patient(patient_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     FOREIGN KEY (phone_id) REFERENCES ps_phone(phone_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_patient_phone_xref AUTO_INCREMENT=1001;


use presphere;
create table presphere.ps_prescriber (
	 prescriber_id		int not null PRIMARY KEY AUTO_INCREMENT,
     first_nm		varchar(50) not null,
     middle_nm		varchar(50),
     last_nm		varchar(50) not null,
 	 status_cd				tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_prescriber AUTO_INCREMENT=1001;


drop  table presphere.ps_patient_drug_profile;
create table presphere.ps_patient_drug_profile (
	 patient_drug_profile_id int not null PRIMARY KEY AUTO_INCREMENT,
	 patient_id			int not null,
	 drug_id			int not null,
     program_id			varchar(30),
     type_cd			tinyint default 0,
     ini_enroll_dt		date,
     re_enroll_dt		date,
     icd_cd				varchar(20),
	 icd_code_id		int,
     enroll_pvdr_id		int default null,
     prscrb_pvdr_id		int default null,
     risk_type_cd		tinyint default 0,
     pri_payer_id		int default 0,
     sec_payer_id		int default 0,
	 pbm_id				int default 0,
     insure_rel_cd		tinyint default 0,
     next_ship_due_dt	date,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (patient_id) REFERENCES ps_patient(patient_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     FOREIGN KEY (drug_id) REFERENCES ps_drug(drug_id) ON UPDATE CASCADE ON DELETE RESTRICT,
	 FOREIGN KEY (icd_code_id) REFERENCES ps_icd_code(icd_code_id) ON UPDATE CASCADE ON DELETE RESTRICT,
	 FOREIGN KEY (enroll_pvdr_id) REFERENCES ps_prescriber(prescriber_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     FOREIGN KEY (prscrb_pvdr_id) REFERENCES ps_prescriber(prescriber_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_patient_drug_profile AUTO_INCREMENT=1001;


drop table presphere.ps_patient_drug_profile_def;
create table presphere.ps_patient_drug_profile_def (
	 patient_drug_profile_def_id 			int not null PRIMARY KEY AUTO_INCREMENT,
	 drug_id			int not null,
     program_id			tinyint not null default 0,
     type_cd			tinyint not null default 0,
     ini_enroll_dt		tinyint not null default 0,
     re_enroll_dt		tinyint not null default 0,
     icd_cd				tinyint not null default 0,
     enroll_pvdr_id		tinyint not null default 0,
     prscrb_pvdr_id		tinyint not null default 0,
     risk_type_cd		tinyint not null default 0,
     pri_payer_id		tinyint not null default 0,
     sec_payer_id		tinyint not null default 0,
     insure_rel_cd		tinyint not null default 0,
     next_ship_due_dt	tinyint not null default 0,
     pbm_id				tinyint not null default 0,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (drug_id) REFERENCES ps_drug(drug_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         


use presphere;
drop table ps_drug_org_xref;
drop table ps_drug;
create table presphere.ps_drug (
	 drug_id int not null PRIMARY KEY AUTO_INCREMENT,
	 generic_nm			varchar(50) not null,
     chemical_nm 		varchar(100) DEFAULT NULL,
	 logic_cd			varchar(20) not null,
     rems_fl			tinyint default 0,
     refillable_fl		tinyint default 0,
     formulary_fl		tinyint default 0,
     disease_state_id	int not null,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (disease_state_id) REFERENCES ps_disease_state(disease_state_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_drug AUTO_INCREMENT=1001;


drop TABLE ps_drug_org_xref;
CREATE TABLE ps_drug_org_xref (
	  drug_org_xref_id 	int not null primary key auto_increment,
	  drug_id 			int NOT NULL,
	  organization_id 	int NOT NULL,
	  status_cd 		tinyint(4) NOT NULL DEFAULT 1 COMMENT '0 - inactive, 1 - active',
	  create_user_id 	int NOT NULL,
	  update_user_id 	int DEFAULT NULL,
	  create_time 		datetime DEFAULT CURRENT_TIMESTAMP,
	  update_time 		datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
	  UNIQUE KEY unq_drug_org_xref (drug_id,organization_id),
	  CONSTRAINT ps_drug_org_xref_ibfk_1 FOREIGN KEY (organization_id) REFERENCES ps_organization (organization_id) ON UPDATE CASCADE,
	  CONSTRAINT ps_drug_org_xref_ibfk_2 FOREIGN KEY (drug_id) REFERENCES ps_drug (drug_id) ON UPDATE CASCADE
) ENGINE=InnoDB;



use presphere;
create table presphere.ps_prescriber_phone_xref (
	 prescriber_phone_xref_id int not null PRIMARY KEY AUTO_INCREMENT,
	 prescriber_id			int not null,
	 phone_id			int not null,
     preferred_fl		smallint not null,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (prescriber_id) REFERENCES ps_prescriber(prescriber_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     FOREIGN KEY (phone_id) REFERENCES ps_phone(phone_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_prescriber_phone_xref AUTO_INCREMENT=1001;

create table presphere.ps_prescriber_view_hist (
	 prescriber_id		int not null,
	 user_id			int not null,
 	 status_cd				tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
     foreign key (prescriber_id) references presphere.ps_prescriber(prescriber_id) on update cascade on delete restrict,
     foreign key (user_id) references presphere.ps_user(user_id) on update cascade on delete restrict,
	 CONSTRAINT unq_prscbr_vw UNIQUE (prescriber_id, user_id, create_time)
) ENGINE=InnoDB;   

drop TABLE ps_risk_type ;
CREATE TABLE ps_risk_type (
	  risk_type_id	 	int not null primary key auto_increment,
	  drug_id 			int NOT NULL,
      gender			char(1),
      risk_type_cd		tinyint(4) not null,
	  risk_type_abbr 	varchar(20) NOT NULL,
      risk_type_de		varchar(120) NOT NULL,
	  type_level_cd		tinyint(4) not null comment '1 - top level, 2 - sub level',
	  sub_type_fl		tinyint(4) not null default 0 comment '0 - no sub type, 1 - sub type exists',
	  super_type_cd		tinyint(4) not null default 0 comment 'super type code',		
	  status_cd 		tinyint(4) NOT NULL DEFAULT 1 COMMENT '0 - inactive, 1 - active',
	  create_user_id 	int NOT NULL,
	  update_user_id 	int DEFAULT NULL,
	  create_time 		datetime DEFAULT CURRENT_TIMESTAMP,
	  update_time 		datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
	  UNIQUE KEY unq_rt_drug_cd_xref (drug_id, gender, risk_type_cd, risk_type_abbr),
	  CONSTRAINT ps_fk_rt_drug_id FOREIGN KEY (drug_id) REFERENCES ps_drug (drug_id) ON UPDATE CASCADE
) ENGINE=InnoDB;
ALTER TABLE presphere.ps_risk_type AUTO_INCREMENT=1001;


CREATE TABLE presphere.ps_icd_code (
	  icd_code_id	 	int not null primary key auto_increment,
	  icd_code 			varchar(15) NOT NULL,
	  diagnosis_cd		varchar(15),
      diagnosis_de		varchar(150) NOT NULL,
	  status_cd 		tinyint(4) NOT NULL DEFAULT 1 COMMENT '0 - inactive, 1 - active',
	  create_user_id 	int NOT NULL,
	  update_user_id 	int DEFAULT NULL,
	  create_time 		datetime DEFAULT CURRENT_TIMESTAMP,
	  update_time 		datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
	  UNIQUE KEY unq_icd_code (icd_code)
) ENGINE=InnoDB;
ALTER TABLE presphere.ps_icd_code AUTO_INCREMENT=1001;


CREATE TABLE presphere.ps_drug_icd_xref (
	  icd_code_id	 	int not null,
	  drug_id 			int NOT NULL,
	  status_cd 		tinyint(4) NOT NULL DEFAULT 1 COMMENT '0 - inactive, 1 - active',
	  create_user_id 	int NOT NULL,
	  update_user_id 	int DEFAULT NULL,
	  create_time 		datetime DEFAULT CURRENT_TIMESTAMP,
	  update_time 		datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
	  UNIQUE KEY unq_drug_icd_code (icd_code_id, drug_id),
	  CONSTRAINT ps_fk_dix_drug_id FOREIGN KEY (drug_id) REFERENCES ps_drug (drug_id) ON UPDATE CASCADE,
	  CONSTRAINT ps_fk_dix_icd_id FOREIGN KEY (icd_code_id) REFERENCES ps_icd_code (icd_code_id) ON UPDATE CASCADE
) ENGINE=InnoDB;








CREATE TABLE ps_browser_config (
  config_id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) DEFAULT NULL,
  min_version varchar(20) DEFAULT NULL,
  max_version varchar(20) NOT NULL,
  status_cd tinyint(1) DEFAULT '1',
  UNIQUE KEY unq_browser_config (name,min_version,max_version),
  PRIMARY KEY (config_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ps_user_device (
  user_device_id int(11) NOT NULL AUTO_INCREMENT,
  user_id int(11) DEFAULT NULL,
  device_ip varchar(20) DEFAULT NULL,					
  device_type varchar(30) DEFAULT NULL,
  os varchar(20) DEFAULT NULL,
  otp varchar(120) DEFAULT NULL,					
  status_cd tinyint(4) DEFAULT '1',
  create_datetime datetime DEFAULT CURRENT_TIMESTAMP,
  update_datetime datetime DEFAULT CURRENT_TIMESTAMP,
   PRIMARY KEY (user_device_id),
   CONSTRAINT ps_fk_user_device_user_id FOREIGN KEY (user_id) REFERENCES ps_user (user_id) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

use presphere;
drop table presphere.ps_payer;
create table presphere.ps_payer (
	 payer_id 			int not null PRIMARY KEY AUTO_INCREMENT,
	 payer_nm			varchar(50) not null,
	 phone_id			int not null,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (phone_id) REFERENCES ps_phone(phone_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_payer AUTO_INCREMENT=1001;

use presphere;
drop TABLE ps_drug_payer_xref;
CREATE TABLE ps_drug_payer_xref (
	  drug_payer_xref_id 	int not null primary key auto_increment,
	  drug_id 			int NOT NULL,
	  payer_id 	int NOT NULL,
	  status_cd 		tinyint(4) NOT NULL DEFAULT 1 COMMENT '0 - inactive, 1 - active',
	  create_user_id 	int NOT NULL,
	  update_user_id 	int DEFAULT NULL,
	  create_time 		datetime DEFAULT CURRENT_TIMESTAMP,
	  update_time 		datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
	  UNIQUE KEY unq_drug_org_xref (drug_id,payer_id),
	  CONSTRAINT ps_drug_payer_xref_ibfk_1 FOREIGN KEY (payer_id) REFERENCES ps_payer (payer_id) ON UPDATE CASCADE,
	  CONSTRAINT ps_drug_payer_xref_ibfk_2 FOREIGN KEY (drug_id) REFERENCES ps_drug (drug_id) ON UPDATE CASCADE
) ENGINE=InnoDB;
ALTER TABLE presphere.ps_drug_payer_xref AUTO_INCREMENT=1001;

use presphere;
drop table presphere.ps_pbm;
create table presphere.ps_pbm (
	 pbm_id 			int not null PRIMARY KEY AUTO_INCREMENT,
	 pbm_nm			varchar(50) not null,
	 phone_id			int not null,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (phone_id) REFERENCES ps_phone(phone_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_pbm AUTO_INCREMENT=1001;

use presphere;
drop TABLE ps_drug_pbm_xref;
CREATE TABLE ps_drug_pbm_xref (
	  drug_pbm_xref_id 	int not null primary key auto_increment,
	  drug_id 			int NOT NULL,
	  pbm_id 	int NOT NULL,
	  status_cd 		tinyint(4) NOT NULL DEFAULT 1 COMMENT '0 - inactive, 1 - active',
	  create_user_id 	int NOT NULL,
	  update_user_id 	int DEFAULT NULL,
	  create_time 		datetime DEFAULT CURRENT_TIMESTAMP,
	  update_time 		datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
	  UNIQUE KEY unq_drug_org_xref (drug_id,pbm_id),
	  CONSTRAINT ps_drug_pbm_xref_ibfk_1 FOREIGN KEY (pbm_id) REFERENCES ps_pbm (pbm_id) ON UPDATE CASCADE,
	  CONSTRAINT ps_drug_pbm_xref_ibfk_2 FOREIGN KEY (drug_id) REFERENCES ps_drug (drug_id) ON UPDATE CASCADE
) ENGINE=InnoDB;
ALTER TABLE presphere.ps_drug_pbm_xref AUTO_INCREMENT=1001;


use presphere;
drop table presphere.ps_patient_drug_profile_payer_xref;
create table presphere.ps_patient_drug_profile_payer_xref (
	 payer_id 					int not null,
	 patient_drug_profile_id	int not null,
	 policy_holder_nm	varchar(50),
	 policy_nr			varchar(30),
	 group_nr			varchar(30),
	 bin_nr				varchar(30),
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (patient_drug_profile_id) REFERENCES ps_patient_drug_profile(patient_drug_profile_id) ON UPDATE CASCADE ON DELETE RESTRICT,
	FOREIGN KEY (payer_id) REFERENCES ps_payer(payer_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_patient_drug_profile_payer_xref AUTO_INCREMENT=1001;


use presphere;
create table presphere.ps_patient_address_xref (
	 patient_address_xref_id int not null PRIMARY KEY AUTO_INCREMENT,
	 patient_id			int not null,
	 address_id			int not null,
     preferred_fl		smallint not null,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (patient_id) REFERENCES ps_patient(patient_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     FOREIGN KEY (address_id) REFERENCES ps_address(address_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_patient_address_xref AUTO_INCREMENT=1001;


create table presphere.ps_prescriber_drug_profile (
	 prescriber_drug_profile_id int not null PRIMARY KEY AUTO_INCREMENT,
	 prescriber_id			int not null,
	 drug_id			int not null,
     program_id			varchar(30),
     enroll_dt			date,
	 certificate_dt		date,
	 renewal_due_dt		date,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (prescriber_id) REFERENCES ps_prescriber(prescriber_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     FOREIGN KEY (drug_id) REFERENCES ps_drug(drug_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_prescriber_drug_profile AUTO_INCREMENT=1001;


create table presphere.ps_prescriber_drug_profile_def (
	 prescriber_drug_profile_def_id 			int not null PRIMARY KEY AUTO_INCREMENT,
	 drug_id			int not null,
     program_id			tinyint not null default 0,
     enroll_dt			tinyint not null default 0,
     certificate_dt		tinyint not null default 0,
     re_enroll_dt		tinyint not null default 0,
     renewal_due_dt		tinyint not null default 0,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (drug_id) REFERENCES ps_drug(drug_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;    

use presphere;
drop table if exists presphere.ps_prescriber_address_xref ;
create table presphere.ps_prescriber_address_xref (
	 prescriber_address_xref_id int not null PRIMARY KEY AUTO_INCREMENT,
	 prescriber_id			int not null,
	 address_id			int not null,
     preferred_fl		smallint not null,
 	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
     FOREIGN KEY (prescriber_id) REFERENCES ps_prescriber(prescriber_id) ON UPDATE CASCADE ON DELETE RESTRICT,
     FOREIGN KEY (address_id) REFERENCES ps_address(address_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_prescriber_address_xref AUTO_INCREMENT=1001;


drop table if exists presphere.ps_vendor_auth_def;
create table presphere.ps_vendor_auth_def (
	vendor_auth_def_id	int not null PRIMARY KEY AUTO_INCREMENT,
	drug_id				int,
	auth_type_cd		tinyint default 0, -- 1.per fill, 2.per refill set, 3.per patient presriber pair 
	auth_valid_days		tinyint default 0,
	conf_type_cd		tinyint default 0,
	conf_valid_days		tinyint,
	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
	CONSTRAINT unq_drug_id_vd UNIQUE (drug_id),
	FOREIGN KEY (drug_id) REFERENCES ps_drug(drug_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_vendor_auth_def AUTO_INCREMENT=1001;


drop table if exists presphere.ps_tote;
create table presphere.ps_tote (
	tote_id		int not null PRIMARY KEY AUTO_INCREMENT,
	patient_id	int,
	label				varchar(20),
	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - pending, 9-closed',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
	FOREIGN KEY (patient_id) REFERENCES ps_patient(patient_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_tote AUTO_INCREMENT=1001;

-- Rx related tables
drop table if exists presphere.ps_fill_mapping;
create table presphere.ps_fill_mapping (
	fill_mapping_id		int not null PRIMARY KEY AUTO_INCREMENT,
	tote_id				int,
	drug_id				int,
	refill_set_status_cd int	default 0 comment '0 - no refill, 1 - refill open, 9 - refill closed',    
	status_cd			tinyint not null default 0, 
	create_user_id 	int not null,
	update_user_id 	int,
	create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
	FOREIGN KEY (tote_id) REFERENCES ps_tote(tote_id) ON UPDATE CASCADE ON DELETE RESTRICT,
	FOREIGN KEY (drug_id) REFERENCES ps_drug(drug_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_fill_mapping AUTO_INCREMENT=1001;


drop table if exists presphere.ps_prescription;
create table presphere.ps_prescription (
	prescription_id		int not null PRIMARY KEY AUTO_INCREMENT,
	fill_mapping_id		int,
	total_refill_nr		tinyint, 
	refill_nr			tinyint,
	ini_rx_id			int default null,
	written_dt			date,
	supply_days			tinyint,
	supply_override_cd	tinyint,
	partial_fill_cd		tinyint,
	custom_rx_nr		varchar(50),
	enroll_provider_id	int default null,
	prescribe_provider_id int default null,
	icd_code_id			int,				
	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (icd_code_id) REFERENCES ps_icd_code(icd_code_id) ON UPDATE CASCADE ON DELETE RESTRICT,
 	FOREIGN KEY (enroll_provider_id) REFERENCES ps_prescriber(prescriber_id) ON UPDATE CASCADE ON DELETE RESTRICT,
 	FOREIGN KEY (prescribe_provider_id) REFERENCES ps_prescriber(prescriber_id) ON UPDATE CASCADE ON DELETE RESTRICT,
 	FOREIGN KEY (ini_rx_id) REFERENCES ps_prescription(prescription_id) ON UPDATE CASCADE ON DELETE RESTRICT,
 	FOREIGN KEY (fill_mapping_id) REFERENCES ps_fill_mapping(fill_mapping_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_prescription AUTO_INCREMENT=1001;


drop table if exists presphere.ps_queue;
create table presphere.ps_queue (
	queue_id			int not null PRIMARY KEY AUTO_INCREMENT,
	queue_name			varchar(300),
	mapping_cd	    	varchar(50),	
	type_cd				tinyint,
	status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	create_user_id 		int not null,
	update_user_id 		int,
	create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT unq_queue_cd UNIQUE (mapping_cd)
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_queue AUTO_INCREMENT=1001;


drop table if exists presphere.ps_rx_shipment;
create table presphere.ps_rx_shipment (
	rx_shipment_id		int not null PRIMARY KEY AUTO_INCREMENT,
	fill_mapping_id	    int,	
	ship_dt				int,
	address_id			int,
	tracking_nr			varchar(100),
	shipping_service_id		tinyint,   
	status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	create_user_id 	int not null,
	update_user_id 	int,
	create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT unq_drug_id_vd UNIQUE (fill_mapping_id),
    FOREIGN KEY (shipping_service_id) REFERENCES ps_shipping_service(shipping_service_id) ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY (fill_mapping_id) REFERENCES ps_fill_mapping(fill_mapping_id) ON UPDATE CASCADE ON DELETE RESTRICT,
	FOREIGN KEY (address_id) REFERENCES ps_address(address_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_rx_shipment AUTO_INCREMENT=1001;


drop table if exists presphere.ps_ndc;
create table presphere.ps_ndc (
	ndc_id				int not null PRIMARY KEY AUTO_INCREMENT,
	drug_id				int,
	ndc					varchar(11),
	ndc_de				varchar(100),
	pkg_size				tinyint,
	mfr_nm				varchar(100),
	disp_uom_cd			tinyint,
	pkg_uom_cd			tinyint,
	serial_status_cd	tinyint,
	strength				varchar(50),
	status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	create_user_id 		int not null,
	update_user_id 		int,
	create_time 		datetime,
	update_time 		timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 	FOREIGN KEY (drug_id) REFERENCES ps_drug(drug_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_ndc AUTO_INCREMENT=1001;


drop table if exists presphere.ps_drug_ingredient;
create table presphere.ps_drug_ingredient (
	ingredient_id		int not null PRIMARY KEY AUTO_INCREMENT,
	ingredient_de		varchar(100),
	max_daily_dose		float,
	uom					varchar(10),
	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	create_time 		datetime,
	update_time 		timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_drug_ingredient AUTO_INCREMENT=1001;

drop table if exists presphere.ps_ndc_ingredient_xref;
create table presphere.ps_ndc_ingredient_xref (
	ndc_ingredient_xref_id 		int not null PRIMARY KEY AUTO_INCREMENT,
	ndc_id				int not null,
	ingredient_id		int not null,
	strength			float,
	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	create_time 		datetime,
	update_time 		timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (ingredient_id) REFERENCES ps_drug_ingredient(ingredient_id) ON UPDATE CASCADE ON DELETE RESTRICT,
 	FOREIGN KEY (ndc_id) REFERENCES ps_ndc(ndc_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_ndc_ingredient_xref AUTO_INCREMENT=1001;



drop table if exists ps_rx_ndc;
create table ps_rx_ndc (
	rx_ndc_id			int not null PRIMARY KEY AUTO_INCREMENT,
	ndc_id				int,
	prescription_id		int,
	disp_qty_nr			int,
	dose_change_cd		tinyint,
	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	create_time 		datetime,
	update_time 		timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (prescription_id) REFERENCES ps_prescription(prescription_id) ON UPDATE CASCADE ON DELETE RESTRICT,
 	FOREIGN KEY (ndc_id) REFERENCES ps_ndc(ndc_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE ps_rx_ndc AUTO_INCREMENT=1001;


drop table if exists ps_entity_lock;
create table ps_entity_lock (
	entity_lock_id		int not null PRIMARY KEY AUTO_INCREMENT,
	entity_type_cd		tinyint	comment '1- patient, 2- provider, 3- fill mapping, 4- tote, ',
	entity_id		  	int not null, 
	lock_note			varchar(100),
	unlock_note			varchar(100),
	access_type_cd		tinyint,
	status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	create_user_id 		int not null,
	update_user_id 		int,
	create_time 		datetime,
	update_time 		datetime
 ) ENGINE=InnoDB;         
ALTER TABLE ps_entity_lock AUTO_INCREMENT=1001;


CREATE TABLE ps_user_role_queue_xref (
  user_role_id int(11) NOT NULL,
  queue_id int(11) NOT NULL,
  status_cd tinyint(4) NOT NULL COMMENT '0 - inactive, 1 - active',
  create_user_id int(11) NOT NULL,
  update_user_id int(11) DEFAULT NULL,
  create_time datetime DEFAULT CURRENT_TIMESTAMP,
  update_time datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  KEY queue_id (queue_id),
  KEY user_role_id (user_role_id),
  CONSTRAINT ps_user_role_queue_xref_ibfk_1 FOREIGN KEY (queue_id) REFERENCES ps_queue (queue_id) ON UPDATE CASCADE,
  CONSTRAINT ps_user_role_queue_xref_ibfk_2 FOREIGN KEY (user_role_id) REFERENCES ps_user_role (user_role_id) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;













drop table if exists presphere.ps_vendor_auth;
create table presphere.ps_vendor_auth (
	vendor_auth_id		int not null PRIMARY KEY AUTO_INCREMENT,
	fill_mapping_id				int,
	auth_type_cd		tinyint default 0, -- 1.per fill, 2.per refill set, 3.per patient presriber pair 
	auth_cd				varchar(50),
	auth_valid_days		tinyint default 0,
	auth_dt				date,
	conf_type_cd		tinyint default 0,
	conf_cd				varchar(50),
	conf_dt				date,
	conf_valid_days		tinyint,
	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP,
   CONSTRAINT unq_drug_id_vd UNIQUE (fill_mapping_id),
   FOREIGN KEY (fill_mapping_id) REFERENCES ps_fill_mapping(fill_mapping_id) ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_vendor_auth AUTO_INCREMENT=1001;



drop table if exists presphere.ps_shipping_service;
create table presphere.ps_shipping_service (
	shipping_service_id		int not null PRIMARY KEY AUTO_INCREMENT,
	service_nm				varchar(100),
	tracking_url			varchar(200),
	 status_cd			tinyint not null default 1 comment '0 - inactive, 1 - active',
	 create_user_id 	int not null,
	 update_user_id 	int,
	 create_time 		DATETIME DEFAULT CURRENT_TIMESTAMP,
	 update_time 		DATETIME ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;         
ALTER TABLE presphere.ps_shipping_service AUTO_INCREMENT=1001;
