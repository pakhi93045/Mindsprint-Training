package com.mindsprint.project1.oops;

// by default obj class is the parent class of all the constructors
public class Constructor {
    //if we don't create this then it is provided by compiler
    public Constructor(){
        super();
        System.out.println("Constructor called");
    }
    public static void main(String[] args) {
        Constructor c = new Constructor(); //if we run this the constructor is called without actually calling it

    }
}
