package net.rodor.stereotypeproject.roles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.rodor.stereotypeproject.roles.service.AuthorityService;

@RestController
@RequestMapping("/roles/rest")
public class AuthorityRestController {

	@Autowired
	private AuthorityService service;

	public AuthorityService getConstantService() {
		return service;
	}

	public void setConstantService(AuthorityService service) {
		this.service = service;
	}
	
	// URL: roles/rest/authsApp?usr=USER_41&app=AP1
		@RequestMapping("/authsApp")
		public @ResponseBody List<String> getUserAuths(@RequestParam(value = "usr") String usr,
				@RequestParam(value = "app") String app) {
			return service.getUserAuths(usr, app, null);
		}
}
