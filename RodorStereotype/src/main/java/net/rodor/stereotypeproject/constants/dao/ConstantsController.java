package net.rodor.stereotypeproject.constants.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import net.rodor.stereotypeproject.constants.entity.Constant;
import net.rodor.stereotypeproject.constants.service.ConstantService;

@Controller
@RequestMapping("/constants")
public class ConstantsController {

	@Autowired
	private ConstantService constantService;
	
	
	@RequestMapping("/")
	public String goConstants(ModelMap model){
		System.out.println("Entrando en goConstants");

		// llamada al servicio de listar todas las constantes
		List<Constant> constants = constantService.getConstants();
		model.addAttribute("lstConstant", constants);
		return "constants/listadoConstant";
	}
	
}
