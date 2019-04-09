package net.rodor.stereotypeproject.constants.controller;

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

@Controller
@RequestMapping("/constants")
public class ConstantsController {

	@Autowired
	private ConstantService constantService;

	public ConstantService getConstantService() {
		return constantService;
	}

	public void setConstantService(ConstantService constantService) {
		this.constantService = constantService;
	}

	@RequestMapping("/")
	public String goConstants(ModelMap model) {
		System.out.println("Entrando en goConstants");

		// llamada al servicio de listar todas las constantes
		List<Constant> constants = constantService.getConstants();
		model.addAttribute("lstConstant", constants);
		return "constants/listadoConstant";
	}

	/** Nueva Constante ***/
	@RequestMapping("/nuevaConstant")
	public String formAddConstant(ModelMap model) {

		System.out.println("formAddConstant");

		return "constants/formAddConstant";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addConstant(@ModelAttribute("constante") Constant constante, ModelMap model) {
		// public String addConstant(@ModelAttribute("constante") Constant constante,
		// ModelMap model) {

		System.out.println("Entrando en addConstant...");

		// add constante
		System.out.println("------------------- Nueva Constante:" + constante);
		constantService.save(constante);

		// vamos a pagina de listado
		return new ModelAndView("redirect:/constants/", model);
	}

	/*** borrado de constante **/

	@RequestMapping("/borrarConstant")
	public ModelAndView deleteConstant(@RequestParam("id") int id, ModelMap model) {

		System.out.println("Id:" + id);
		constantService.delete(constantService.getConstant(id));

		return new ModelAndView("redirect:/constants/", model);
	}
	
	/*** actualizacion de constante ***/
	@RequestMapping("/editConstant")
	public String formEditConstant(@RequestParam("id") int id, ModelMap model) {

		System.out.println("formEditConstant");

		model.addAttribute("item", constantService.getConstant(id));
		return "constants/formEditConstant";
	}
	
	@RequestMapping(value = "/actualiza", method = RequestMethod.POST)
	public ModelAndView updateConstant(@ModelAttribute("constante") Constant constante, ModelMap model) {

		System.out.println("Entrando en updateConstant...");

		// update constante
		System.out.println("------------------- Update Constante:" + constante);
		constantService.update(constante);

		// vamos a pagina de listado
		return new ModelAndView("redirect:/constants/", model);
	}
}
