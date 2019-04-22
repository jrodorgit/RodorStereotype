CREATE TABLE RODOR_NAVS(
id NUMBER(5) NOT NULL,
app VARCHAR2(20) NOT NULL ,
parentcode VARCHAR2(20) NULL ,
code VARCHAR2(20) NOT NULL ,
uri VARCHAR2(256)  NULL ,
startdate TIMESTAMP NOT NULL ,
enddate TIMESTAMP NOT NULL ,
CONSTRAINT RODOR_NAVS_PK PRIMARY KEY(ID)
) 
LOGGING;
COMMENT ON TABLE RODOR_NAVS IS 'Menus';
COMMENT ON COLUMN RODOR_NAVS.id IS 'Identificador unico del registro';
COMMENT ON COLUMN RODOR_NAVS.app IS 'Aplicacion a la que pertenece el menu';
COMMENT ON COLUMN RODOR_NAVS.parentcode IS 'Menu padre al que pertenece la entrada. Si es null quiere decir que cuelga de app directamente. Es un modulo';
COMMENT ON COLUMN RODOR_NAVS.code IS 'Codigo del elemento del menu';
COMMENT ON COLUMN RODOR_NAVS.uri IS 'URI o URL de acceso a la opcion de menu. Si es null quiere decir que no es una entrada propiamente dicha sino un modulo';
COMMENT ON COLUMN RODOR_NAVS.startdate IS 'fecha de inicio de validez del elemento';
COMMENT ON COLUMN RODOR_NAVS.enddate IS 'fecha de fin de validez del elemento';


Insert into RODOR_NAVS (id, app, parentcode, code, uri, startdate, enddate) values (1,'SICOSS',null,'SIC_MOD1',null,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2019 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));
Insert into RODOR_NAVS (id, app, parentcode, code, uri, startdate, enddate) values (2,'SICOSS','SIC_MOD1','SIC_MOD1_SERV1','/MOD1/SERV1',to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2019 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));
Insert into RODOR_NAVS (id, app, parentcode, code, uri, startdate, enddate) values (3,'SICOSS','SIC_MOD1','SIC_MOD1_SERV2','/MOD1/SERV2',to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2019 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));
Insert into RODOR_NAVS (id, app, parentcode, code, uri, startdate, enddate) values (4,'SICOSS',null,'SIC_MOD2',null,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2019 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));
Insert into RODOR_NAVS (id, app, parentcode, code, uri, startdate, enddate) values (5,'SICOSS','SIC_MOD2','SIC_MOD2_SERV3','/MOD2/SERV3',to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2019 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));
Insert into RODOR_NAVS (id, app, parentcode, code, uri, startdate, enddate) values (6,'SICOSS',null,'SIC_MOD3','/MOD3',to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2019 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));

commit;