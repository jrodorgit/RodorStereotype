package net.rodor.stereotypeproject.domains.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.rodor.stereotypeproject.constants.entity.Constant;
import net.rodor.stereotypeproject.domains.dao.DomainDao;
import net.rodor.stereotypeproject.domains.entity.Domain;
import net.rodor.stereotypeproject.domains.service.DomainService;

@Service
public class DomainServiceImpl implements DomainService {

	@Autowired
	private  DomainDao dao;
	
	@Override
	@Transactional
	public int save(Domain entidad) {
		return dao.create(entidad);
	}

	@Override
	@Transactional
	public void update(Domain entidad) {
		dao.update(entidad);
	}

	@Override
	@Transactional
	public void delete(Domain entidad) {
		dao.delete(entidad);
	}

	@Override
	public Domain getDomainValue(int id) {
		return dao.find(id);
	}

	@Override
	public List<Domain> getDomainsValue() {
		return dao.findAll();
	}

	public List<Domain> getAppsDomain() {
		return dao.findApps();
	}
}
