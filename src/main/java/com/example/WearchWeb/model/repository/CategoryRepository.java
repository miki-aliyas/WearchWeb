package com.example.WearchWeb.model.repository;

import com.example.WearchWeb.model.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
