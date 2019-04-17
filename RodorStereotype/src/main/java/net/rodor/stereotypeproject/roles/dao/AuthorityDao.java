package net.rodor.stereotypeproject.roles.dao;

import java.sql.Timestamp;
import java.util.List;

public interface AuthorityDao {

	//public static final String ROLES_GET_USER_AUTH = "select acccode as authority from rodor_authorities";
	public static final String ROLES_GET_USER_AUTH = "select "+
	"fun.ACCCODE as authority "+
	"from RODOR_USERS usr, RODOR_USERS_GROUPS usrgrp , RODOR_ROLES_GROUPS rolgrp, RODOR_AUTHORITIES_ROLES funrol, RODOR_AUTHORITIES fun "+
	"where usr.usercode = ?  "+
	"and usr.startdate <= ?  "+
	"and usr.enddate > ?  "+
	"and usr.ID = usrgrp.IDUSR "+
	"and usrgrp.startdate <= ? "+
	"and usrgrp.enddate > ? "+
	"and usrgrp.IDGROUP = rolgrp.idgroup "+
	"and rolgrp.startdate <= ?  "+
	"and rolgrp.enddate > ? "+
	"and funrol.IDROL = rolgrp.idrol "+
	"and fun.ID = funrol.IDAUTH "+
	"and fun.acccode = ?   ";
	
	/**
	 * Devuelve la relacion de   autorizaciones que tiene activas un usuario en una aplicacion/modulo/servicio a una fecha.
	 * @param usercode
	 * @param acccode
	 * @param date
	 * @return List<String>
	 */
	List<String> findUserAuthorities(String usercode, String acccode, Timestamp date);
	
	
	/***
	 select fun.ACCCODE from RODOR_USERS usr, RODOR_USERS_GROUPS usrgrp , RODOR_ROLES_GROUPS rolgrp, RODOR_AUTHORITIES_ROLES funrol, RODOR_AUTHORITIES fun 
where usr.usercode = 'USER_41'   and usr.startdate <= '01/01/2019'  and usr.enddate > '01/01/2019'
and usr.ID = usrgrp.IDUSR and usrgrp.startdate <= '01/01/2019' and usrgrp.enddate > '01/01/2019'
and usrgrp.IDGROUP = rolgrp.idgroup and rolgrp.startdate <= '01/01/2019'  and rolgrp.enddate > '01/01/2019' 
and funrol.IDROL = rolgrp.idrol and fun.ID = funrol.IDAUTH and fun.acccode LIKE '%AP1%';

	 */
}
