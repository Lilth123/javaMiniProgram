import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String[][] users=new String[50][4];
        int option;
        int userCount=0;

        do{
            System.out.println("1. Create User");
            System.out.println("2. Read Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("0. Exit");

            System.out.println("Enter your option : ");
            option=input.nextInt();

            input.nextLine();

            if(option == 1){
                System.out.println("Create User\n**********");
                System.out.print("Enter name to create : ");
                users[userCount][1]=input.nextLine();
                System.out.print("Enter email to create : ");
                users[userCount][2]=input.nextLine();
                System.out.print("Enter address to create : ");
                users[userCount][3]=input.nextLine();

                if(userCount==0){
                    users[userCount][0]="1001";//string
                }else{
                    int id=Integer.parseInt(users[userCount-1][0])+1;
                    users[userCount][0]=String.valueOf(id); 
                }
                System.out.println("User created success...");
                userCount++;
                
            }else if(option==2){
                System.out.println("Read users\n**********");

                if(userCount == 0){
                    System.out.println("There is no user");
                }else{
                    //System.out.println("User list");
                    for(int i=0;i<userCount;i++){
                        //System.out.println(users[i][0] + " " + users[i][1] + " " + users[i][2] + " " + users[i][3] );
                        for(int j=0;j<4;j++){
                            System.out.print(users[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
            }else if(option==3){
                System.out.println("Update user\n**********");
                String idToUpdate;
                String userIndexToUpdate="";

                do{
                    System.out.println("Enter user id to update info : ");
                    idToUpdate=input.nextLine();
                    
                    for(int i =0; i<userCount;i++){
                        if(users[i][0].equals(idToUpdate)){
                            userIndexToUpdate=String.valueOf(i);
                            break;
                        }
                    }
                    if(userIndexToUpdate.isEmpty()){
                        System.out.println("Id not found! Try Again!");
                    }else{
                        int userIndex=Integer.parseInt(userIndexToUpdate);
                        System.out.print("Enter name to update : ");
                        users[userIndex][1]=input.nextLine();
                        System.out.println("Enter email to update : ");
                        users[userIndex][2]=input.nextLine();
                        System.out.println("Enter address to update : ");
                        users[userIndex][3]=input.nextLine();
                        break;
                    }

                }while(true);

                System.out.println("User data update success...");
                
            }else if(option==4){
                System.out.println("Delete user\n**********");
                String idToDelete;
                String userIndexToDelete="";
                do{
                    System.out.println("Enter user id to update info : ");
                    idToDelete=input.nextLine();
                    
                    for(int i =0; i<userCount;i++){
                        if(users[i][0].equals(idToDelete)){
                            userIndexToDelete=String.valueOf(i);
                            break;
                        }
                    }
                    if(userIndexToDelete.isEmpty()){
                        System.out.println("Id not found ! try again!");
                    }else{
                        int userIndex=Integer.parseInt(userIndexToDelete);
                        for(int i=userIndex;i<userCount;i++){
                            users[i]=users[i+1];
                        }
                        userCount--;
                        break;
                    }
                }while(true);
                System.out.println("User data deleted success...");    
            }else if(option==0){
                System.out.println("Program exit....");
            }else{
                System.out.println("Invalid option! Try again !");
            }
        }while(option!=0);


        input.close();
    }
}
