package com.sultaale.patterns.strategy;

public abstract class Duck implements Comparable{

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public  abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
