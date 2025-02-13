package com.mindsprint.project1.oops.inheritance;

class Base{
    int num;

    Base(int num){
        this.num = num;
    }
}
class Derived extends Base{
    Derived(int data){
        super(data);  //pass the paremeter either manually or explicitly through super keyword to parent class constructor

    }
}
public class TestSuper {
    public static void main(String[] args) {
        Derived d = new Derived(89);
        System.out.println(d.num);
    }
}
