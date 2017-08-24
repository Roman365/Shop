package ua.editors;

import java.beans.PropertyEditorSupport;

import ua.entity.SubCategory;
import ua.service.SubCategoryService;



public class SubCategoryEditor extends PropertyEditorSupport{

	private final SubCategoryService subCategoryService;

	public SubCategoryEditor(SubCategoryService subCategoryService) {
		this.subCategoryService = subCategoryService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		SubCategory subCategory = subCategoryService.findOne(Integer.parseInt(text));
		setValue(subCategory);
	}

	
	
}
