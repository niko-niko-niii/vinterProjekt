import java.util.Scanner;
public class startMenu {
    public static void startMenu(){
    Scanner scanner = new Scanner(System.in);
        Users.createAdmin("Vlad","123");
        Users.createCustomer("Dalv","321");

// Menu loop
    menuLoop:
            do {
        System.out.println("what do you want to access?");
        System.out.println(
                """
                create user\s
                see users\s
                logg in\s
                exit\s
                """);
        String menu= scanner.nextLine();



        switch (menu.toLowerCase()){
            case"create user":
                userCreator.createUser();break; //sends user to "createUser()"

            case "see users":
                userLogIn.seeUsers(); break; // writes down list of usernames both admin and customer

            case "logg in":
                userLogIn.loggIn(); break; // sends user to "logg_in()"

            case"exit": break menuLoop; //turns off the program
            default: System.out.println("command isn't recognized");
        }

    }while(true);
        System.out.println("Bye");

}}
