insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1001, 'Address Type', 1, 0);

insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1001, 1, 'Residential', 'Residential', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1001, 2, 'Work', 'Work', 2, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1001, 3, 'Business', 'Business', 3, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1001, 4, 'Pharmacy', 'Pharmacy', 4, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1001, 99, 'Other', 'Other', 99, 0);

use presphere;
insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1002, 'Staff Timeoff Status', 1, 0);

insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1002, 0, 'Cancelled', 'Cancelled', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1002, 1, 'Approved', 'Approved', 2, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1002, 3, 'Pending', 'Pending for Approval', 3, 0);

insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1003, 'Gender', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1003, 1, 'F', 'Female', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1003, 2, 'M', 'Male', 2, 0);

use presphere;
insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1004, 'Search Category', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1004, 1, 'All', 'All categories', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1004, 2, 'Patient', 'Search patient name, medical record number, program #', 2, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1004, 3, 'Provider', 'Search provider name, DEA#, NPI#, state license #, program #', 3, 0);

insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1005, 'Type of Phone Number', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1005, 1, 'Home', 'Home', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1005, 2, 'Work', 'Work', 2, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1005, 3, 'Other', 'Other', 3, 0);


insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1006, 'Boolean', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1006, 1, 'Yes', 'YES', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1006, 0, 'No', 'NO', 2, 0);


insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id) 
values (1007, 'Boolean Status', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1007, 1, 'Active', 'ACTIVE', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1007, 0, 'Inactive', 'INACTIVE', 2, 0);

insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1008, 'Patient Drug Profile Status', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1008, 0, 'Staging', 'STAGING', 0, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1008, 1, 'Pending', 'PENDING', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1008, 2, 'Active', 'ACTIVE', 2, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1008, 3, 'Cancelled', 'CANCELLED', 3, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1008, 4, 'Discontinued', 'DISCONTINUED', 4, 0);

insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1009, 'Patient Enroll Type', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1009, 1, 'New ', 'NEW', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1009, 2, 'Redirect', 'REDIRECT', 2, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id)
values (1009, 3, 'Renewal', 'RENEWAL', 3, 0);

insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1010, 'US State', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 1, 'AL','Alabama', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 2, 'AK','Alaska', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 3, 'AZ','Arizona', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 4, 'AR','Arkansas', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 5, 'CA','California', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 6, 'CO','Colorado', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 7, 'CT','Connecticut', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 8, 'DE','Delaware', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 9, 'FL','Florida', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 10, 'GA','Georgia', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 11, 'HI','Hawaii', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 12, 'ID','Idaho', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 13, 'IL','Illinois', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 14, 'IN','Indiana', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 15, 'IA','Iowa', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 16, 'KS','Kansas', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 17, 'KY','Kentucky', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 18, 'LA','Louisiana', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 19, 'ME','Maine', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 20, 'MD','Maryland', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 21, 'MA','Massachusetts', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 22, 'MI','Michigan', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 23, 'MN','Minnesota', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 24, 'MS','Mississippi', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 25, 'MO','Missouri', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 26, 'MT','Montana', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 27, 'NE','Nebraska', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 28, 'NV','Nevada', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 29, 'NH','New Hampshire', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 30, 'NJ','New Jersey', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 31, 'NM','New Mexico', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 32, 'NY','New York', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 33, 'NC','North Carolina', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 34, 'ND','North Dakota', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 35, 'OH','Ohio', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 36, 'OK','Oklahoma', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 37, 'OR','Oregon', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 38, 'PA','Pennsylvania', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 39, 'RI','Rhode Island', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 40, 'SC','South Carolina', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 41, 'SD','South Dakota', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 42, 'TN','Tennessee', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 43, 'TX','Texas', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 44, 'UT','Utah', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 45, 'VT','Vermont', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 46, 'VA','Virginia', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 47, 'WA','Washington', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 48, 'WV','West Virginia', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 49, 'WI','Wisconsin', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1010, 50, 'WY','Wyoming', 1, 0);

insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1011, 'Relation To Insured', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1011, 1, 'Self','Self', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1011, 2, 'Spouse','Spouse', 2, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1011, 3, 'Child','Child', 3, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1011, 4, 'Parent','Parent', 4, 0);

insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1012, 'Drug Profile Element Requirement', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1012, 0, 'Not needed','Not needed', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1012, 1, 'Optional','Optional', 2, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1012, 2, 'Required','Required', 3, 0);

insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1013, 'Vendor Auth Code Type', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1013, 0, 'Not required', 'Not required', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1013, 1, 'Each fill', 'Unique for each fill', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1013, 2, 'Patient-prescriber', 'Unique for each patient prescriber pair', 2, 0);

insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1014, 'Packaging UOM', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1014, 1, 'Bottle', 'Bottle', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1014, 2, 'Blister', 'Blister', 2, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1014, 3, 'Box', 'Box', 3, 0);

insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1015, 'Dispensing UOM', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1015, 1, 'Tab', 'Table', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1015, 2, 'Cap', 'Capsule', 2, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1015, 3, 'Vial', 'Vial', 3, 0);

insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1016, 'Serialization Status', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1016, 1, 'Not serialized', 'Not serialized', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1016, 2, 'In Transition', 'In Transition', 2, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1016, 3, 'Serialized', 'Serialized', 3, 0);

insert into presphere.ps_property (property_id, property_nm, status_cd, create_user_id)
values (1017, 'Strength UOM', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1017, 1, 'MG', 'Milligram', 1, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1017, 2, 'ML', 'Milliliter', 2, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1017, 3, 'PCT', 'Percent', 3, 0);
insert into presphere.ps_property_value (property_id, value_cd, value_short_de, value_long_de, disp_order_cd, create_user_id) 
values (1017, 4, 'UNIT', 'Unit', 4, 0);


insert into presphere.ps_user_role (role_cd, role_de, status_cd, create_user_id) values ('TECH', 'Pharmacy Technician', 1, 0);
insert into presphere.ps_user_role (role_cd, role_de, status_cd, create_user_id) values ('RPH', 'Pharmacist', 1, 0);
insert into presphere.ps_user_role (role_cd, role_de, status_cd, create_user_id) values ('CMGR', 'Clinical Manager', 1, 0);
insert into presphere.ps_user_role (role_cd, role_de, status_cd, create_user_id) values ('ADM1', 'System Admin level 1', 1, 0);


insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1001, 'Dashboard', 101, 0, 'loadDashboardContent.action', 1, 1, 1, 0);


insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1022, 'System Setup', 101, 0, 'loadSystemSetup.action', 1, 22, 1, 0);

insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1101, 'Drug Setup', 102, 0, 'loadDrugSetup.action', 1, 1, 1, 0);
insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1102, 'ICD Codes', 102, 0, 'loadIcdCodeSetup.action', 1, 2, 1, 0);
insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1103, 'Payer', 102, 0, 'loadPayerSetup.action', 1, 3, 1, 0);
insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1104, 'PBM', 102, 0, 'loadPBMSetup.action', 1, 4, 1, 0);

insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1105, 'Pharmacy', 102, 0, 'loadPharmacySetup.action', 1, 5, 1, 0);
insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1104, 'User', 102, 0, 'loadUserSetup.action', 1, 6, 1, 0);

insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1002, 'Resource Planning', 101, 0, 'loadResourcePlanning.action', 1, 3, 1, 0);

insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1006, 'Wizard', 101, 0, 'loadWizardContent.action', 1, 6, 1, 0);


insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1009, 'Inventory', 101, 0, 'loadMyInventory.action', 1, 9, 1, 0);
insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1010, 'Report', 101, 0, 'loadMyReport.action', 1, 10, 1, 0);
insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1011, 'Preference', 101, 0, 'loadMyPreference.action', 1, 11, 1, 0);


-- ---- My Preferences : 1011
-- ---- My Time off 1031 is OK 

insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1013, 'New Patient', 101, 0, 'loadNewPatientWizard.action', 0, 20, 1, 0);
insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1014, 'New Provider', 101, 0, 'loadNewProviderWizard.action', 0, 21, 1, 0);

insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1011, 'My Preference', 101, 0, 'loadMyPreferencesSetup.action', 1, 10, 1, 0);

insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (2201, 'My Time off', 103, 0, 'loadTimeoffSetup.action', 1, 10, 1, 0);

insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (2202, 'Staff Availability', 101, 0, 'searchAvailableStaff', 1, 9, 1, 0);

-- Revlimid
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1001, 'F', 1, 'AFNRP', 'Adult Female Not Reproductive Potential', 1, 0, 0, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1001, 'F', 2, 'AFRP', 'Adult Female Reproductive Potential', 1, 0, 0, 1, 0); 
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1001, 'F', 3, 'CFNRP', 'Child Female Reproductive Potential', 1, 0, 0, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1001, 'F', 4, 'CFRP', 'Child Female Reproductive Potential', 1, 0, 0, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1001, 'M', 5, 'AM', 'Adult male 18 years or older', 1, 0, 0, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1001, 'M', 6, 'CM', 'Child male under 18 years', 1, 0, 0, 1, 0);


-- Pomlyst
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1003, 'F', 1, 'AFNRP', 'Adult Female Not Reproductive Potential', 1, 0, 0, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1003, 'F', 2, 'AFRP', 'Adult Female Reproductive Potential', 1, 0, 0, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1003, 'F', 3, 'CFNRP', 'Child Female Reproductive Potential', 1, 0, 0, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1003, 'F', 4, 'CFRP', 'Child Female Reproductive Potential', 1, 0, 0, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1003, 'M', 5, 'AM', 'Adult male 18 years or older', 1, 0, 0, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1003, 'M', 6, 'CM', 'Child male under 18 years', 1, 0, 0, 1, 0);

-- Opsumit
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1002, 'F', 1, 'FNRP', 'Female of Non-Reproductive Potential', 1, 1, 0, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1002, 'F', 2, 'FRP', 'Female of Reproductive Potential', 1, 0, 0, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1002, 'M', 3, 'MALE', 'Male', 1, 0, 0, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1002, 'F', 4, 'PPFNRP', 'Pre-Pubertal Female Non-Reproductive Potential', 2, 0, 1, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1002, 'F', 5, 'PMFNRP', 'Post-Menopausal Female Non-Reproductive Potential', 2, 0, 1, 1, 0);
insert into presphere.ps_risk_type (drug_id, gender, risk_type_cd, risk_type_abbr, risk_type_de, type_level_cd, sub_type_fl, super_type_cd, status_cd, create_user_id)
values (1002, 'F', 6, 'PIIFNRP', 'Female with other medical reasons for permanent, irreversible infertility', 2, 0, 1, 1, 0);



use presphere;
SET SQL_SAFE_UPDATES = 0;
delete from presphere.ps_menu_role_xref;
delete from presphere.ps_menu_tab;

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1001, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1001, 1004, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1101, 1004, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1102, 1004, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1103, 1004, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1104, 1004, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1106, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1106, 1004, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1022, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1022, 1004, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1105, 1004, 1, 0);


insert into presphere.ps_user_role_xref values (1001, 1004, 1, 0, null, now(), null);
insert into presphere.ps_user_role_xref values (1002, 1004, 1, 0, null, now(), null);





insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1011, 1003, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1006, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1013, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1014, 1003, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1010, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1012, 1003, 1, 0);


insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1106, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1106, 1004, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1022, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1022, 1004, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1105, 1004, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1101, 1001, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1101, 1002, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1101, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1101, 1004, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2201, 1001, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2201, 1002, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2201, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2201, 1004, 1, 0);

insert into presphere.ps_disease_state (state_nm, create_user_id) values ('Pulmonary Arterial Hypertension', 0);
insert into presphere.ps_disease_state (state_nm, create_user_id) values ('Oncology-Oral/Topical', 0);

-- ----------  Brahma's DML scripts ---------------
insert into ps_browser_config(name, min_version, max_version) values('chrome', '60.0', '65.9');
insert into ps_browser_config(name, min_version, max_version) values('safari', '6.0', '9.0');


insert into presphere.ps_queue (queue_name, mapping_cd, type_cd, status_cd, create_user_id)
values('Benefit Investigation Queue', 'benefitInvestigationQueue', 1, 1, 0);
insert into presphere.ps_queue (queue_name, mapping_cd, type_cd, status_cd, create_user_id)
values('Prior Authorization Queue', 'priorAuthQueue', 1, 1, 0);
insert into presphere.ps_queue (queue_name, mapping_cd, type_cd, status_cd, create_user_id)
values('Data Entry Queue', 'dataEntryQueue', 1, 1, 0);
insert into presphere.ps_queue (queue_name, mapping_cd, type_cd, status_cd, create_user_id)
values('Drug Utilization Review Queue', 'drugUtilizationReviewQueue', 1, 1, 0);
insert into presphere.ps_queue (queue_name, mapping_cd, type_cd, status_cd, create_user_id)
values('Patient Consultation Queue', 'consultationQueue', 1, 1, 0);
insert into presphere.ps_queue (queue_name, mapping_cd, type_cd, status_cd, create_user_id)
values('Rx Dispense Queue', 'rxDispenseQueue', 1, 1, 0);
insert into presphere.ps_queue (queue_name, mapping_cd, type_cd, status_cd, create_user_id)
values('Benefit Coordination Queue', 'benefitCoordinationQueue', 1, 1, 0);
insert into presphere.ps_queue (queue_name, mapping_cd, type_cd, status_cd, create_user_id)
values('Pack and Ship Queue', 'packShipQueue', 1, 1, 0);
insert into presphere.ps_queue (queue_name, mapping_cd, type_cd, status_cd, create_user_id)
values('Exception Queue', 'exceptionQueue', 1, 1, 0);


-- Time off management
insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1011, 'My Preference', 101, 0, 'loadMyPreferencesSetup.action', 1, 10, 1, 0);

insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (2201, 'My Time off', 103, 0, 'loadMyTimeoffTab.action', 1, 10, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1101, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2201, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2202, 1003, 1, 0);


insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1107, 'Queue Role Mapping', 102, 0, 'loadQueueRoleMappingsMain.action', 1, 8, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1107, 1003, 1, 0);

-- Organization

insert into presphere.ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (1108, 'Organization', 102, 0, 'loadOrganizationSetup.action', 1, 7, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (1108, 1003, 1, 0);

insert into ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (2301, 'Benefit Investigation', 110, 0, 'loadBenefitInvestigationInFillProcess.action', 1, 1, 1, 0);
insert into ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (2302, 'Prior Authorization', 110, 0, 'loadPriorAuthorizationInFillProcess.action', 1, 2, 1, 0);
insert into ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (2303, 'Data Entry', 110, 0, 'loadDataEntryInFillProcess.action', 1, 3, 1, 0);
insert into ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (2304, 'Drug Utilization Review', 110, 0, 'loadDrugUtilizationReviewInFillProcess.action', 1, 4, 1, 0);
insert into ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (2305, 'Patient Consultation', 110, 0, 'loadPatientConsultationInFillProcess.action', 1, 5, 1, 0);
insert into ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (2306, 'Rx Dispense', 110, 0, 'loadRxDispenseInFillProcess.action', 1, 6, 1, 0);
insert into ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (2307, 'Coordination of benefits', 110, 0, 'loadCoordinationOfBenefitsInFillProcess.action', 1, 7, 1, 0);
insert into ps_menu_tab (menu_tab_id, menu_label, group_cd, parent_id, url, sub_menu_cd, disp_order_cd, status_cd, create_user_id)
values (2308, 'Pack and ship', 110, 0, 'loadPackAndShipInFillProcess.action', 1, 8, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2301, 1001, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2301, 1002, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2301, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2301, 1004, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2302, 1001, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2302, 1002, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2302, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2302, 1004, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2303, 1001, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2303, 1002, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2303, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2303, 1004, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2304, 1001, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2304, 1002, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2304, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2304, 1004, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2305, 1001, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2305, 1002, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2305, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2305, 1004, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2306, 1001, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2306, 1002, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2306, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2306, 1004, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2307, 1001, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2307, 1002, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2307, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2307, 1004, 1, 0);

insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2308, 1001, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2308, 1002, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2308, 1003, 1, 0);
insert into ps_menu_role_xref (menu_tab_id, user_role_id, status_cd, create_user_id)values (2308, 1004, 1, 0);
