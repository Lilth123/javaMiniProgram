package oop_project;

import java.util.Scanner;

public class contactManager {

    private myArray contacts;
    private helper h;
    private Scanner input;
    private int size;
    
        public contactManager(final int size){
            this.size=size;
            contacts= new myArray(size);
            h= new helper();
            input=new Scanner(System.in);
        }
        
        public void addNewContact(){
            h.banner("Add New Contact");
            String name;
            String contactOption;
            System.out.println("Enter name : ");
            name = input.nextLine();
    
            while(true){
                System.out.println("1. Personal Contact");
                System.out.println("2. Business Contact");
                System.out.println("Enter your contact type : ");
                contactOption = input.nextLine();
    
                if(contactOption.equals("1") || contactOption.equals("2")){
                    break;
                }else{
                    System.out.println("Invalid contact option ! Try again! ");
                } 
            }
            contact c;
            if(contactOption.equals("1")){
                String phoneNumber;
                System.out.println("Enter phone number : ");
                phoneNumber = input.nextLine();
                c=new personalContact(name, phoneNumber);
                
            }else{
                String email;
                System.out.println("enter email : " );
                email = input.nextLine();
                c=new businessContact(name,email);
            }
            
            contacts.add(c);
            System.out.println("Contact added successfully...");
    } 
    public void listAllContacts(){
        h.banner("List All Contact");
        if(contacts.isEmpty()){
            System.out.println("No contact to show");
        }else{
            for(int i= 0; i<contacts.getItemCount();i++){
                contact c=(contact) contacts.get(i);
            }
        }

    }

    public void searchContact(){
        h.banner("Search Contact");
        String searchName;
        myArray matchContacts= new myArray(size);
        System.out.println("Enter name to search  : ");
        searchName = input.nextLine();

        if(matchContacts.isEmpty()){
            System.out.println("No contact found!");
        }else{
            for(int i = 0; i<matchContacts.getItemCount();i++){
                contact c = (contact) matchContacts.get(i);
                c.displayContact();
            }
        }
    }
    public void deleteContact(){
        h.banner("Delete Contact");
        String searchName;
        System.out.println("Enter name to delete : ");
        searchName = input.nextLine();

        int contactIndex = -1;

        if(contactIndex == -1){
            System.out.println("Contact not found to delete");
        }else{
            contacts.remove(contactIndex);
            System.out.println("contact delete successfully...");
        }
    }
    public void editContact(){
        h.banner("Edit Contact");
        String searchName;
        System.out.println("Enter name to delete : ");
        searchName = input.nextLine();

        int contactIndex = searchContactByName(searchName);

        if(contactIndex == -1){
            System.out.println("Contact not found to edit");
        }else{
            contact c = (contact) contacts.get(contactIndex);
            c.displayContact();

            String editName;
            System.out.println("Enter name to edit : ");
            editName = input.nextLine();

            contact updateContact;
            if(c.getType() == contactType.PERSONAL){
                String editPhoneNumber;
                System.out.println("Enter phone number to edit : ");
                editPhoneNumber = input.nextLine();
                updateContact = new personalContact(editName,editPhoneNumber);
            }else{
                String editEmail;
                System.out.println("Enter email to edit : ");
                editEmail=input.nextLine();
                updateContact = new businessContact(editName, editEmail);
            }
            contacts.update(contactIndex,updateContact);
            System.out.println("Contact update successfully...");
        }
    }
    private int searchContactByName(String Name){
        int contactIndex = -1;

        for(int i = 0; i<contacts.getItemCount();i++){
            contact c=(contact) contacts.get(i);
            if(c.getName().equalsIgnoreCase(Name)){
                contactIndex = i;
                break;
            }
        }
        return contactIndex;
    }

}
