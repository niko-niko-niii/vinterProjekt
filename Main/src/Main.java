import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Menu loop
        menuLoop:
        do {
            System.out.println("what do you want to access?");
            System.out.println(
                                "create_user " +
                                "\nexit ");
           String menu= scanner.next();



           switch (menu.toLowerCase()){
               case"create_user":User_Creator.createUser();
                continue;
               case"exit": break menuLoop;

               default: System.out.println("command isn't recognized");
           }

        }while(true);
        System.out.println("Bye");
    }
}
