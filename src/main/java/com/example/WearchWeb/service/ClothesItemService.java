package com.example.WearchWeb.service;

import com.example.WearchWeb.model.entity.ClothesItem;
import com.example.WearchWeb.model.repository.ClothesItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClothesItemService {

    @Autowired
    private ClothesItemRepository clothesItemRepository;

    /**
     * 洋服情報のデータを全て取得する
     */
    public List<ClothesItem> getAllClothesItem() {
        List<ClothesItem> list = new ArrayList<>();
        clothesItemRepository.findAll().forEach(list::add);
        return list;
    }

}
