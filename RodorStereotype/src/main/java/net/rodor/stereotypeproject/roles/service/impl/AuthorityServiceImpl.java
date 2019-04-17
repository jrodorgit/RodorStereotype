package net.rodor.stereotypeproject.roles.service.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.rodor.stereotypeproject.roles.dao.AuthorityDao;
import net.rodor.stereotypeproject.roles.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private  AuthorityDao dao;
	
	@Override
	public List<String> getUserAuths(String usercode, String acccode, Timestamp date) {
		
		if(date == null){
			date = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		}
		return dao.findUserAuthorities(usercode, acccode, date);
	}

}
