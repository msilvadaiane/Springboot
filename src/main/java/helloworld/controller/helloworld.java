package helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	@RequestMapping("/hello")


	public class helloworld {
		@GetMapping
		public String helooword () {
			return "Heloo turma 53";
			
		}	
		
		 @GetMapping("/bsm")
		 public String bsm () {
			 return "Comunicação <br />"
	                 +"Orientação ao Detalhe <br />"
	                 +"Proatividade <br />"
	                 +"Trabalho em Equipe <br />"
	                 +"Mentalidade de Crescimento <br />"
	                 +"Persistência <br />"
	                 +"Responsabilidade Pessoal <br />"
	                 +"Orientação ao Futuro <br />";
			 
		 }
	}

