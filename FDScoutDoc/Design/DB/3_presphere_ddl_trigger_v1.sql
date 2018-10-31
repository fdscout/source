DELIMITER $$
CREATE TRIGGER upd_ps_user BEFORE UPDATE ON ps_user FOR EACH ROW 
BEGIN
	insert into presphere.ps_user_hist (user_id, first_nm, middle_nm, last_nm, gender, user_nm, password, email, status_cd, create_user_id, update_user_id, create_time, update_time, trigger_type)	
	values (old.user_id, old.first_nm, old.middle_nm, old.last_nm, old.gender, old.user_nm, old.password, old.email, old.status_cd, old.create_user_id, old.update_user_id, old.create_time, old.update_time, 2);
END;
$$  

use presphere;