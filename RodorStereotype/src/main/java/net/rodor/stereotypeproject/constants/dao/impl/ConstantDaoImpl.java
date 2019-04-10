package net.rodor.stereotypeproject.constants.dao.impl;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import net.rodor.stereotypeproject.constants.dao.ConstantDao;
import net.rodor.stereotypeproject.constants.dao.ConstantRowMapper;
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
		List<Constant> constantesOrdenadas = hibernateTemplate.loadAll(Constant.class) ;
		Collections.sort(constantesOrdenadas);
		return constantesOrdenadas;
		
		//return hibernateTemplate.loadAll(Constant.class) ;
	}

	public List<Constant> getAllByDate(Timestamp fecha) {
		String sql = "select id,clave,descripcion,fechini,fechfin from RODOR_CONSTANTS where fechini <= ? and fechfin > ?";
		java.sql.Date fechaActivo = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		if(fecha != null){
			fechaActivo = new java.sql.Date(fecha.getTime());
		}
		ConstantRowMapper rowmapper = new ConstantRowMapper();
		Object[] args=new Object[] {fechaActivo,fechaActivo};
		List<Constant> result =jdbcTemplate.query(sql, args, rowmapper);
		return result;
	}
}
