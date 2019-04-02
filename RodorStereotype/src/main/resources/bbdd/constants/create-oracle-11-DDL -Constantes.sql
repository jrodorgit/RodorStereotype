CREATE TABLE RODOR_CONSTANTS(
id NUMBER(3) NOT NULL,
clave VARCHAR2(80) NOT NULL ,
descripcion VARCHAR2(1024) NOT NULL ,
fechini TIMESTAMP NOT NULL ,
fechfin TIMESTAMP NOT NULL ,
CONSTRAINT RODOR_CONSTANTS_PK PRIMARY KEY(ID)
) 
LOGGING;
COMMENT ON TABLE RODOR_CONSTANTS IS 'Dominio de constantes de la aplicación';
COMMENT ON COLUMN RODOR_CONSTANTS.clave IS 'Clave del elemento';
COMMENT ON COLUMN RODOR_CONSTANTS.descripcion IS 'Valor del elemento';
COMMENT ON COLUMN RODOR_CONSTANTS.fechini IS 'fecha de inicio de validez del valor';
COMMENT ON COLUMN RODOR_CONSTANTS.fechfin IS 'fecha de fin de validez del valor';


