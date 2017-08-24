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

import ua.entity.SubCategory;
import ua.service.SubCategoryService;


@Controller
@RequestMapping("/admin/subcategory")
@SessionAttributes("subcategory")
public class AdminSubCategoryController {

	private final SubCategoryService service;
	
	@ModelAttribute("subcategory")
	public SubCategory getForm() {
		return new SubCategory();
	}

	@Autowired
	public AdminSubCategoryController(SubCategoryService service) {
		this.service = service;
	}
	
	@GetMapping
	public String show(Model model) {
		model.addAttribute("subcategorys", service.findAll());
		return "subcategory";
	}
	
	@PostMapping
	public String add(@ModelAttribute("subcategory") @Valid SubCategory subCategory, BindingResult br, Model model, SessionStatus ss) {
		if(br.hasErrors()) {
			show(model);
			return "subcategory";
		}
		service.save(subCategory);
		ss.setComplete();
		return "redirect:/admin/subcategory";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/admin/subcategory";
	}
}
