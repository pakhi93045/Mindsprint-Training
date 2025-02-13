package com.mindsprint.project1.oops.abstraction;

abstract class Test{
    public abstract void display();
}
public class SampleAbstraction extends Test{

    @Override
    public void display() {
        System.out.println("Implement Parent Method");
    }

    public static void main(String[] args) {
        Test test = new SampleAbstraction();
        test.display();

    }
}
