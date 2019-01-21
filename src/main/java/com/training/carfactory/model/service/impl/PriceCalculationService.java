package com.training.carfactory.model.service.impl;

public class PriceCalculationService {

    public Long calculatePrice(Long...prices){
        Long finalPrice = 0L;
        for (Long price : prices){
            finalPrice = finalPrice + price;
        }
        return finalPrice;
    }
}
