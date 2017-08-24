package ua.editors;

import java.beans.PropertyEditorSupport;

import ua.entity.SubSubCategory;
import ua.service.SubSubCategoryService;



public class SubSubCategoryEditor extends PropertyEditorSupport{

	private final SubSubCategoryService subSubCategoryService;

	public SubSubCategoryEditor(SubSubCategoryService subSubCategoryService) {
		this.subSubCategoryService = subSubCategoryService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		SubSubCategory subSubCategory = subSubCategoryService.findOne(Integer.parseInt(text));
		setValue(subSubCategory);
	}
	
	
}
