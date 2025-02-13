package com.mindsprint.project1.oops;

public class waterBottle {
    int capacity;
    String color;
    String brand;

    public void setData(int capacity, String color, String brand){
    this.capacity = capacity;
    this.color = color;
    this.brand = brand;
    }

    public void display(){
        System.out.println("------------------------------");
        System.out.println("Brand: "+brand);
        System.out.println("Color: "+color);
        System.out.println("Capacity: "+capacity+ " ltr");
    }

    public static void main(String[] args) {
        waterBottle b1 = new waterBottle();
        b1.setData(1, "brown", "Tupperware");
        b1.display();
    }
}
