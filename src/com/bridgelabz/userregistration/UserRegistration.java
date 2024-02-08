package com.bridgelabz.userregistration;
import java.util.regex.*;
import  java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String firstName = scanner.nextLine();

        System.out.println("Enter the Last Name");
        String lastName = scanner.nextLine();

        System.out.println("Enter the EmailAddress");
        String email=scanner.nextLine();



        if (isFirstName(firstName))
            System.out.println("Valid First Name");
        else {
            System.out.println("Invalid first name.");
        }
        if(isLastName(lastName))
            System.out.println("Valid Last name");
        else
            System.out.println("invalid last name");

        if (isEmailValid(email))
            System.out.println("Valid email");
        else {
            System.out.println("Invalid email");
        }



    }
        private static boolean isFirstName(String firstName)
        {
            String regex="^[A-Z][a-zA-Z]{2,}$";
            return Pattern.matches(regex,firstName);
        }

        private static boolean isLastName(String lastname)
        {
            String regex="^[A-Z][a-zA-Z]{2,}$";
            return Pattern.matches(regex,lastname);
        }

    private static boolean isEmailValid(String email)
    {
        String regex="^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
        return Pattern.matches(regex,email);
    }


}
