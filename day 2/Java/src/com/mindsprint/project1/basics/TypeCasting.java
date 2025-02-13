package com.mindsprint.project1.basics;

public class TypeCasting {
    public static void main(String[] args) {
        short data = 10;
        float data1 = data;
        System.out.println("Data 1: "+data1); //implicit typecasting

        double info = 78.78;
        int info1 = (int)info; //type casting explicit
        System.out.println("Info: "+info1);

        char a = 'A';
        System.out.println("ASCII No: "+ (int)a);
        System.out.println("ASCII No: "+ (char)((int)a+32));
    }
}
