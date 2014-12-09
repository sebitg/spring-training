package pl.sebitg.training.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(Model model) {
		return "index";
	}

	@RequestMapping(value = "/somePage/{name}/{lastname}", method = RequestMethod.GET)
	public String somePage1(Model model, @PathVariable("name") String name,
			@PathVariable("lastname") String lastName) {
		
		model.addAttribute("fullname", name + " " + lastName);
		if("Sebastian".equals(name)) {
			model.addAttribute("vip", true);
		}
		
		return "somepage";
	}
	
	
	@RequestMapping(value = "/somePage2", method = RequestMethod.GET)
	public String somePage2(Model model, @RequestParam("name") String name,
			@RequestParam("lastname") String lastName) {
		
		model.addAttribute("fullname", name + " " + lastName);
		if("Sebastian".equals(name)) {
			model.addAttribute("vip", true);
		}
		
		return "somepage";
	}

}
