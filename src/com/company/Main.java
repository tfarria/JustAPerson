package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Person terry = new Person();


        terry.setFirstName("Terry");
        terry.setLastName("Farria, Jr.");
        terry.setPhoneNumber("301-777-9311");
        terry.setEmailAddress("tfjteachus.myemail");

        System.out.println("It is great to meet you "+ ""+ terry.getFirstName()+ " "+ terry.getLastName());
        System.out.println("Can I call you " + "" + terry.getFirstName());
        System.out.println("Your Phone Number is : "+"" + terry.getPhoneNumber());
        System.out.println("Your Email Address is : " + " "+ terry.getEmailAddress());



    }


}
//    Create a class for your own Person, with the following properties (or fields):
//
//        First name - String
//
//        Last name - String
//
//        Phone number - String
//
//        E-mail address - String
//
//        1. Create a console application that accepts input for each item, and prints out:
//
//        It's great to meet you (first name + last name)! Can I call you (firstname)?
//
//        Your phone number is (phone number), and your e-mail address is (e-mail address).
//
//        DONE ALREADY?
//
//        2. Create a web application and display the same information in the browser (no HTML), when you visit the default route.
//
//
//
//        3. Create a web application and display the same information within an HTML page.
//
//
//
//        You're done!