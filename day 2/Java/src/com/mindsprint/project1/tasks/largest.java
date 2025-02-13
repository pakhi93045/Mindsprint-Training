package com.mindsprint.project1.tasks;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.: ");
        int a = sc.nextInt();
        System.out.println("Enter second no.: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("largest no is "+a);
        }
        else{
            System.out.println("largest no is "+b);
        }
    }
}
