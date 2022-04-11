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
    //UC3
    // Adding user's Email Address

    public void email() {
        scanner = new Scanner(System.in);
        System.out.print("Enter email ID :: ");
        String email = scanner.next();
        Boolean answer = Pattern.matches("^[a-zA-Z0-9+_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", email);
        if (answer) {
            System.out.println("thank you");
        } else {
            System.out.println("please enter valid email ID ");

        }
    }
    //UC4
    // Adding user's contact number

    public void contactNumber() {
        scanner = new Scanner(System.in);
        System.out.print("Enter contact number with country code :: ");
        String ContactNumber = scanner.nextLine();
        boolean answer = Pattern.matches("91?[0-9]{10}", ContactNumber);
        if (answer) {
            System.out.println("Thank you");
        } else {
            System.out.println("enter valid contact number");
        }

    }

    //UC5
    // minimum 8 character should be added
    public void passwordEightDigit() {
        scanner = new Scanner(System.in);
        System.out.print("Enter password  :: ");
        String password = scanner.nextLine();
        boolean answer = Pattern.matches("[a-zA-Z0-9]{8,}", password);
        if (answer) {
            System.out.println("Thank you");
        } else {
            System.out.println("enter valid password");
        }
    }

    //UC6
    // minimum 8 character and atleast 1 upper case
    public void passwordOneUpperCase() {
        scanner = new Scanner(System.in);
        System.out.print("Enter password  :: ");
        String password = scanner.nextLine();
        boolean answer = Pattern.matches("[A-Z]+[a-z]{7,}", password);
        if (answer) {
            System.out.println("Thank you");
        } else {
            System.out.println("enter valid password");
        }
    }


     //UC7
     // minimum 8 character and 1 upper case and at least 1 number should be added
    public void passwordOneNum() {
        scanner = new Scanner(System.in);
        System.out.print("Enter password  :: ");
        String password = scanner.nextLine();
        boolean answer = Pattern.matches("[A-Za-z0-9]{8,}", password);
        if (answer) {
            System.out.println("Thank you");
        } else {
            System.out.println("enter valid password");
        }
    }
     // UC8
     // atleast 1 special character should be added
    public void passwordOneSpecialCharacter() {
        scanner = new Scanner(System.in);
        System.out.print("Enter password  :: " );
        String password = scanner.nextLine();
        boolean answer = Pattern.matches("[A-Za-z0-9]{8,}+[!@#$%^&*+-|'~`,<>.?_]{1}",password);
        if (answer){
            System.out.println("Thank you");
        }else {
            System.out.println("enter valid password");
        }
    }
}


