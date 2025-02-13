package com.mindsprint.project1.basics;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        System.out.println("Addition: "+(num1+num2));
        System.out.println("Substraction: "+(num1-num2));
        System.out.println("Multiplication: "+(num1*num2));
        System.out.println("Division: "+(num1/num2));
        System.out.println(num1+"/"+num2+"="+(num1/num2));

    }
}
