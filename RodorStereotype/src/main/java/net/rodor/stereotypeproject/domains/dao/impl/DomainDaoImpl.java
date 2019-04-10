package net.rodor.stereotypeproject.domains.dao.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import net.rodor.stereotypeproject.domains.dao.DomainDao;
import net.rodor.stereotypeproject.domains.entity.Domain;

@Repository
public class DomainDaoImpl implements DomainDao{

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	@Override
	public int create(Domain obj) {
		int result =  (int) hibernateTemplate.save(obj);
		return result;
	}

	@Override
	public void update(Domain obj) {
		hibernateTemplate.update(obj);
	}

	@Override
	public void delete(Domain obj) {
		hibernateTemplate.delete(obj);

	}

	@Override
	public Domain find(int id) {
		Domain entidad = hibernateTemplate.get(Domain.class, id);
		return entidad;
	}

	@Override
	public List<Domain> findAll() {
		List<Domain> valoresDominio = hibernateTemplate.loadAll(Domain.class) ;
		Collections.sort(valoresDominio);
		return valoresDominio;
		
	}

}
