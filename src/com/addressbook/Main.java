package com.addressbook;

import java.util.*;

public class Main {
  private static ArrayList<AddressSystem> list = new ArrayList<AddressSystem>();

    public void AddContactsDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name  ");
        String firstName = sc.nextLine();
        System.out.println("Enter the Last Name  ");
        String lastName = sc.nextLine();
        System.out.println("Enter the City ");
        String city = sc.nextLine();
        System.out.println("Enter the Zip Code ");
        String zip = sc.nextLine();
        System.out.println("Enter the Phone Number ");
        String phoneNumber = sc.nextLine();

        AddressSystem details = new AddressSystem(firstName, lastName,  city, zip, phoneNumber);
        list.add(details);
        details.display();
    }

    private void viewperson() {

        
        Collections.sort(list, (k1, k2) -> (k1.getCity().compareTo(k2.getCity())));
        for (AddressSystem search : list) {
            System.out.println("The person name is " + search.getFirstName()+" from " + search.getCity() + " city");

        }


    }

    public static void main(String[] args) {

        Main book1=new Main();

        System.out.println("Welcome to address Book");

        book1.AddContactsDetails();
        book1.viewperson();


        }


}
