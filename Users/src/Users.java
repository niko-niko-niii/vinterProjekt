import java.io.*;
import java.util.ArrayList;

public class Users implements Serializable {
    String name;
    String password;
    long ID;



    // Separate lists for customers and admins
    static ArrayList<Admin> admins = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();

    ArrayList<Integer> cart = new ArrayList<Integer>();

    private static long New_ID() {
        // Incrementing ID logic remains the same...
        long id = 0;

        // Read .ser file (you might want to implement this part)

        id++;

        // Save id in .ser (you might want to implement this part)

        return id;
    }

    // Child factory
    public static void createAdmin(String name, String password) {
        long id = Users.New_ID();
        Admin admin = new Admin(name, password, id);
        admins.add(admin); // Add admin to the admins list
    }

    public static void createCustomer(String name, String password) {
        long id = Users.New_ID();
        Customer customer = new Customer(name, password, id);
        customers.add(customer); // Add customer to the customers list
    }

    // Getter for customers list
    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    // Getter for admins list
    public static ArrayList<Admin> getAdmins() {
        return admins;
    }

    //Name Getter
    public String GetUserName()
    {
        return name;
    }

    //ID Getter
    public long GetUserID(){

        return this.ID;
    }

    //User inlogg password checker

    //User menu
    public void menu(){

    }
}
