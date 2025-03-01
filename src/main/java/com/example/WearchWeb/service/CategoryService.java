package com.example.WearchWeb.service;

import com.example.WearchWeb.model.entity.Category;
import com.example.WearchWeb.model.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * カテゴリー情報を全て取得する
     */
    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        categoryRepository.findAll().forEach(list::add);
        return list;
    }

}
