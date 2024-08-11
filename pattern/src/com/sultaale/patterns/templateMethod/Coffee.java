package com.sultaale.patterns.templateMethod;

public class Coffee extends CaffeineBeverage{

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
