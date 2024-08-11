package com.sultaale.patterns.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

    }
}
