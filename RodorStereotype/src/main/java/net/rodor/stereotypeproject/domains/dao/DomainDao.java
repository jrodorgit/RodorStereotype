package net.rodor.stereotypeproject.domains.dao;

import java.util.List;

import net.rodor.stereotypeproject.domains.entity.Domain;

public interface DomainDao {

	int create(Domain obj);

	void update(Domain obj);

	void delete(Domain obj);

	Domain find(int id);

	List<Domain> findAll();
}
