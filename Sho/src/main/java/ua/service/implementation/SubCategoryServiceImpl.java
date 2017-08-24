package ua.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.SubCategory;
import ua.repository.SubCategoryRepository;
import ua.service.SubCategoryService;


@Service
public class SubCategoryServiceImpl extends CrudServiceImpl<SubCategory, Integer> implements SubCategoryService{

	@Autowired
	public SubCategoryServiceImpl(SubCategoryRepository repository) {
		super(repository);
	}
}
