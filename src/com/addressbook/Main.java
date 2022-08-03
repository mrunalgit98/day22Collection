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


    private void searchPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city to search person ");
        String city = sc.nextLine();
        for (AddressSystem search : list) {
            if (city.equalsIgnoreCase(search.getCity())) {
                System.out.println("Entered city found in the Address Book");
                search.display();
            } else {
                System.out.println("Entered city not found in the Address Book");
            }
        }
    }


    public static void main(String[] args) {

        Main book1=new Main();
        Main book2=new Main();

        System.out.println("Welcome to address Book");

        book1.AddContactsDetails();
        book2.AddContactsDetails();

        book1.searchPerson();


        }


}
