package com.mindsprint.project1.oops;

public class Calculator {
    public int add(int num1, int num2){
        return num1+num2;
    }

    public int sub(int num1, int num2){
        return num1-num2;
    }
    public int mut(int num1, int num2){
        return num1*num2;
    }

    public int div(int num1, int num2){
        return num1/num2;
    }

    public int square(int num){
        return num*num;
    }

    public int cube(int num){
        return num*num*num;
    }




    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition: "+c.add(45, 344));
        int result = c.cube(5);
        System.out.println("Cube: "+result);

        System.out.println("Square: "+c.square(7));
    }
}





