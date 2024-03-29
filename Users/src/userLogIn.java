import java.util.Scanner;

public class userLogIn {
    static Scanner scaner = new Scanner(System.in);

    public static void seeUsers() {

        //loops write out usernames

        //customer loop
        System.out.println("Customer list");
        for (Customer customer : Users.getCustomers()) {
            System.out.println("Customer: " + customer.GetUserName());
        }

        //admin loop
        System.out.println("admin list");
        for (Admin admin : Users.getAdmins()) {
        System.out.println("Admin: " + admin.GetUserName());
        }


    }

 //logg in start
    public static void loggIn(){

        //let the inception begin

//"loop" sends username to either customer or admin list so they can find it
        loop:
        while(true){

        System.out.println("customer or admin");
        String admin =scaner.next(); //asks if user is admin or no

        System.out.println("Username:");
        String username =scaner.next(); //asks for username


        switch (admin.toLowerCase()) {
            case "customer":
                customerLoggIn(username); // username sender to admin list
                break loop;

            case "admin":
                adminLoggIn(username); // username sender to customer list
                break loop;

            default: System.out.println("command isn't recognized");

            break;
            }}
    }




    private static void customerLoggIn(String username){

        //customer finder
        //if the if loop does not find the name it sends you back to start menu
        // for loop is so it can find the correct user in the list
        for (Customer customer : Users.getCustomers()) {
            if(username.equalsIgnoreCase(customer.GetUserName())){

                System.out.println("enter your password:");
                String password= scaner.next(); //password getter
                boolean success= customer.loggIn(username, password); // sends username and password to the customer
                if (!success){ // if login fails, if statement informs you
                    System.out.println("login failed");
                }
                break; //sends you to start menu

            }

        }
    }


    private static void adminLoggIn(String username){

        //admin finder
        //if the if loop does not find the name it sends you back to start menu
        // for loop is so it can find the correct user in the list
        for (Admin admin : Users.getAdmins()) {
            if(username.equalsIgnoreCase(admin.GetUserName())){

                System.out.println("eneter your pasword:");
                String password= scaner.next(); //password getter
                boolean success= admin.loggIn(username, password); // sends username and password to the customer
                if (!success){ // if login fails, if statement informs you
                    System.out.println("login failed");
                }
                break; //sends you to start menu

            }

        }
        }







}