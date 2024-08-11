package com.sultaale.patterns.strategy;

public class MallarDuck extends Duck{

    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
