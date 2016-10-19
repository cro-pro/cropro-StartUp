package hr.cropro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.cropro.services.TestService;

@Controller
public class GreetingController {
	
	TestService testService = new TestService();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
    
    	String msg = testService.isJaro(name);
    	if(msg != null) {
    		model.addAttribute("name", msg);
    	} else {    	
    		model.addAttribute("name", name);
    	}
    	
        return "greeting";	
    }

}