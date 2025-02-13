package com.mindsprint.project1.Array;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");

        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){

            arr[i] = sc.nextInt();
        }

        for(int i : arr){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("In reverse order ");
        for(int i=n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
