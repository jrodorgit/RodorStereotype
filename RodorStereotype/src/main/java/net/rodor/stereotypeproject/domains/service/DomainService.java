package net.rodor.stereotypeproject.domains.service;

import java.util.List;

import net.rodor.stereotypeproject.domains.entity.Domain;

public interface DomainService {

	int save(Domain entidad);

	void update(Domain entidad);

	void delete(Domain entidad);

	Domain getDomainValue(int id);

	List<Domain> getDomainsValue();
}
