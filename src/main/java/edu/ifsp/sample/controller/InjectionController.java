package edu.ifsp.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InjectionController {

	
    @GetMapping("/injection")
    public String injectionForm() {
        return "injection";
    }

    @PostMapping("/processForm")
    public String processForm(
    		@RequestParam("message") String message, 
    		Model jsp) {
        // Simula a injeção de dados do Spring
        String messageFromSpring = message + " para você também ! =P";
        jsp.addAttribute("teste", messageFromSpring);
        jsp.addAttribute("recicla", message);
        return "injection";
    }
}














