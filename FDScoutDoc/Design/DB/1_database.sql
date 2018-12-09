create database fdscout;
SELECT User, Host FROM mysql.user;
ALTER USER 'root'@'localhost' IDENTIFIED BY 'AxiomSPS7';

-- to override safe update mode
-- SET SQL_SAFE_UPDATES = 0;

-- psadmin is the admin of presphere database
-- fdsadmin was created in cPanel
CREATE USER 'fdsadmin'@'localhost' IDENTIFIED BY 'ser4Recall#';

GRANT ALL PRIVILEGES ON presphere.* TO 'fdsadmin'@'localhost' WITH GRANT OPTION;

-- ps_web_user is the user that application front end uses to connect to database
CREATE USER 'fds_web_user'@'localhost' IDENTIFIED BY 'password';
GRANT SELECT, insert, delete, update ON fdscout.* TO 'fds_web_user'@'localhost' WITH GRANT OPTION;


-- fdscoutc_webuser, password: Rec4Ana*