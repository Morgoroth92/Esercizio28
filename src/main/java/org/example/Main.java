package org.example;

public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            System.out.println("valore: " + i);
            System.out.println(checkValue(i));
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println("valore: " + i);
            System.out.println(checkValue2(i));
        }
    }

    private static String checkValue(int value) {
        String result = "";

        if (value % 5 == 0) {
            result = "FizzBuzz";
        } else {
            result = "Buzz";
        }
        return result;
    }

    private static String checkValue2(int value2) {
        String result =  value2 % 5 == 0 ? "FizzBuzz" : "Buzz";
        return result;
        // return value2 % 5 == 0 ? "FizzBuzz" : "Buzz";
    }
}