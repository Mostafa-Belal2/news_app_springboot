-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema news_app
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema news_app
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `news_app` DEFAULT CHARACTER SET utf8 ;
USE `news_app` ;

-- -----------------------------------------------------
-- Table `news_app`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `news_app`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(45) NOT NULL,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `news_app`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `news_app`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `roles_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC),
  INDEX `fk_admin_roles_idx` (`roles_id` ASC),
  CONSTRAINT `fk_admin_roles`
    FOREIGN KEY (`roles_id`)
    REFERENCES `news_app`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `news_app`.`news`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `news_app`.`news` (
  `id` INT NOT NULL,
  `title` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `image_path` VARCHAR(255) NULL,
  `admin_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_news_admin1_idx` (`admin_id` ASC),
  CONSTRAINT `fk_news_admin1`
    FOREIGN KEY (`admin_id`)
    REFERENCES `news_app`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
