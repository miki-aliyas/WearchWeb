package com.example.WearchWeb.model.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "image_name")
    private String imageName;

    @OneToMany(
            mappedBy = "category",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ClothesItem> clothesItemList = new ArrayList<>();

    public Category() {}

    public Category(String categoryName, String imageName) {
        this.categoryName = categoryName;
        this.imageName = imageName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setClothesItemList(List<ClothesItem> clothesItemList) {
        this.clothesItemList = clothesItemList;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName=" + categoryName +
                ", imageName=" + imageName + '\'' +
                "}";
    }
}
