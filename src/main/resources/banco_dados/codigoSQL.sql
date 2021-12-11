SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `Projeto` DEFAULT CHARACTER SET utf8;
USE `Projeto` ;

CREATE TABLE IF NOT EXISTS `Projeto`.`Usuario` (
  `CPF` VARCHAR(14) NOT NULL,
  `Nome` VARCHAR(45) NOT NULL,
  `Sexo` VARCHAR(13) NULL,
  `Cartao_Titular` VARCHAR(45) NOT NULL,
  `Cartao_Numero` VARCHAR(16) NOT NULL,
  `Cartao_Codigo` INT NOT NULL,
  `Pais` VARCHAR(45) NOT NULL,
  `UF` VARCHAR(2) NOT NULL,
  `Cidade` VARCHAR(45) NOT NULL,
  `Bairro` VARCHAR(45) NOT NULL,
  `Rua` VARCHAR(45) NOT NULL,
  `Complemento` VARCHAR(45),
  `Numero_casa` INT NOT NULL,
  PRIMARY KEY (`CPF`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Projeto`.`Conta` (
  `Login` VARCHAR(45) NOT NULL,
  `Senha` VARCHAR(45) NOT NULL,
  `Usuario_CPF` VARCHAR(14) NOT NULL,
  PRIMARY KEY (`Login`),
  INDEX `fk_Conta_Usuario_idx` (`Usuario_CPF` ASC) VISIBLE,
  UNIQUE INDEX `Usuario_CPF_UNIQUE` (`Usuario_CPF` ASC) VISIBLE,
  CONSTRAINT `fk_Conta_Usuario`
    FOREIGN KEY (`Usuario_CPF`)
    REFERENCES `Projeto`.`Usuario` (`CPF`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Projeto`.`Playlist` (
  `idPlaylist` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45)  NOT NULL,
  `num_Musicas` INTEGER,
  `Usuario_CPF` VARCHAR(14) NOT NULL,
  PRIMARY KEY (`idPlaylist`),
  INDEX `fk_Playlist_Usuario1_idx` (`Usuario_CPF` ASC) VISIBLE,
  CONSTRAINT `fk_Playlist_Usuario1`
    FOREIGN KEY (`Usuario_CPF`)
    REFERENCES `Projeto`.`Usuario` (`CPF`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Projeto`.`Musica` (
  `idMusica` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NOT NULL,
  `Duracao` VARCHAR(5) NOT NULL,
  `Artista` VARCHAR(45) NOT NULL,
  `Genero` VARCHAR(45) NOT NULL,
  `Album` VARCHAR(45) NULL,
  PRIMARY KEY (`idMusica`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Projeto`.`Playlist_has_Musica` (
  `Playlist_idPlaylist` INT NOT NULL,
  `Musica_idMusica` INT NOT NULL,
  PRIMARY KEY (`Playlist_idPlaylist`, `Musica_idMusica`),
  INDEX `fk_Playlist_has_Musica_Musica1_idx` (`Musica_idMusica` ASC) VISIBLE,
  INDEX `fk_Playlist_has_Musica_Playlist1_idx` (`Playlist_idPlaylist` ASC) VISIBLE,
  CONSTRAINT `fk_Playlist_has_Musica_Playlist1`
    FOREIGN KEY (`Playlist_idPlaylist`)
    REFERENCES `Projeto`.`Playlist` (`idPlaylist`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Playlist_has_Musica_Musica1`
    FOREIGN KEY (`Musica_idMusica`)
    REFERENCES `Projeto`.`Musica` (`idMusica`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
