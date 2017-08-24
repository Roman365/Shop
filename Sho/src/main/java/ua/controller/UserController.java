package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ua.domain.request.RegistrationRequest;
import ua.service.UserService;

import javax.validation.Valid;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/registration")
	public String registrationPage(Model model) {
		model.addAttribute("user", new RegistrationRequest());
		return "registration";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/registration")
	public String registration(@ModelAttribute("user") @Valid BindingResult bindingResult, RegistrationRequest registrationRequest) {
		if(bindingResult.hasErrors()){return "registration";}
		userService.save(registrationRequest);
		return "redirect:/login";
	}
}
