package com.mindsprint.project1.loops;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("for loop");
        for(int i=1; i<=10; i++){
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("while loop");
        int j=1;
        while(j<=10){
            System.out.print(j++ +" ");
        }

        System.out.println();
        int k=90;
        System.out.println("Do while loop");

        do{
            System.out.print(k+" ,");
            k++;
        }while (k<=10);
    }
}
