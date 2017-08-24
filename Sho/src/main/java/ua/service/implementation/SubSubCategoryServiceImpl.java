package ua.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.SubSubCategory;
import ua.repository.SubSubCategoryRepository;
import ua.service.SubSubCategoryService;

@Service
public class SubSubCategoryServiceImpl extends CrudServiceImpl<SubSubCategory, Integer> implements SubSubCategoryService{

	@Autowired
	public SubSubCategoryServiceImpl(SubSubCategoryRepository repository) {
		super(repository);
	}
}