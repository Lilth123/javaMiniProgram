package oop_project;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        contactManager c= new contactManager(50);
        String option;

        while(true){
            System.out.println("1. Add New Contact");
            System.out.println("2. List All Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Edit Contact");
            System.out.println("0. Exit");
            System.out.println("Enter your option : ");
            option = input.nextLine();

            switch (option){
                case "1":
                    c.addNewContact();
                    break;
                case "2":
                    c.listAllContacts();
                    break;
                case "3":
                    c.searchContact();
                    break;
                case "4":
                    c.deleteContact();
                    break;
                case "5":
                    c.editContact();
                    break;
                case "0":
                    System.out.println("Program exit....");
                    System.exit(0);
                default:
                    System.out.println("Invalid option! Try again ");


            }

        }
    }
}
