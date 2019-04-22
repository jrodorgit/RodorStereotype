--Componente Roles. Funcionalidades habilitadas para un usuario.

-- CATALOGO DE FUNCIONALIDADES
CREATE TABLE RODOR_AUTHORITIES(
id NUMBER(10) NOT NULL,
acccode VARCHAR2(20) NOT NULL ,
accdesc VARCHAR2(80) NOT NULL ,
CONSTRAINT RODOR_AUTHORITIES_PK PRIMARY KEY(ID)
) 
LOGGING;
COMMENT ON TABLE RODOR_AUTHORITIES IS 'Funcionalides asociadas a una aplicacion';
COMMENT ON COLUMN RODOR_AUTHORITIES.id IS 'idnetificador unico de la funcionalidad';
COMMENT ON COLUMN RODOR_AUTHORITIES.acccode IS 'Codigo de la accion';
COMMENT ON COLUMN RODOR_AUTHORITIES.accdesc IS 'Descripcion de la accion';


--REM INSERTING into RODOR_AUTHORITIES
Insert into RODOR_AUTHORITIES (id,acccode,accdesc) values (1,'AP1','ACCESO AL APLICATIVO AP1');
Insert into RODOR_AUTHORITIES (id,acccode,accdesc) values (2,'AP1_MD1','ACCESO AL MODULO MD1 DE AP1');
Insert into RODOR_AUTHORITIES (id,acccode,accdesc) values (3,'AP1_MD1_SERV1','ACCESO AL SERVICIO SERV1 DEL MODULO MD1 DE AP1');
Insert into RODOR_AUTHORITIES (id,acccode,accdesc) values (4,'AP1_MD1_SERV1_ADDENT','ACCESO ANADIR ENTIDAD');
Insert into RODOR_AUTHORITIES (id,acccode,accdesc) values (5,'AP1_MD1_SERV1_DELENT','ACCESO BORRAR ENTIDAD');
Insert into RODOR_AUTHORITIES (id,acccode,accdesc) values (6,'AP1_MD1_SERV1_UPDENT','ACCESO UPDATE ENTIDAD');
Insert into RODOR_AUTHORITIES (id,acccode,accdesc) values (7,'AP1_MD1_SERV1_REAENT','ACCESO LECTURA ENTIDAD');

COMMIT;

-- CATALOGO DE ROLES
CREATE TABLE RODOR_ROLES(
id NUMBER(5) NOT NULL,
rolcode VARCHAR2(20) NOT NULL ,
roldesc VARCHAR2(80) NOT NULL,
CONSTRAINT RODOR_ROLES_PK PRIMARY KEY(ID) 
) 
LOGGING;
COMMENT ON TABLE RODOR_ROLES IS 'Roles asociadas a una aplicacion';
COMMENT ON COLUMN RODOR_ROLES.id IS 'identificador unico del rol';
COMMENT ON COLUMN RODOR_ROLES.rolcode IS 'Codigo del rol';
COMMENT ON COLUMN RODOR_ROLES.roldesc IS 'Descripcion del rol';


--REM INSERTING into RODOR_ROLES
Insert into RODOR_ROLES (id,rolcode,roldesc) values (1,'AP1_ADM','ROL ACCESO COMO ADMINISTRADOR A LA APLICACION AP1');
Insert into RODOR_ROLES (id,rolcode,roldesc) values (2,'AP1_USR','ROL ACCESO COMO USUARIO A APLICACION AP1');


COMMIT;

-- RELACION DE ROLES QUE TIENEN PERMISOS PARA EJECUTAR FUNCIONALIDADES 
CREATE TABLE RODOR_AUTHORITIES_ROLES(
id NUMBER(10) NOT NULL,
idauth NUMBER(5) NOT NULL,
idrol NUMBER(5) NOT NULL ,
CONSTRAINT RODOR_AUTHORITIES_ROLES_PK PRIMARY KEY(ID)
) 
LOGGING;
COMMENT ON TABLE RODOR_AUTHORITIES_Roles IS 'RELACION DE ROLES QUE TIENEN PERMISOS PARA EJECUTAR FUNCIONALIDADES';
COMMENT ON COLUMN RODOR_AUTHORITIES_Roles.id IS 'Identificador unico del permiso';
COMMENT ON COLUMN RODOR_AUTHORITIES_Roles.idauth IS 'Identificador de la funcionalidad';
COMMENT ON COLUMN RODOR_AUTHORITIES_Roles.idrol IS 'Identificador del rol';

--REM INSERTING into RODOR_ROLES
Insert into RODOR_AUTHORITIES_ROLES (id, idauth,idrol) values (1,1,1);
Insert into RODOR_AUTHORITIES_ROLES (id, idauth,idrol) values (2,2,1);
Insert into RODOR_AUTHORITIES_ROLES (id, idauth,idrol) values (3,3,1);
Insert into RODOR_AUTHORITIES_ROLES (id, idauth,idrol) values (4,4,1);
Insert into RODOR_AUTHORITIES_ROLES (id, idauth,idrol) values (5,5,1);
Insert into RODOR_AUTHORITIES_ROLES (id, idauth,idrol) values (6,6,1);
Insert into RODOR_AUTHORITIES_ROLES (id, idauth,idrol) values (7,7,2);
Insert into RODOR_AUTHORITIES_ROLES (id, idauth,idrol) values (7,1,2);
Insert into RODOR_AUTHORITIES_ROLES (id, idauth,idrol) values (7,2,2);
Insert into RODOR_AUTHORITIES_ROLES (id, idauth,idrol) values (7,3,2);



COMMIT;


-- CATALOGO DE GRUPOS
CREATE TABLE RODOR_GROUPS(
id NUMBER(5) NOT NULL,
groupcode VARCHAR2(20) NOT NULL ,
groupdesc VARCHAR2(80) NOT NULL ,
CONSTRAINT RODOR_GROUPS_ROLES_PK PRIMARY KEY(ID)
) 
LOGGING;
COMMENT ON TABLE RODOR_GROUPS IS 'Grupos definidos';
COMMENT ON COLUMN RODOR_GROUPS.id IS 'identificador unico del grupo';
COMMENT ON COLUMN RODOR_GROUPS.groupcode IS 'Codigo del grupo';
COMMENT ON COLUMN RODOR_GROUPS.groupdesc IS 'Descripcion del grupo';


--REM INSERTING into RODOR_GROUPS
Insert into RODOR_GROUPS (id,groupcode,groupdesc) values (1,'ADM1','GRUPO ADMINISTRADORES');
Insert into RODOR_GROUPS (id,groupcode,groupdesc) values (2,'USR1','USUARIOS GENERICOS BLA BLA');


COMMIT;



-- GRUPOS DE ROLES
CREATE TABLE RODOR_ROLES_GROUPS(
id NUMBER(10) NOT NULL,
idgroup NUMBER(5) NOT NULL,
idrol NUMBER(5) NOT NULL,
startdate TIMESTAMP NOT NULL ,
enddate TIMESTAMP NOT NULL ,
CONSTRAINT RODOR_ROLES_GROUPS_PK PRIMARY KEY(ID)  
) 
LOGGING;
COMMENT ON TABLE RODOR_ROLES_GROUPS IS 'RELACION DE ROLES QUE PERTENECEN A UN GRUPO EN UN PERIODO DE TIEMPO';
COMMENT ON COLUMN RODOR_ROLES_GROUPS.id IS 'Identificador unico del registro';
COMMENT ON COLUMN RODOR_ROLES_GROUPS.idgroup IS 'Identificador deL GRUPO';
COMMENT ON COLUMN RODOR_ROLES_GROUPS.idrol IS 'Identificador del rol';
COMMENT ON COLUMN RODOR_ROLES_GROUPS.startdate IS 'fecha de inicio de validez del rol en el grupo';
COMMENT ON COLUMN RODOR_ROLES_GROUPS.enddate IS 'fecha de fin de validez del rol en el grupo';

--REM INSERTING into RODOR_ROLES_Groups
Insert into RODOR_ROLES_GROUPS (id,idgroup,idrol,startdate,enddate) values (1,1,1,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2020 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));
Insert into RODOR_ROLES_GROUPS (id,idgroup,idrol,startdate,enddate) values (1,1,2,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2020 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));
Insert into RODOR_ROLES_GROUPS (id,idgroup,idrol,startdate,enddate) values (2,2,2,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2028 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));


COMMIT;


-- CATALOGO DE USUARIOS
CREATE TABLE RODOR_USERS(
id NUMBER(5) NOT NULL,
usercode VARCHAR2(80) NOT NULL ,
usrdesc VARCHAR2(80) NOT NULL ,
startdate TIMESTAMP NOT NULL ,
enddate TIMESTAMP NOT NULL ,
CONSTRAINT RODOR_USERS_PK PRIMARY KEY(ID)  
) 
LOGGING;
COMMENT ON TABLE RODOR_USERS IS 'Usuarios definidos';
COMMENT ON COLUMN RODOR_USERS.id IS 'Identificador unico del registro';
COMMENT ON COLUMN RODOR_USERS.usercode IS 'Codigo del usuario en la aplicacion';
COMMENT ON COLUMN RODOR_USERS.usrdesc IS 'DEescripcion del usuario';
COMMENT ON COLUMN RODOR_USERS.startdate IS 'fecha de inicio de validez del usuario';
COMMENT ON COLUMN RODOR_USERS.enddate IS 'fecha de fin de validez del usuario';

--REM INSERTING into RODOR_USERS
Insert into RODOR_USERS (id,usercode,usrdesc,startdate,enddate) values (1,'USER_41','usrdesc usuario 41',to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2020 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));
Insert into RODOR_USERS (id,usercode,usrdesc,startdate,enddate) values (2,'USER_42','usrdesc usuario 42',to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2020 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));


COMMIT;


-- GRUPOS DE USUARIOS
CREATE TABLE RODOR_USERS_GROUPS(
id NUMBER(5) NOT NULL,
idgroup NUMBER(5) NOT NULL,
idusr NUMBER(5) NOT NULL,
startdate TIMESTAMP NOT NULL ,
enddate TIMESTAMP NOT NULL  ,
CONSTRAINT RODOR_USERS_GROUPS_PK PRIMARY KEY(ID) 
) 
LOGGING;
COMMENT ON TABLE RODOR_USERS_GROUPS IS 'RELACION DE usuarios QUE PERTENECEN A UN GRUPO EN UN PERIODO DE TIEMPO';
COMMENT ON COLUMN RODOR_USERS_GROUPS.idgroup IS 'Identificador deL GRUPO';
COMMENT ON COLUMN RODOR_USERS_GROUPS.idusr IS 'Identificador del usuario';
COMMENT ON COLUMN RODOR_USERS_GROUPS.startdate IS 'fecha de inicio de validez del usuario en el grupo';
COMMENT ON COLUMN RODOR_USERS_GROUPS.enddate IS 'fecha de fin de validez del usuario en el grupo';

--REM INSERTING into RODOR_ROLES_Groups
Insert into RODOR_USERS_GROUPS (id,idgroup,idusr,startdate,enddate) values (1,1,1,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2020 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));
Insert into RODOR_USERS_GROUPS (id, idgroup,idusr,startdate,enddate) values (2,2,2,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'),to_timestamp('31/12/2028 00:00:00,000000000','DD/MM/YYYY HH24:MI:SS,FF'));


COMMIT;
