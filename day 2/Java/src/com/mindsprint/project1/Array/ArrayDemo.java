package com.mindsprint.project1.Array;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        Scanner sc = new Scanner(System.in);
        String names[] = {"test1", "test2", "test3"};

        System.out.println(names);


        int[] arr2 = new int[5];

        String[] name = {"test1", "test2", "test3"};
//we can access element by either using for loop or direct element

        //accessing direct element
        System.out.println(names[0]);

        //accessing using for loop
        for(int i=0; i<name.length; i++){
            System.out.print(name[i]+" ");
        }

        System.out.println();

        //use for-each loop

        for(String a:names)
            System.out.println(a);

        //storing values in array using loop

        for(int i=0; i<arr1.length; i++){
            System.out.println("Enter any number: ");
            arr1[i] = sc.nextInt();
        }
       // System.out.println(arr1.toString()); //not working
        for(int num:arr1){
            System.out.print(num);
        }
    }
}
