package com.mindsprint.project1.oops;

class ParentPhone{
    public void call(){
        System.out.println("Parent phone is calling");
    }
}

class ChildPhone extends ParentPhone{
    public void call(){
        super.call();
        System.out.println("Child phone is calling");

    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        ChildPhone cp = new ChildPhone();
        cp.call();
        System.out.println();

    }
}
