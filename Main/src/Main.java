import java.awt.desktop.UserSessionEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                   User_Creator.createUser();break;

               case "see users":
                   User_Menu.See_Users(); break;

               case "logg in":
                   System.out.println("nope"); break;

               case"exit": break menuLoop;
               default: System.out.println("command isn't recognized");
           }

        }while(true);
        System.out.println("Bye");
    }
}
