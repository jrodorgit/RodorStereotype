package net.rodor.stereotypeproject.domains.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import net.rodor.stereotypeproject.domains.entity.Domain;

public class DomainsInAppRowMapper implements RowMapper<Domain> {

	public static final String DOMAIN_NAME_APP = "namedomain";
	
	@Override
	public Domain mapRow(ResultSet rs, int rowNum) throws SQLException {
		Domain obj = new Domain();
		obj.setNamedomain(rs.getString(DOMAIN_NAME_APP));
		return obj;
	}
	
}
