package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import ua.entity.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer>{
	
	SubCategory findByName(String name);

}
