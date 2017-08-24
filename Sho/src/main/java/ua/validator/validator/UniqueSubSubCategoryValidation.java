package ua.validator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.repository.SubSubCategoryRepository;
import ua.validator.annotation.UniqueSubSubCategory;



@Component
public class UniqueSubSubCategoryValidation implements ConstraintValidator<UniqueSubSubCategory, String>{

	@Autowired
	private SubSubCategoryRepository repository;
	
	@Override
	public void initialize(UniqueSubSubCategory arg0) {
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		return repository.findByName(arg0)==null;
	}

}
