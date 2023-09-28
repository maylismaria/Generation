package com.example.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {
	
	@GetMapping
	public String helloworld() {
		return "Hello World!!!!!!!!!";
		
		
	}
	
	@RequestMapping("/listaBsm")
	@GetMapping 
	public List<String> listaBsm () {
		List <String> listaBsm = new ArrayList<>();
		
		listaBsm.add("      LISTA BSM GENERATION BRASIL:      ");
		listaBsm.add("Proatividade");
		listaBsm.add("Persistência");
		listaBsm.add("Orientação ao futuro");
		listaBsm.add("Mentalidade de crescimento");
		listaBsm.add("Comunicação");
		listaBsm.add("Trabalho em equipe");
		listaBsm.add("Orientação aos detalhes");
		listaBsm.add("Responsabilidade pessoal");
		
		return listaBsm;
		
		
	}
	@RequestMapping("/listaAprendizagem")
    @GetMapping
	public List<String> listaAprendizagem () {

	

		List <String> listaAprendizagem = new ArrayList<>();

		
		listaAprendizagem.add("      LISTA APRENDIZAGEM DA SEMANA:      ");
		listaAprendizagem.add("Beck and");
		listaAprendizagem.add("Banco de dados");
		listaAprendizagem.add("Spring");

		return listaAprendizagem;
		
		
		
	}	
	
	
	

}
