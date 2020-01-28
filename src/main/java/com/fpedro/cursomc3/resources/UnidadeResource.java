package com.fpedro.cursomc3.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/unidades")
public class UnidadeResource {

	
	public String listar() {
		return "REST está funcionando";
	}
}
