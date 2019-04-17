package net.rodor.stereotypeproject.roles.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import net.rodor.stereotypeproject.roles.dao.AuthorityDao;
import net.rodor.stereotypeproject.roles.dao.UserAuthRowMapper;

@Repository
public class AuthorityDaoImpl implements AuthorityDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<String> findUserAuthorities(String usercode, String acccode, Timestamp date) {
		UserAuthRowMapper rowmapper = new UserAuthRowMapper();
		Object[] args=new Object[]{usercode,date,date,date,date,date,date,acccode};
		//Object[] args=null;
		List<String> result =jdbcTemplate.query(ROLES_GET_USER_AUTH, args, rowmapper);
		return result;
	}

}
