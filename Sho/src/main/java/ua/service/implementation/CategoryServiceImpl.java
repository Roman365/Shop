package ua.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Category;
import ua.repository.CategoryRepository;
import ua.service.CategoryService;


@Service
public class CategoryServiceImpl extends CrudServiceImpl<Category, Integer> implements CategoryService{

	@Autowired
	public CategoryServiceImpl(CategoryRepository repository) {
		super(repository);
	}

}
