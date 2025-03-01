package com.example.WearchWeb.model.remote.controller;

import com.example.WearchWeb.model.entity.Category;
import com.example.WearchWeb.model.entity.ClothesItem;
import com.example.WearchWeb.service.CategoryService;
import com.example.WearchWeb.service.ClothesItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * RestAPI用コントローラー
 */
@RestController
public class RestApiController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ClothesItemService clothesItemService;

    /**
     * カテゴリー一覧取得API
     *
     * @return　カテゴリー一覧
     */
    @GetMapping("/api/v1/category/list")
    public List<Category> categoryListAll() {
//        カテゴリーの全てのリストを返す
        return categoryService.getAllCategory();
    }

    /**
     * 洋服情報の一覧取得API
     * @return　洋服情報一覧
     */
    @GetMapping("/api/v1/clothesitem/list")
    public List<ClothesItem> clothesItemListAll() {
//        洋服情報の全てのリストを返す
        return clothesItemService.getAllClothesItem();
    }

}
