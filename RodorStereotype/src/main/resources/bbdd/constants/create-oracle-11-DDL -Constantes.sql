CREATE TABLE RODOR_CONSTANTS(
clave VARCHAR2(20) NOT NULL ,
descripcion VARCHAR2(1024) NOT NULL ,
fechini TIMESTAMP NOT NULL ,
fechfin TIMESTAMP NOT NULL 
 
) 
LOGGING;
COMMENT ON TABLE RODOR_CONSTANTS IS 'Dominio de constantes de la aplicación';
COMMENT ON COLUMN RODOR_CONSTANTS.clave IS 'Clave del elemento';
COMMENT ON COLUMN RODOR_CONSTANTS.descripcion IS 'Valor del elemento';
COMMENT ON COLUMN RODOR_CONSTANTS.fechini IS 'fecha de inicio de validez del valor';
COMMENT ON COLUMN RODOR_CONSTANTS.fechfin IS 'fecha de fin de validez del valor';

