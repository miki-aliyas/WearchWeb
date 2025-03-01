package com.example.WearchWeb.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ClothesItem")
public class ClothesItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //　画像名
    @Column(name = "image_name")
    private String imageName;

   @ManyToOne
   @JoinColumn(name = "category_id")
   private Category category;

    //　サイズ(String)
    @Column(name = "size_name")
    private String sizeName;

    //　着丈(int)
    @Column(name = "dress_length")
    private Integer length;

    //　肩幅(int)
    @Column(name = "shoulder_width")
    private Integer shoulderWidth;

    //　袖丈(int)
    @Column(name = "sleeve_length")
    private Integer sleeveLength;

    //　袖幅(int)
    @Column(name = "sleeve_width")
    private Integer sleeveWidth;

    //　首幅(int)
    @Column(name = "neck_width")
    private Integer neckWidth ;

    //　素材(String)
    @Column(name = "material")
    private String material;

    public ClothesItem() {}

    public ClothesItem(Category category, String imageName, String sizeName, Integer length, Integer shoulderWidth, Integer sleeveLength, Integer sleeveWidth, Integer neckWidth, String material) {
        this.imageName = imageName;
        this.category = category;
        this.sizeName = sizeName;
        this.length = length;
        this.shoulderWidth = shoulderWidth;
        this.sleeveLength = sleeveLength;
        this.sleeveWidth = sleeveWidth;
        this.neckWidth = neckWidth;
        this.material = material;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getShoulderWidth() {
        return shoulderWidth;
    }

    public void setShoulderWidth(Integer shoulderWidth) {
        this.shoulderWidth = shoulderWidth;
    }

    public Integer getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(Integer sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public Integer getSleeveWidth() {
        return sleeveWidth;
    }

    public void setSleeveWidth(Integer sleeveWidth) {
        this.sleeveWidth = sleeveWidth;
    }

    public Integer getNeckWidth() {
        return neckWidth;
    }

    public void setNeckWidth(Integer neckWidth) {
        this.neckWidth = neckWidth;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
