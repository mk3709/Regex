package com.bridgelabz.userregistration;
import java.util.regex.*;
import  java.util.Scanner;

public class UserRegistration {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the First Name");
            String firstName = scanner.nextLine();

        if(isFirstName(firstName))
            System.out.println("Valid First Name");
      else
        {
            System.out.println("Invalid first name.");
        }
        }
        private static boolean isFirstName(String firstName)
        {
            String regex="^[A-Z][a-zA-Z]{2,}$";
            return Pattern.matches(regex,firstName);
        }

}
