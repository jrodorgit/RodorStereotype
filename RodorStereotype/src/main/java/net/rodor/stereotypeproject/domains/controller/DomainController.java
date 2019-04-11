package net.rodor.stereotypeproject.domains.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

	/** Nuevo valor de Dominio ***/
	@RequestMapping("/nuevaDomainValue")
	public String formAddDomainValue(ModelMap model) {

		return "domains/formAddDomainValue";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addConstant(@ModelAttribute("domain") Domain domain, ModelMap model) {

		// add valor de dominio
		service.save(domain);

		// vamos a pagina de listado
		return new ModelAndView("redirect:/domains/", model);
	}
	
	/*** borrado de valor de dominio **/

	@RequestMapping("/borrarDomain")
	public ModelAndView deleteDomainValue(@RequestParam("id") int id, ModelMap model) {

		service.delete(service.getDomainValue(id));

		// vamos a pagina de listado
		return new ModelAndView("redirect:/domains/", model);
	}
	
	/*** actualizacion de valor de dominio ***/
	@RequestMapping("/editDomain")
	public String formEditDomainValue(@RequestParam("id") int id, ModelMap model) {

		model.addAttribute("item", service.getDomainValue(id));
		return "domains/formEditDomainValue";
	}

	@RequestMapping(value = "/actualiza", method = RequestMethod.POST)
	public ModelAndView updateDomainValue(@ModelAttribute("domain") Domain domain, ModelMap model) {

		// update constante
		service.update(domain);

		// vamos a pagina de listado
		return new ModelAndView("redirect:/domains/", model);
	}
}
