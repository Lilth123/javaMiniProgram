package oop_project;

public class businessContact extends contact {

    private String email;

    public businessContact(String name, String email){
        super(name, contactType.BUSINESS);
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    
    @Override
    public void displayContact(){
        System.out.println("===========================");
        System.out.println("Name : " + getName());//from parent class
        System.out.println("Email : " + getEmail());
        System.out.println("Contact Type : " + getType());
        System.out.println("===========================");

    }

    
}
