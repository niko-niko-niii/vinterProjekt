import java.util.Scanner;

public class User_Menu {
    static Scanner scaner = new Scanner(System.in);

    public static void See_Users() {

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
    public static void logg_In(){
        System.out.println("customer or admin");
        String answer =scaner.next();
        loop:
        while(true){
        switch (answer.toLowerCase()) {
            case "customer":
                customer_logg_in();
                break loop;

            case "admin":
                admin_logg_in();
                break loop;

            default: System.out.println("command isn't recognized");
            }
        }
    }


    private static void customer_logg_in(){
        System.out.println();

        //user finder
        for (Customer customer : Users.getCustomers()) {
            System.out.println("Customer: " + customer.GetUserName());
        }
    }

    private static void admin_logg_in(){

        //user finder
        for (Admin admin : Users.getAdmins()) {
            System.out.println("Admin: " + admin.GetUserName());
        }
    }







}