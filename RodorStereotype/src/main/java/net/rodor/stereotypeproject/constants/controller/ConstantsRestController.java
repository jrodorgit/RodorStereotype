package net.rodor.stereotypeproject.constants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.rodor.stereotypeproject.constants.entity.Constant;
import net.rodor.stereotypeproject.constants.service.ConstantService;

//@RestController // opcion A del metodo
@Controller
@RequestMapping("/constants/rest")
public class ConstantsRestController {
	@Autowired
	private ConstantService constantService;

	public ConstantService getConstantService() {
		return constantService;
	}

	public void setConstantService(ConstantService constantService) {
		this.constantService = constantService;
	}
/**** oopcion A
	@RequestMapping("/activa")
	public @ResponseBody String getConstanteActiva(@RequestParam(value="clave") String name) {
		
		Constant obj = new Constant();
		List<Constant> listadoConstActivas = constantService.getAllByDate(null);
		for( Constant constAux : listadoConstActivas) {
			if(constAux.getClave().equalsIgnoreCase(name)) {
				obj = constAux;
			}
		}
		
		//Constant obj = constantService.getConstant(1);
        return obj.toJSONFormat();
    }
    ***/
	// acceso al servicio REST http://localhost:8080/stereotypeproject/constants/rest/activa?clave=GOOGLE
	@RequestMapping("/activa")
	@ResponseBody
	public  Constant getConstanteActiva(@RequestParam(value="clave") String name) {
		
		Constant obj = null;
		List<Constant> listadoConstActivas = constantService.getAllByDate(null);
		for( Constant constAux : listadoConstActivas) {
			if(constAux.getClave().equalsIgnoreCase(name)) {
				obj = constAux;
			}
		}
		
		return obj;

    }

	
}
