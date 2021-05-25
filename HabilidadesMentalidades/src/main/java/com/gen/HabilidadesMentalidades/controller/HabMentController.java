package com.gen.HabilidadesMentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HabilidadesMentalidades")
public class HabMentController {
	@GetMapping
	static String hem() {
		return "Persistencia,Atenção aos detalhes,Mentalidade de crescimento,Responsabilidade pessoal,Proatividade";
	}
}
