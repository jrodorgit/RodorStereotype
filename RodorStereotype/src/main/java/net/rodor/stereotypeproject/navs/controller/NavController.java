package net.rodor.stereotypeproject.navs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import net.rodor.stereotypeproject.navs.entity.NavEntry;
import net.rodor.stereotypeproject.navs.service.NavService;

@Controller
@RequestMapping("/navs")
public class NavController {

	@Autowired
	private NavService service;

	public NavService getConstantService() {
		return service;
	}

	public void setConstantService(NavService service) {
		this.service = service;
	}

	@RequestMapping("/")
	public String goNavs(ModelMap model) {
		// carga de modulos
		List<NavEntry> modulos = service.getAppNav("SICOSS", null);
		
		// carga de servicios asociados a cada modulo.
		for( NavEntry modulo: modulos) {
			modulo.setSubmenus(service.getNavEntries("SICOSS", modulo.getCode(), null));
		}
		model.addAttribute("modulos", modulos);
		return "navs/app-home";
	}
}
