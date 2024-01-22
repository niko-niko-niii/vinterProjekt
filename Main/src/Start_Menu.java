import java.util.Scanner;
public class Start_Menu {

    public static void Start_Menu(){
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
                User_Creator.createUser();break; //sends user to "createUser()"

            case "see users":
                User_Logg_In.See_Users(); break; // writes down list of usernames both admin and customer

            case "logg in":
                User_Logg_In.logg_in(); break; // sends user to "logg_in()"

            case"exit": break menuLoop; //turns off the program
            default: System.out.println("command isn't recognized");
        }

    }while(true);
        System.out.println("Bye");

}}
