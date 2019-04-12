package net.rodor.stereotypeproject.domains.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.rodor.stereotypeproject.domains.entity.Domain;
import net.rodor.stereotypeproject.domains.service.DomainService;

@RestController
@RequestMapping("/domains/rest")
public class DomainRestController {

	@Autowired
	private DomainService service;

	public DomainService getConstantService() {
		return service;
	}

	public void setConstantService(DomainService service) {
		this.service = service;
	}

	// URL: domains/rest/activosAppDom?app=SICOSS&domain=CONCEPTOS GASTO
	@RequestMapping("/activosAppDom")
	public @ResponseBody List<Domain> getActivosAppDom(@RequestParam(value = "app") String app,
			@RequestParam(value = "domain") String domain) {
		return service.getDomainsInApp(app, domain, null);
	}

	// URL: domains/rest/activosApp?app=SICOSS
	@RequestMapping("/activosApp")
	public @ResponseBody List<Domain> getActivosApp(@RequestParam(value = "app") String app) {
		return service.getDomainsInApp(app, null);
	}

	// URL: domains/rest/app
	@RequestMapping("/app")
	public @ResponseBody List<Domain> getApp() {
		return service.getAppsDomain();
	}

}
