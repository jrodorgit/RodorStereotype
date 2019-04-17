package net.rodor.stereotypeproject.domains.service;

import java.sql.Timestamp;
import java.util.List;

import net.rodor.stereotypeproject.domains.entity.Domain;

public interface DomainService {

	int save(Domain entidad);

	void update(Domain entidad);

	void delete(Domain entidad);

	Domain getDomainValue(int id);

	List<Domain> getDomainsValue();
	
	/**
	 * Devuleve la relacion de Aplicaciones que tiene definidos dominios
	 * @return Domain ( solo tendran el campo Domain.appdomain
	 */
	List<Domain> getAppsDomain();
	
	/**
	 * Conjunto de dominios con valores activos a una fecha determinado en una aplicacion.
	 * @param app
	 * @param date
	 * @return
	 */
	List<Domain> getDomainsInApp(String app, Timestamp date);
	
	/**
	 * Conjunto de valores de un dominio para una aplicacion que se encuentran activos a una fecha.
	 * @param app
	 * @param domainname
	 * @param date
	 * @return
	 */
	List<Domain> getDomainsInApp(String app, String domainname, Timestamp date);
}
