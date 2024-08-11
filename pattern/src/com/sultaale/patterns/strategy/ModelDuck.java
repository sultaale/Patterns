package com.sultaale.patterns.strategy;

public class ModelDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
