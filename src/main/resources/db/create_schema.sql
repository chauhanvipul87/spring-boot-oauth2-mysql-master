CREATE SCHEMA `app`;
CREATE USER 'app_admin'@'localhost' IDENTIFIED BY '@admin';
GRANT ALL ON app.* TO 'app_admin'@'localhost';