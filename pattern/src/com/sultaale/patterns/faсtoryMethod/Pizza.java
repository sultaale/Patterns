package com.sultaale.patterns.faсtoryMethod;

public abstract class Pizza {

    String name;
//    Dough dough;
//    Sauce sauce;
//    Veggies veggies[];
//    Cheese cheese;
//    Clams clam;
//    Pepperoni pepperoni;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
