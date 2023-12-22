import java.util.Scanner;

public class User_Creator {
   static Scanner scanner = new Scanner(System.in);


static void createUser(){

    System.out.println("User Name:");
    String name= scanner.next();
    System.out.println("User Pasword");
    String password= scanner.next();

    System.out.println("is user an admin? (Y/N)");


    String answer;
    do {

          answer = scanner.next();
          if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("N") ){
            break;
            }
            System.out.println("Use only N or Y");
    }while(true);

    switch (answer.toLowerCase()) {
        case "y" -> Users.createAdmin(name, password);
        case "n" -> Users.createCustomer(name, password);
    }



    }                      


}
