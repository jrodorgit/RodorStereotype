CREATE TABLE RODOR_DOMAINS(
id NUMBER(5) NOT NULL,
appdomain VARCHAR2(20) NOT NULL ,
namedomain VARCHAR2(20) NOT NULL ,
code VARCHAR2(20) NOT NULL ,
description VARCHAR2(80) NOT NULL ,
descriptionXL VARCHAR2(256) NOT NULL ,
descriptionXS VARCHAR2(30) NOT NULL ,
startdate TIMESTAMP NOT NULL ,
enddate TIMESTAMP NOT NULL ,
CONSTRAINT RODOR_DOMAINS_PK PRIMARY KEY(ID)
) 
LOGGING;
COMMENT ON TABLE RODOR_DOMAINS IS 'Dominios de valores';
COMMENT ON COLUMN RODOR_DOMAINS.id IS 'Identificador unico delr registro';
COMMENT ON COLUMN RODOR_DOMAINS.appdomain IS 'Aplicacion a la que pertenece del dominio. Si valor ALL se aplicará a todas las aplicaciones';
COMMENT ON COLUMN RODOR_DOMAINS.namedomain IS 'Nombre del dominio';
COMMENT ON COLUMN RODOR_DOMAINS.code IS 'Codigo del elemento del dominio';
COMMENT ON COLUMN RODOR_DOMAINS.description IS 'Descripcion del elemento  del dominio';
COMMENT ON COLUMN RODOR_DOMAINS.descriptionXL IS 'Descripcion larga del elemento  del dominio';
COMMENT ON COLUMN RODOR_DOMAINS.descriptionXS IS 'Descripcion corta del elemento  del dominio';
COMMENT ON COLUMN RODOR_DOMAINS.startdate IS 'fecha de inicio de validez del elemento  del dominio';
COMMENT ON COLUMN RODOR_DOMAINS.enddate IS 'fecha de fin de validez del elemento del dominio';


--REM INSERTING into ZZDOMAINS
Insert into RODOR_DOMAINS (id,APPDOMAIN,NAMEDOMAIN, code,description,descriptionXL,descriptionXS,startdate,enddate) values (1,'SICOSS','CONCEPTOS GASTO','36','GASTOS FSE','GASTOS IMPUTABLES AL FONDO SOCIAL EUROPEO','GASTOS FSE',to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2019 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));
Insert into RODOR_DOMAINS (id,APPDOMAIN,NAMEDOMAIN,code,description,descriptionXL,descriptionXS,startdate,enddate) values (2,'SICOSS','CONCEPTOS GASTO','37','GASTOS FROB','GASTOS IMPUTABLES AL FROB','GASTOS FROB',to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2019 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));
Insert into RODOR_DOMAINS (id,APPDOMAIN,NAMEDOMAIN,code,description,descriptionXL,descriptionXS,startdate,enddate) values (3,'SICOSS','CONCEPTOS FACT','01','FACTURACION FROB','FACTURACION RELATIVA AL FROB','FACTURACION FROB',to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2019 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));
Insert into RODOR_DOMAINS (id, APPDOMAIN,NAMEDOMAIN,code,description,descriptionXL,descriptionXS,startdate,enddate) values (4,'SICOSS','CONCEPTOS FACT','02','FACTURACION FSE','FACTURACION RELATIVA AL FSE','FACTURACION FSE',to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2019 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));

COMMIT;