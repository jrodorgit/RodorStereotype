package net.rodor.stereotypeproject.domains.dao.impl;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import net.rodor.stereotypeproject.domains.dao.DomainAppRowMapper;
import net.rodor.stereotypeproject.domains.dao.DomainDao;
import net.rodor.stereotypeproject.domains.dao.DomainsInAppRowMapper;
import net.rodor.stereotypeproject.domains.entity.Domain;

@Repository
public class DomainDaoImpl implements DomainDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
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

	@Override
	public List<Domain> findApps() {
		
		DomainAppRowMapper rowmapper = new DomainAppRowMapper();
		Object[] args=null;
		List<Domain> result =jdbcTemplate.query(DOMAIN_GET_APPS, args, rowmapper);
		return result;
	}

	@Override
	public List<Domain> findDomainsInApp(String app, Timestamp date) {
		DomainsInAppRowMapper rowmapper = new DomainsInAppRowMapper();
		Object[] args=new Object[]{app,date,date};
		List<Domain> result =jdbcTemplate.query(DOMAIN_GET_DOMIANS_IN_APP, args, rowmapper);
		return result;
	}

}
