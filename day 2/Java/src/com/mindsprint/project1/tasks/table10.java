package com.mindsprint.project1.tasks;

import java.util.Scanner;

public class table10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num +" * "+ i +" = "+ num*i);
        }
    }
}
