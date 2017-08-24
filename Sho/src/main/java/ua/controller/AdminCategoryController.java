package ua.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.entity.Category;
import ua.service.CategoryService;



@Controller
@RequestMapping("/admin/category")
@SessionAttributes("category")
public class AdminCategoryController {
	
	private final CategoryService service;
	
	@ModelAttribute("category")
	public Category getForm() {
		return new Category();
	}

	@Autowired
	public AdminCategoryController(CategoryService service) {
		this.service = service;
	}
	
	@GetMapping
	public String show(Model model) {
		model.addAttribute("categorys", service.findAll());
		return "category";
	}
	
	@PostMapping
	public String add(@ModelAttribute("category") @Valid Category category, BindingResult br, Model model, SessionStatus ss) {
		if(br.hasErrors()) {
			show(model);
			return "category";
		}
		service.save(category);
		ss.setComplete();
		return "redirect:/admin/category";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/admin/category";
	}

}
