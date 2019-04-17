package net.rodor.stereotypeproject.roles.service;

import java.sql.Timestamp;
import java.util.List;


public interface AuthorityService {

	/**
	 * Devuelve la relacion de autorizaciones que tiene activas un usuario en una aplicacion/modulo/servicio a una fecha.
	 * @param usercode
	 * @param acccode Si es nullo se entiende que es la relacion de todas las autorizaciones para todas las aplicaciones.
	 * @param date Si es nullo se entiende que son las activas a fecha actual
	 * @return List<String>
	 */
	List<String> getUserAuths(String usercode, String acccode, Timestamp date);
}
