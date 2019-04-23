package net.rodor.stereotypeproject.roles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import net.rodor.stereotypeproject.navs.entity.NavEntry;
import net.rodor.stereotypeproject.roles.service.AuthorityService;

@Controller
@RequestMapping("/roles")
public class AuthorityController {
	
	@Autowired
	private AuthorityService service;

	public AuthorityService getConstantService() {
		return service;
	}

	public void setConstantService(AuthorityService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String goRoles(ModelMap model) {
		
		return "roles/listadoRoles";
	}

}
