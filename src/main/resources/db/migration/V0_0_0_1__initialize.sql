CREATE TABLE `users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `active` BIT NULL DEFAULT 0,
  `enabled` BIT NULL DEFAULT 0,
  `update_date` DATETIME NULL,
  `create_date` DATETIME NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `update_date` DATETIME NULL,
  `create_date` DATETIME NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `user_roles` (
  `user_id` INT NOT NULL,
  `role_id` INT NOT NULL,
  `update_date` DATETIME NULL,
  `create_date` DATETIME NULL,
  INDEX `fk_user_roles_user_id_idx` (`user_id` ASC),
  INDEX `fk_user_roles_role_id_idx` (`role_id` ASC),
  CONSTRAINT `fk_user_roles_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_roles_role_id`
    FOREIGN KEY (`role_id`)
    REFERENCES `roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

INSERT INTO `users` (`id`, `username`, `password`, `email`, `first_name`, `last_name`, `active`, `enabled`)
VALUES(1, 'user1', '$2a$10$K9x343awCBG49xx23Gt6JO2g7isbz0bBDGadQzS38dPly9A4RUu.a', 'user1@app.com', 'app', 'user1', 1, 1);
INSERT INTO `users`(`id`, `username`, `password`, `email`, `first_name`, `last_name`, `active`, `enabled`)
VALUES(2, 'admin1', '$2a$10$K9x343awCBG49xx23Gt6JO2g7isbz0bBDGadQzS38dPly9A4RUu.a', 'admin1@app.com', 'app', 'admin1', 1, 1);

INSERT INTO `roles` (`id`, `name`)
VALUES (1, 'ROLE_USER');
INSERT INTO `roles` (`id`, `name`)
VALUES (2, 'ROLE_ADMIN');

INSERT INTO `user_roles` (`user_id`, `role_id`)
VALUES (1, 1);
INSERT INTO `user_roles` (`user_id`, `role_id`)
VALUES (2, 2);

