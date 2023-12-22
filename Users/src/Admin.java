import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.ArrayList;

public class Users implements Serializable{
    String name;
    String password;
    long ID;

    ArrayList<int> cart;

    private static long New_ID()  {

        long id=0;
        //read .ser file


        id++;

        // save id in .ser
        return id;
    }



    //child factory
    public static Admin createAdmin(String name, String password) {
        long id=Users.New_ID();

        return new Admin(name, password, id);

    }


    public static  Customer createUser(String name, String password) {
        long id=Users.New_ID();

        return new Customer(name, password, id);

    }

}


