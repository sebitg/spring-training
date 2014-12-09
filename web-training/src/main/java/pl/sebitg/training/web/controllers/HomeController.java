package pl.sebitg.training.web.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import pl.sebitg.training.web.forms.FormModel;
import pl.sebitg.training.web.forms.FormModel2;

@Controller
@SessionAttributes({"form", "form2"})
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
	
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerGet(Model model) {
		
		model.addAttribute("form", new FormModel());
		
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPost(@Valid @ModelAttribute FormModel form, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("error", "Some errors occured! Fill again!");
			return "register";
		}
		model.addAttribute("form", form);
		return "redirect:/register2";
	}
	
	@RequestMapping(value = "/register2", method = RequestMethod.GET)
	public String register2Get(Model model) {
		
		model.addAttribute("form2", new FormModel2());
		
		return "register2";
	}
	
	@RequestMapping(value = "/register2", method = RequestMethod.POST)
	public String register2Post(@Valid @ModelAttribute FormModel2 form2, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("error", "Some errors occured! Fill again!");
			return "register2";
		}
		model.addAttribute("form2", form2);
		return "success";
	}
	

}
