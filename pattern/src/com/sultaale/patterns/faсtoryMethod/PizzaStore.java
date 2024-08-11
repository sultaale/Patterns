package com.sultaale.patterns.faсtoryMethod;

public abstract class PizzaStore {

    public Pizza orderPizza(String item) {
        Pizza pizza;

        pizza = createPizza(item);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
