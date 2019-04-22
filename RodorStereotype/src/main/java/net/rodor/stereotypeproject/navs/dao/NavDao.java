package net.rodor.stereotypeproject.navs.dao;

import java.sql.Timestamp;
import java.util.List;

import net.rodor.stereotypeproject.navs.entity.NavEntry;

public interface NavDao {

	public static final String NAVS_GET_APP_NAV = "select id,app,parentcode, code, orden, uri from RODOR_NAVS where app = ? and PARENTCODE is null and startdate <= ? and enddate > ?";
	public static final String NAVS_GET_NAV_ENTRIES = "select id,app,parentcode, code, orden, uri from RODOR_NAVS where app = ? and PARENTCODE = ? and startdate <= ? and enddate > ?";
	
	List<NavEntry> findAppNav(String app, Timestamp date);
	
	List<NavEntry> findNavEntries(String app, String parentCode, Timestamp date);
	
	
}
