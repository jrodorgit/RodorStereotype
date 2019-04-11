package net.rodor.stereotypeproject.domains.dao;

import java.util.List;

import net.rodor.stereotypeproject.domains.entity.Domain;

public interface DomainDao {

	public static final String DOMAIN_GET_APPS = "";
	
	int create(Domain obj);

	void update(Domain obj);

	void delete(Domain obj);

	Domain find(int id);

	List<Domain> findAll();
	
	List<Domain> findApps();
}
