package com.mindsprint.project1.tasks;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int no = sc.nextInt();
        if(no%2!=0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
