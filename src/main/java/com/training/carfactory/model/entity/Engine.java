package com.training.carfactory.model.entity;

public class Engine implements Part{

    private Long id;
    private String name;
    private Long volume;
    private Long power;
    private Long price;
    private String imageUrl;

    public Engine(Long id, String name, Long volume, Long power, Long price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.power = power;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Engine() {
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

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
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
