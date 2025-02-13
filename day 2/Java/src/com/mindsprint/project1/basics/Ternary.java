package com.mindsprint.project1.basics;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter age");
//        int age = sc.nextInt();
//
//        String result  = (age>18)?"valid for vote":"Not valid";
//        System.out.println(result);

        System.out.println("Enter sp");
        int sp = sc.nextInt();
        System.out.println("Enter pp");
        int pp = sc.nextInt();

        String res = (sp > pp) ? "profit " + (sp - pp) : "loss " +(pp-sp);
        System.out.println(res);
    }
}
