package com.recipe.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recipe {

    @Id
    private String id;
    private String name;
    private String img_url;
    private String Description;

    public Recipe(String id, String name, String img_url, String description) {
        this.id = id;
        this.name = name;
        this.img_url = img_url;
        Description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
