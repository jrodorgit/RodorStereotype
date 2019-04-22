package net.rodor.stereotypeproject.navs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import net.rodor.stereotypeproject.navs.entity.NavEntry;

public class NavEntryRowMapper implements RowMapper<NavEntry> {
	
	public static final String NAV_ID = "id";
	public static final String NAV_APP = "app";
	public static final String NAV_PARENT_CODOE = "parentCode";
	public static final String NAV_CODE = "code";
	public static final String NAV_ORDEN = "orden";
	public static final String NAV_URI = "uri";
	

	@Override
	public NavEntry mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		NavEntry obj = new NavEntry();
		obj.setId(rs.getInt(NAV_ID));
		obj.setApp(rs.getString(NAV_APP));
		obj.setParentCode(rs.getString(NAV_PARENT_CODOE));
		obj.setCode(rs.getString(NAV_CODE));
		obj.setOrden(rs.getInt(NAV_ORDEN));
		obj.setUri(rs.getString(NAV_URI));
		
		return obj;
	}

}
