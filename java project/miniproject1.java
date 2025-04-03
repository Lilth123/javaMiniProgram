import java.util.Scanner;

public class miniproject1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        String Register_name="", Register_email="", Register_Password="";
        String Login_email="", Login_password="";
        do{
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("0.Exit");
            System.out.println("enter your o  ption ::=> ");

            option=input.nextInt();
            input.nextLine();

            if(option==1){
                System.out.println("Register section");

                System.out.println("enter your name to register : ");
                Register_name=input.nextLine();
                System.out.println("enter your email to register : ");
                Register_email=input.nextLine();
                System.out.println("enter your password to register : ");
                Register_Password=input.nextLine();

                System.out.println("Register success...");
            }else if(option==2){
                System.out.println("Login Success");

                do{
                    System.out.println("enter your email to login : ");
                    Login_email=input.nextLine();
                    System.out.println("enter your password to login : ");
                    Login_password=input.nextLine();

                    if(Login_email.equals(Register_email) &&  Login_password.equals(Register_Password)){
                        System.out.println("Login success...");
                        System.out.println("welcome " + Register_name);
                        break;
                    }else{
                        System.out.println("your information wrong ! Try again ! ");
                    }
                }while(true);

            }else if(option==0){
                System.out.println("Exit...");
            }else{
                System.out.println("invalid option! Try again !!");
            }
        
        }while(option!=0);

input.close();
    }
}
