package ua.validator.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import ua.validator.validator.UniqueCategoryValidation;



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = UniqueCategoryValidation.class)
public @interface UniqueCategory {
	
	String message() default "Not Unique";
		
	Class<?>[] groups () default {};
		
	Class<? extends Payload>[] payload() default{};
}
