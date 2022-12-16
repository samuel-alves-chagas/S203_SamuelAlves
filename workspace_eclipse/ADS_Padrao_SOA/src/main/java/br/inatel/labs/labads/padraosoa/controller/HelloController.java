package br.inatel.labs.labads.padraosoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
	
	@GetMapping
	public MyMessage processaGetHello() {
		MyMessage msg = new MyMessage();
		msg.setInfo("Olá, padrao arquiteturar SOA");
		return msg;
	}

}
