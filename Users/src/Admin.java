import java.io.*;

import java.util.ArrayList;
public class Admin extends Users implements Serializable{
    ArrayList <int> Basket;


    public Admin(String name, String password, long id, boolean Is_Admin) {
        this.name=name;
        this.password=password;


    }
}
