package org.example;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a number!");
            return;
        }

        int n = Integer.parseInt(args[0]);

        Calculator c = new Calculator();
        int result = c.sum(n);

        System.out.println("Sum = " + result);
    }
}