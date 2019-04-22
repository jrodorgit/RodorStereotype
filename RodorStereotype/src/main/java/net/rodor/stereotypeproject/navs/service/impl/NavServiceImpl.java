package net.rodor.stereotypeproject.navs.service.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.rodor.stereotypeproject.navs.dao.NavDao;
import net.rodor.stereotypeproject.navs.entity.NavEntry;
import net.rodor.stereotypeproject.navs.service.NavService;

@Service
public class NavServiceImpl implements NavService {

	@Autowired
	private NavDao dao;

	@Override
	public List<NavEntry> getAppNav(String app, Timestamp date) {
		if (date == null) {
			date = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		}
		List<NavEntry> objs = dao.findAppNav(app, date);
		Collections.sort(objs);
		return objs;
	}

	@Override
	public List<NavEntry> getNavEntries(String app, String parentCode, Timestamp date) {
		if (date == null) {
			date = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		}
		List<NavEntry> objs = dao.findNavEntries(app, parentCode, date);
		Collections.sort(objs);
		return objs;
	}

}
