package hr.cropro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.net.SyslogOutputStream;
import hr.cropro.services.TestService;

@Controller
public class GreetingController {
	
	@Autowired
	TestService testService;

	@RequestMapping("/echo")
	public String echo() {
		return "Halo";
	}
	
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
    
    @RequestMapping("/login")
    public String greeting(Model model) {

        return "login";	
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String signIn(@RequestParam String username, @RequestParam String password, Model model) {
    	
    	model.addAttribute("name", username);
    	model.addAttribute("password", password);
    	
        return "greeting";	
    }

}