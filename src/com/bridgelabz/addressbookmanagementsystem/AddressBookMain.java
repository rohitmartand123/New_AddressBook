package com.bridgelabz.addressbookmanagementsystem;

/**
 * Ability to add a new Contact to Address Book
 *
 * @author : Rohit
 */
public class AddressBookMain {
	 public static void main(String[] args) {

	        System.out.println("------------------ Welcome to Address Book Management System !-------------------");
	        System.out.println();

	        AddressBook addressBook = new AddressBook();

	        // Calling addressBookMenu to perform various operations in address book
	        addressBook.addressBookMenu();
	    }
	}