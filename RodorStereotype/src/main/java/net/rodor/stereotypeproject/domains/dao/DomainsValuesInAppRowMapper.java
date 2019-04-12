package net.rodor.stereotypeproject.domains.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import net.rodor.stereotypeproject.domains.entity.Domain;

public class DomainsValuesInAppRowMapper implements RowMapper<Domain> {

	public static final String DOMAIN_ID = "id";
	public static final String DOMAIN_NAME_APP = "appdomain";
	public static final String DOMAIN_NAME_DOMAIN = "namedomain";
	public static final String DOMAIN_CODE = "code";
	public static final String DOMAIN_DESC = "description";
	public static final String DOMAIN_DESC_XS = "descriptionxs";
	public static final String DOMAIN_DESC_XL = "descriptionxl";
	
	@Override
	public Domain mapRow(ResultSet rs, int rowNum) throws SQLException {
		Domain obj = new Domain();
		obj.setId(rs.getInt(DOMAIN_ID));
		obj.setAppdomain(rs.getString(DOMAIN_NAME_APP));
		obj.setNamedomain(rs.getString(DOMAIN_NAME_DOMAIN));
		obj.setCode(rs.getString(DOMAIN_CODE));
		obj.setDescription(rs.getString(DOMAIN_DESC));
		obj.setDescriptionXL(rs.getString(DOMAIN_DESC_XL));
		obj.setDescriptionXS(rs.getString(DOMAIN_DESC_XS));
		return obj;
	}
	
}