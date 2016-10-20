package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.algaworks.brewer.model.Cerveja;

@Controller
public class CervejasController {

	public CervejasController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping("/cervejas/novo")
	public String novo(){
		return "cerveja/CadastroCerveja";
	}
	
	@RequestMapping(value = "/cervejas/novo" , method = RequestMethod.POST)
	public String cadastrar(Cerveja c){
		System.out.println("EAAAAEEEEE" + c.getNome());
		return "cerveja/CadastroCerveja";
	}

}
