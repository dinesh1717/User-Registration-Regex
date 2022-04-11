package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;


//use of regex and patterns to solve user registration problem.

import java.util.Scanner;


public class UserRegistration {
    static Scanner scanner = new Scanner(System.in);

    //uc1
    //adding valid first name

    public void firstName() {
        System.out.println("Enter First Name : : ");
        String FirstName = scanner.next();
        boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", FirstName);

        if (answer) {
            System.out.println("thank you");
        } else {
            System.out.println("please enter valid first name ");
        }

        //UC2
        // Adding Last Name

    }

    public void lastName() {
        scanner = new Scanner(System.in);
        System.out.print("Enter Last Name :: ");
        String LastName = scanner.next();
        Boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", LastName);
        if (answer) {
            System.out.println("thank you");
        } else {
            System.out.println("please enter valid last name ");
        }

    }
    }


