package com.sultaale.patterns.templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Tea extends CaffeineBeverage{


    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

  public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();

       return answer.toLowerCase(Locale.ROOT).startsWith("y");

    }

    String getUserInput() {
        String answer = null;

        System.out.print("Would you like lemon with your tea?(y/n)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null)
            return "no";

        return answer;
    }
}
