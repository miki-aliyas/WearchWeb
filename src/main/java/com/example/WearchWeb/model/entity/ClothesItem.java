package com.example.WearchWeb.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Clothes_Item")
public class ClothesItem {

    @Id
    @GeneratedValue
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
    private Long dressLength;

    //　肩幅(int)
    @Column(name = "shoulder_width")
    private Long shoulderWidth;

    //　袖丈(int)
    @Column(name = "sleeve_length")
    private Long sleeveLength;

    //　袖幅(int)
    @Column(name = "sleeve_width")
    private Long sleeveWidth;

    //　首幅(int)
    @Column(name = "neck_width")
    private Long neckWidth ;

    //　素材(String)
    @Column(name = "material")
    private String material;

    public ClothesItem() {}

    public ClothesItem(String imageName, Category category, String sizeName, Long dressLength, Long shoulderWidth, Long sleeveLength, Long sleeveWidth, Long neckWidth, String material) {
        this.imageName = imageName;
        this.category = category;
        this.sizeName = sizeName;
        this.dressLength = dressLength;
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

    public Long getDressLength() {
        return dressLength;
    }

    public void setDressLength(Long dressLength) {
        this.dressLength = dressLength;
    }

    public Long getShoulderWidth() {
        return shoulderWidth;
    }

    public void setShoulderWidth(Long shoulderWidth) {
        this.shoulderWidth = shoulderWidth;
    }

    public Long getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(Long sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public Long getSleeveWidth() {
        return sleeveWidth;
    }

    public void setSleeveWidth(Long sleeveWidth) {
        this.sleeveWidth = sleeveWidth;
    }

    public Long getNeckWidth() {
        return neckWidth;
    }

    public void setNeckWidth(Long neckWidth) {
        this.neckWidth = neckWidth;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ClothesItem{" +
                "id=" + id + '\'' +
                ", imageName=" + imageName + '\'' +
                ", size_name=" + sizeName + '\'' +
                ", dressLength=" + dressLength + '\'' +
                ", shoulderWidth=" + shoulderWidth + '\'' +
                ", sleeveLength=" + sleeveLength + '\'' +
                ", sleeveWidth=" + sleeveWidth + '\'' +
                ", neckWidth=" + neckWidth + '\'' +
                ", material=" + material + '\'' +
                '}';
    }
}
