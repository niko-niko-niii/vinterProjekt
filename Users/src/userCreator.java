import java.util.Scanner;

public class userCreator {
   static Scanner scanner = new Scanner(System.in);

   //user creator
static void createUser(){


    System.out.println("User Name:");
    String username= scanner.next(); //username giver
    System.out.println("User Pasword");
    String password= scanner.next(); //password giver

    System.out.println("is user an admin? (Y/N)");

    //func needed looping to GET an answer so instead of
    //using try catch i just used string + if case
    // it does the same thing but looks smaller and
    // more readable
    String answer; //initializer is here becouse string is used outside the loop
    do {
         answer = scanner.next(); //admin role giver
        //if user says "Y" theyll get admin if "N" theyll become customer
          if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("N") ){
            break;
            }
            System.out.println("Use only N or Y");
    }while(true);

    //if case is harder to read and understand + it's not expandable
    //TLDR:swtich case is pog
    switch (answer.toLowerCase()) {
        case "y" -> Users.createAdmin(username, password); //admin creator
        case "n" -> Users.createCustomer(username, password); //customer creator
    }
}}


