package pl.sebitg.training.web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JsonController {
	
	@RequestMapping(value = "/foo.json", method = RequestMethod.GET, headers="Accept=application/json", produces = { "application/json" })
	@ResponseBody
	public Map<String, Object> foo(ModelAndView model) {
		model.addObject("something", "Yo!");
		return model.getModel();
	}

}