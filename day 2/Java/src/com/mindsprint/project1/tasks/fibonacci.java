package com.mindsprint.project1.tasks;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int a = sc.nextInt();
        int n1 = 0, n2 = 1;

        System.out.print("Fibonacci Series: " + n1 + " " + n2);

        for (int i = 2; i < a; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
