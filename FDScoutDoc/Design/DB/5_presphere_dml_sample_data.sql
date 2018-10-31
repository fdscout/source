insert into presphere.ps_user (user_id, first_nm, last_nm, gender, user_nm, password, email, status_cd, create_user_id)
values(1001, 'Jonathan', 'Su', 'M', 'deerhill@gmail.com', 'ba3253876aed6bc22d4a6ff53d8406c6ad864195ed144ab5c87621b6c233b548baeae6956df346ec8c17f5ea10f35ee3cbc514797ed7ddd3145464e2a0bab413', 'deerhill@gmail.com', 1, 0);

insert into presphere.ps_user (user_id, first_nm, last_nm, gender, user_nm, password, email, status_cd, create_user_id)
values(1002, 'Brahma', 'Kanaparthi', 'M', 'bramha.ks@gmail.com', 'ba3253876aed6bc22d4a6ff53d8406c6ad864195ed144ab5c87621b6c233b548baeae6956df346ec8c17f5ea10f35ee3cbc514797ed7ddd3145464e2a0bab413', 'bramha.ks@gmail.com', 1, 0);

update presphere.ps_user set user_nm = 'su' where user_id = 1001;


insert into ps_pharmacy (pharmacy_nm, type_cd, status_cd, create_user_id) values ('Excel Specialty Pharmacy', 1, 1, 0);

insert into ps_pharmacy_user_xref (pharmacy_id, user_id, status_cd, create_user_id) values (1001, 1001, 1, 0);
use presphere;

insert into ps_pharmacy_user_xref (pharmacy_id, user_id, status_cd, create_user_id) values (1001, 1002, 1, 0);
use presphere;



insert into presphere.ps_user_role_xref (user_id, user_role_id, status_cd, create_user_id) values (1001, 1003, 1, 0);

insert into presphere.ps_user_role_xref (user_id, user_role_id, status_cd, create_user_id) values (1002, 1003, 1, 0);
