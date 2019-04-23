package net.rodor.stereotypeproject.navs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.rodor.stereotypeproject.navs.entity.NavEntry;
import net.rodor.stereotypeproject.navs.service.NavService;

@RestController
@RequestMapping("/navs/rest")
public class NavRestController {
	@Autowired
	private NavService service;

	public NavService getConstantService() {
		return service;
	}

	public void setConstantService(NavService service) {
		this.service = service;
	}

	// URL: navs/rest/appNav?app=SICOSS
	@RequestMapping("/appNav")
	public @ResponseBody List<NavEntry> getAppNav(@RequestParam(value = "app") String app) {
		return service.getAppNav(app, null);
	}

	// URL: navs/rest/appNavEntries?app=SICOSS&parentCode=SIC_MOD1
	@RequestMapping("/appNavEntries")
	public @ResponseBody List<NavEntry> getNavEntries(@RequestParam(value = "app") String app,
			@RequestParam(value = "parentCode") String parentCode) {
		return service.getNavEntries(app, parentCode, null);
	}

}
