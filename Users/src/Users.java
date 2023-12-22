import java.io.*;
import java.util.ArrayList;

public class Users implements Serializable{
   String name;
   String password;
    long ID;

    ArrayList<Integer> cart =new ArrayList<Integer>();


    private static long New_ID()  {

        long id=0;
        //read .ser file


        id++;

        // save id in .ser
        return id;
    }



    //child factory
    public static void createAdmin(String name, String password) {
        long id=Users.New_ID();

        new Admin(name, password, id);

    }

    public static void createCustomer(String name, String password) {
        long id=Users.New_ID();


        new Customer(name, password, id);
    }

}


