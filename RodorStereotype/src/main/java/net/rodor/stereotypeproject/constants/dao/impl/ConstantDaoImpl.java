package net.rodor.stereotypeproject.constants.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import net.rodor.stereotypeproject.constants.dao.ConstantDao;
import net.rodor.stereotypeproject.constants.entity.Constant;

@Repository
public class ConstantDaoImpl implements ConstantDao {

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Constant constant) {
		int result =  (int) hibernateTemplate.save(constant);
		return result;
	}

	@Override
	public void update(Constant constant) {
		hibernateTemplate.update(constant);
	}

	@Override
	public void delete(Constant constant) {
		hibernateTemplate.delete(constant);

	}

	@Override
	public Constant find(int id) {
		Constant entidad = hibernateTemplate.get(Constant.class, id);
		return entidad;
	}

	@Override
	public List<Constant> findAll() {
		return hibernateTemplate.loadAll(Constant.class);
	}

}
