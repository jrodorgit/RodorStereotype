package net.rodor.stereotypeproject.domains.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import net.rodor.stereotypeproject.domains.entity.Domain;



public class DomainAppRowMapper implements RowMapper<Domain> {

	public static final String DOMAIN_APP = "appdomain";
	
	@Override
	public Domain mapRow(ResultSet rs, int rowNum) throws SQLException {
		Domain obj = new Domain();
		obj.setAppdomain(rs.getString(DOMAIN_APP));
		return obj;
	}
	
}
