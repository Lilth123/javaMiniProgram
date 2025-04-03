package oop_project;

public class personalContact extends contact{

    private String phoneNumber;

    public personalContact(String name, String phoneNumber){
        super(name,contactType.PERSONAL);
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    @Override
    public void displayContact(){
        System.out.println("===========================");
        System.out.println("Name : " + getName());//from parent class
        System.out.println("Phone Number : " + getPhoneNumber());
        System.out.println("Contact Type : " + getType());
        System.out.println("===========================");

    }
}
