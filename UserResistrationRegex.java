package com.bridgelabz.regex;

public class UserResistrationRegex {
    public static void main(String[] args) {
        System.out.println("Welcome to the user registration system");
        UserOperator userOperator = new UserOperator();
        userOperator.firstName();
        userOperator.lastName();
        userOperator.emailAddress();
        userOperator.mobileNumber();
        userOperator.password();
    }
}
