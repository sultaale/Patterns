package com.sultaale.patterns.templateMethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();
    }

    protected boolean customerWantsCondiments() {
        return true;
    }


    protected abstract void addCondiments();

    void pourInCup() {
         System.out.println("Pouring into cup");
     }

    protected abstract void brew();

    void boilWater() {
        System.out.println("Boiling Water");
    }
}
