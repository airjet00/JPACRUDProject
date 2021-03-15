-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema rocketdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `rocketdb` ;

-- -----------------------------------------------------
-- Schema rocketdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `rocketdb` DEFAULT CHARACTER SET utf8 ;
USE `rocketdb` ;

-- -----------------------------------------------------
-- Table `rocket`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `rocket` ;

CREATE TABLE IF NOT EXISTS `rocket` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `height` INT NULL,
  `description` VARCHAR(250) NULL,
  `diameter` DOUBLE NULL,
  `country` VARCHAR(45) NULL,
  `cost_per_launch` DOUBLE NULL,
  `max_payload` INT NULL,
  `mass` INT NULL,
  `is_active` TINYINT NULL,
  `total_launches` INT NULL,
  `failed_launches` INT NULL,
  `first_flight` DATE NULL,
  `last_flight` DATE NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
-- DROP USER rocketuser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'rocketuser'@'localhost' IDENTIFIED BY 'rocketuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'rocketuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `rocket`
-- -----------------------------------------------------
START TRANSACTION;
USE `rocketdb`;
INSERT INTO `rocket` (`id`, `name`, `height`, `description`, `diameter`, `country`, `cost_per_launch`, `max_payload`, `mass`, `is_active`, `total_launches`, `failed_launches`, `first_flight`, `last_flight`) VALUES (1, 'Falcon 9 v1.2', 71, 'Resuable, two-stage rocket designed and manufactured by SpaceX for the reliable and safe transport of people and payloads into Earth orbit and beyond.', 3.66, 'U.S.', 62, 22800, 549000, 1, 91, 1, '2015-12-22', '2021-03-11');
INSERT INTO `rocket` (`id`, `name`, `height`, `description`, `diameter`, `country`, `cost_per_launch`, `max_payload`, `mass`, `is_active`, `total_launches`, `failed_launches`, `first_flight`, `last_flight`) VALUES (2, 'Saturn V', 110, 'Super heavy-lift launch vehicle certified for human-rating used by NASA between 1967 and 1973.', 10.1, 'U.S.', 185, 140000, 2900000, 0, 13, 1, '1967-11-09', '1973-05-14');

COMMIT;
