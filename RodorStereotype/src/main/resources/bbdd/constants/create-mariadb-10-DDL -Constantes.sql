CREATE TABLE RODOR_CONSTANTS(
id MEDIUMINT UNSIGNED primary key,
clave char(80) NOT NULL COMMENT 'Clave del elemento',
descripcion varchar(1024) NOT NULL COMMENT 'Valor del elemento' ,
fechini datetime NOT NULL COMMENT 'fecha de inicio de validez del valor',
fechfin datetime NOT NULL COMMENT 'fecha de fin de validez del valor'
);

