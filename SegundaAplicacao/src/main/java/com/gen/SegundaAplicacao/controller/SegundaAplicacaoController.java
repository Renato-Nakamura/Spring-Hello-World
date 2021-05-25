package com.gen.SegundaAplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/objetivos")
public class SegundaAplicacaoController {
	@GetMapping
	public String objetivos() {
		return "Meu objetivo essa semana é aprender a utilizar o framework Spring e desenvolver o meu pitch";
	}
}
