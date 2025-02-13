package com.mindsprint.project1.conditional;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no.1: ");
            double num1 = sc.nextDouble();

            System.out.println("Enter no.2: ");
            double num2 = sc.nextDouble();

            System.out.println("Enter \n+\n -\n *\n /: ");

            String input = sc.next();
            switch (input) {
                case "+":
                    System.out.println("Add: " + (num1 + num2));
                    break;

                case "-":
                    System.out.println("Subtract: " + (num1 - num2));
                    break;

                case "*":
                    System.out.println("Multiply: " + (num1 * num2));
                    break;

                case "/":
                    System.out.println("Divide: " + (num1 / num2));
                    break;

                default:
                    System.out.println("Enter correct operator");

            }
            System.out.println("Enter y to continue press any key to exit");
            String op = sc.next();
            if (op.equals("y") || op.equals("Y"))
                continue;
            else
                break;

        }
    }
}
