package cat.institutmarianao.tickets.webclient.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelview = new ModelAndView("welcome");
		modelview.getModelMap().addAttribute("welcome", "Welcome to Tickets!");
		modelview.getModelMap().addAttribute("tagline", "A simple ticket reservation service by Institut Marianao");
		return modelview;
	}

}
