package com.sultaale.patterns.state;

public class GumballMachine {

   State soldOutState;
   State noQuarterState;
   State hasQuarterState;
   State soldState;
   State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
       soldOutState = new SoldOutState(this);
       noQuarterState = new NoQuarterState(this);
       hasQuarterState = new HasQuarterState(this);
       soldState = new SoldState(this);
       this.count = numberGumballs;
       if (numberGumballs > 0) {
           state = noQuarterState;
       } else {
           state = soldOutState;
       }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
       state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void refill(int count) {
        this.count += count;
        System.out.println("The gumball machinne was just refilled; it's new count is: " + this.count);
        state.refill();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot... ");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Mighty Gumball" + "\n" + "Available balls: " + count + "\n";
    }
}
