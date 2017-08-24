package ua.validator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.repository.SubCategoryRepository;
import ua.validator.annotation.UniqueSubCategory;



@Component
public class UniqueSubCategoryValidation implements ConstraintValidator<UniqueSubCategory, String>{

	@Autowired
	private SubCategoryRepository repository;
	
	@Override
	public void initialize(UniqueSubCategory arg0) {
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		return repository.findByName(arg0)==null;
	}

}
