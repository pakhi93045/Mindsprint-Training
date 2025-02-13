package com.mindsprint.project1.oops.abstraction;

import java.util.Scanner;

interface Paypal{
    public void pay();
}

interface RazorPay{
    public void pay();
}

class Api1 implements Paypal{

    @Override
    public void pay() {
        System.out.println("Payment done through Paypal");
    }
}

class Api2 implements RazorPay{

    @Override
    public void pay() {
        System.out.println("Payment done through RazorPay");
    }
}

//class PaymentImpt implements Paypal, RazorPay{
//String method;
//PaymentImpt(String method){
//    this.method = method;
//}
//    @Override
//    public void pay() {
//        if(method.equals("Paypal")){
//            System.out.println("Payment done using Paypal");
//        }
//        else if(method.equals("RazorPay")){
//            System.out.println("Payment done using RazorPay");
//        }
//    }
//}
public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your payment method");
        String method = sc.next();

        if(method.equals("RazorPay")){
            RazorPay rp = new Api2();
            rp.pay();
        }
        else{
            Paypal ppal = new Api1();
            ppal.pay();
        }

    }
}
