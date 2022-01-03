package org.generation.italy.controller;


import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping("/")
	public String list(Model model, @RequestParam(name = "name", defaultValue = "Default") String nameParam) {
		model.addAttribute("name", "Gianluca");
		return "list";
	}
	
	//non sono film/canzoni del 2021, non ho guardato/sentito quasi nulla di quest'anno
	
	@GetMapping("/film")
	public String film(Model model) {
		model.addAttribute("film", Arrays.asList("Shawshank Redemption", "American Psycho", "Koe no Katachi", "The Last Samurai", "The Irish Man", "Forrest Gump"));
		
		return "film";
	}
	
	@GetMapping("/canzoni")
	public String canzoni(Model model) {
		model.addAttribute("canzoni", Arrays.asList("Ne Obliviscaris - Painters of the Tempest", "Shadow of Intent - Tartarus Impalement", "Linked Horizon - Akatsuki no Requiem", "Humanoid - MENDES", "Fleshgod Apocalypse - In Aeternum", "Nobuo Uematsu - Answers"));
		
		return "canzoni";
	}
}

