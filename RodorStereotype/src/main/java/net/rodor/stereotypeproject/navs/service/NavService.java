package net.rodor.stereotypeproject.navs.service;

import java.sql.Timestamp;
import java.util.List;

import net.rodor.stereotypeproject.navs.entity.NavEntry;


public interface NavService {

	List<NavEntry> getAppNav(String app, Timestamp date);
	
	List<NavEntry> getNavEntries(String app, String parentCode, Timestamp date);
	
}
