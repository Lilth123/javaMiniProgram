package oop_project;

public abstract class contact {
    
    private String name;
    private contactType type;

    public contact(String name,contactType type){
        this.name=name;
        this.type=type;
    }
    public String getName(){
        return name;
    }
    public contactType getType(){
        return type;
    }
    public abstract void displayContact();
    public void setName(String name) {
        this.name = name;
    }
    public void setType(contactType type) {
        this.type = type;
    }
}
