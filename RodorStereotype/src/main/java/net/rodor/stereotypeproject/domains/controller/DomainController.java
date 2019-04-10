package net.rodor.stereotypeproject.domains.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import net.rodor.stereotypeproject.constants.entity.Constant;
import net.rodor.stereotypeproject.constants.service.ConstantService;
import net.rodor.stereotypeproject.domains.entity.Domain;
import net.rodor.stereotypeproject.domains.service.DomainService;

@Controller
@RequestMapping("/domains")
public class DomainController {
	
	@Autowired
	private DomainService service;

	public DomainService getConstantService() {
		return service;
	}

	public void setConstantService(DomainService service) {
		this.service = service;
	}

	@RequestMapping("/")
	public String goDomains(ModelMap model) {

		
		// llamada al servicio de listar todos los valores de dominios
		List<Domain> listado = service.getDomainsValue();
		model.addAttribute("lst", listado);
		return "domains/listadoDomain";
		
		
		
		
		
		
	}

}
