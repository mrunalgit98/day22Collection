

package com.addressbook;

import java.util.Scanner;

class AddressSystem{
    String firstname;
    String lastname;
    String city;
    long phoneNumber;
    int  zipcode;

    public AddressSystem(String firstname,String lastname,String city,long phoneNumber,int zipcode)
    {
        System.out.println("The Contact Details are as follows");
        this.firstname=firstname;
        this.lastname=lastname;
        this.city=city;
        this.phoneNumber=phoneNumber;
        this.zipcode=zipcode;

        System.out.println("Name of the contact is : "+this.firstname+" "+this.lastname);
        System.out.println("City is "+this.city);
        System.out.println("Phone number= "+this.phoneNumber);
        System.out.println("zipcode= "+this.zipcode);

    }



}

