package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        }else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy.");

        Calculator calc = new Calculator();
        int a = 10;
        int b = 5;

        int addResult = calc.add(a, b);
        if(addResult == 15) {
            System.out.println("Add test - OK.");
        }else {
            System.out.println("Error.");
        }

        int subResult = calc.subtract(a, b);
        if(subResult == 5) {
            System.out.println("Subtract test - OK.");
        }else {
            System.out.println("Error.");
        }
    }
}
