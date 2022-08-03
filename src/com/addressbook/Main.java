package com.addressbook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to address Book");
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your firstname,lastname,city,phone number,zipcode");
        AddressSystem c1= new AddressSystem(s1.nextLine(),s1.nextLine(),s1.nextLine(),s1.nextLong(),s1.nextInt());
        Scanner s2=new Scanner(System.in);
        System.out.println("Please enter the details of second contact(firstname,lastname,city,phone number,zipcode)");
        AddressSystem c2= new AddressSystem(s2.nextLine(),s2.nextLine(),s2.nextLine(),s2.nextLong(),s2.nextInt());
        Scanner s3=new Scanner(System.in);
        System.out.println("Please enter the details of third contact(firstname,lastname,city,phone number,zipcode)");
        AddressSystem c3= new AddressSystem(s3.nextLine(),s3.nextLine(),s3.nextLine(),s3.nextLong(),s2.nextInt());

        Scanner sc=new Scanner(System.in);
        System.out.println("enter city to search in entry");
        String city = sc.nextLine();
        if(city.equalsIgnoreCase(c1.city)){
            System.out.println("city found");
        }if(city.equalsIgnoreCase(c2.city)){
            System.out.println("city found");
        }if(city.equalsIgnoreCase(c3.city)){
            System.out.println("city found");
        }else {
            System.out.println("city not found");
        }




    }






}