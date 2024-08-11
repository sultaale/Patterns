package com.sultaale.patterns.templateMethod;

public class CoffeeMachine {

    public static void main(String[] args) {
        Tea tes = new Tea();
        Coffee coffee = new Coffee();

        tes.prepareRecipe();
        coffee.prepareRecipe();
    }
}
