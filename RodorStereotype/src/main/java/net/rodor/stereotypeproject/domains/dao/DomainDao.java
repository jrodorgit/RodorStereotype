package net.rodor.stereotypeproject.domains.dao;

import java.sql.Timestamp;
import java.util.List;

import net.rodor.stereotypeproject.domains.entity.Domain;

public interface DomainDao {

	public static final String DOMAIN_GET_APPS = "select DISTINCT(APPDOMAIN) AS appdomain from RODOR_DOMAINS order by appdomain asc";
	public static final String DOMAIN_GET_DOMIANS_IN_APP = "select  DISTINCT(namedomain) AS namedomain from RODOR_DOMAINS where appdomain = ? and startdate <= ? and enddate > ?";
	
	int create(Domain obj);

	void update(Domain obj);

	void delete(Domain obj);

	Domain find(int id);

	List<Domain> findAll();
	
	List<Domain> findApps();
	
	/**
	 * Conjunto de dominios con valores activos a una fecha determinado en una aplicacion.
	 * @param app
	 * @param date
	 * @return
	 */
	List<Domain> findDomainsInApp(String app, Timestamp date);
}
