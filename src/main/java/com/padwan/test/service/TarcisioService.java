package com.padwan.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TarcisioService {

	public List<String> skills() {
		List<String> about = new ArrayList<>();
		List<String> skillsPersonal = new ArrayList<>();
		List<String> skillsTechniques = new ArrayList<>();

		about.add("Nome: Tarcisio Valentim Araujo da Silva");
		about.add("Idade: 25anos");
		about.add("Contato: tarcisio.word@gmail.com");

		skillsPersonal.add("Dedicado");
		skillsPersonal.add("Focado");
		skillsPersonal.add("Autodidata");

		skillsTechniques.add("Java");
		skillsTechniques.add("Spring");
		skillsTechniques.add("Angular");
		skillsTechniques.add("SQL");
		
		about.add("Pessoais" + skillsPersonal);
		about.add("Tecnicas" + skillsTechniques);
		
		return about;
	}
}
