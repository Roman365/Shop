package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import ua.entity.SubSubCategory;

public interface SubSubCategoryRepository extends JpaRepository<SubSubCategory, Integer>{
	
	SubSubCategory findByName(String name);

	
}
