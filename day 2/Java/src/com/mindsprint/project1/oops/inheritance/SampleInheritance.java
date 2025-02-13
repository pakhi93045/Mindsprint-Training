package com.mindsprint.project1.oops.inheritance;


class Parent{
    public String name = "Test";
    public Parent(){
        System.out.println("parent class constructor");
    }
    public void hello(){
        System.out.println("hello form parent");
    }
}

class Child extends Parent{
public Child(){
    super();//calling parent class constructor
    System.out.println("Child class constructor");
}
public void print(){

    System.out.println("Welcome "+name);
    //child can access properties of parent class
}
}

public class SampleInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();
        child.hello(); //child can access method of parent class
        System.out.println(child.name); //direct access
    }

}
