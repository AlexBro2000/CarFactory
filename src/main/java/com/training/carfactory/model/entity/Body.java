package com.training.carfactory.model.entity;

public class Body implements Part{

    private Long id;
    private String name;
    private Type type;
    private Long price;
    private String imageUrl;

    public enum Type{
        SEDAN,
        CROSSOVER,
        COUPE
    }

    public Body(Long id, String name, Type type, Long price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Body(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
