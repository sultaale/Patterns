package com.sultaale.patterns.decorator;

public class HouseBlend extends Beverage{

    public  HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return 0.89;
    }

}
