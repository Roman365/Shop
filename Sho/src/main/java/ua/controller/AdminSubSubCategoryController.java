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

import ua.entity.SubSubCategory;
import ua.service.SubSubCategoryService;



@Controller
@RequestMapping("/admin/subsubcategory")
@SessionAttributes("subsubcategory")
public class AdminSubSubCategoryController {

	private final SubSubCategoryService service;
	
	@ModelAttribute("subsubcategory")
	public SubSubCategory getForm() {
		return new SubSubCategory();
	}
	
	
	@Autowired
	public AdminSubSubCategoryController(SubSubCategoryService service) {
		this.service = service;
	}

	@GetMapping
	public String show(Model model) {
		model.addAttribute("areas", service.findAll());
		return "subsubcategory";
	}
	
	@PostMapping
	public String add(@ModelAttribute("subsubcategory") @Valid SubSubCategory subSubCategory, BindingResult br, Model model, SessionStatus ss) {
		if(br.hasErrors()) {
			show(model);
			return "subsubcategory";
		}
		service.save(subSubCategory);
		ss.setComplete();
		return "redirect:/admin/subsubcategory";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/admin/subsubcategory";
	}
}
