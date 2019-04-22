package net.rodor.stereotypeproject.navs.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import net.rodor.stereotypeproject.navs.dao.NavDao;
import net.rodor.stereotypeproject.navs.dao.NavEntryRowMapper;
import net.rodor.stereotypeproject.navs.entity.NavEntry;

@Repository
public class NavDaoImpl implements NavDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<NavEntry> findAppNav(String app, Timestamp date) {
		
		NavEntryRowMapper rowmapper = new NavEntryRowMapper();
		Object[] args=new Object[]{app,date,date};
		List<NavEntry> result =jdbcTemplate.query(NAVS_GET_APP_NAV, args, rowmapper);
		return result;
	}

	@Override
	public List<NavEntry> findNavEntries(String app, String parentCode, Timestamp date) {
		NavEntryRowMapper rowmapper = new NavEntryRowMapper();
		Object[] args=new Object[]{app, parentCode, date,date};
		List<NavEntry> result =jdbcTemplate.query(NAVS_GET_NAV_ENTRIES, args, rowmapper);
		return result;
	}

}
