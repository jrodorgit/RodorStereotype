package net.rodor.stereotypeproject.navs.service;

import java.sql.Timestamp;
import java.util.List;

import net.rodor.stereotypeproject.navs.entity.NavEntry;

public interface NavService {

	/**
	 * Devuelve la relacion de entradas de menu principales ( modulos ) de una
	 * aplicacion en una fecha. Si la fecha es null devuelve las activas a fecha de
	 * consulta
	 * 
	 * @param app
	 * @param date
	 * @return
	 */
	List<NavEntry> getAppNav(String app, Timestamp date);

	/**
	 * Devuelve la relacion de sub-entradas de menu de un modulo de una aplicacion
	 * en una fecha. Si la fecha es null devuelve las activas a fecha de consulta.
	 * 
	 * @param app
	 * @param parentCode
	 * @param date
	 * @return
	 */
	List<NavEntry> getNavEntries(String app, String parentCode, Timestamp date);

}
