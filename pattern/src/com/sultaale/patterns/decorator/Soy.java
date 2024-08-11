package com.sultaale.patterns.decorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description + ", Soy";
    }


    @Override
    public double cost() {
        double result = beverage.cost();
        switch (beverage.getSize()) {
            case GRANDE -> result += 0.15;
            case TALL -> result += 0.20;
            case VENTI -> result += 0.10;
        }
        return result;
    }
}
