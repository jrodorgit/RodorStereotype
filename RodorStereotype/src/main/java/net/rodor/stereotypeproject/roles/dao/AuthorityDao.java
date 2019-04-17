package net.rodor.stereotypeproject.roles.dao;

import java.sql.Timestamp;
import java.util.List;

public interface AuthorityDao {

	public static final String ROLES_GET_USER_AUTH = "select acccode as authority from rodor_authorities";
	
	/**
	 * Devuelve la relacion de autorizaciones que tiene activas un usuario en una aplicacion/modulo/servicio a una fecha.
	 * @param usercode
	 * @param acccode
	 * @param date
	 * @return List<String>
	 */
	List<String> findUserAuthorities(String usercode, String acccode, Timestamp date);
	
}
