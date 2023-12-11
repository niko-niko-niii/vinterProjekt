import java.io.*;
public class Users implements Serializable{
    String name;
    String password;
    long ID;
    boolean Is_Admin;

    public static Admin createAdmin(String name, String password) {
        long id=Users.New_ID();

        return new Admin(name, password, id,true);

    }

    private static long New_ID(){
    return 0;
    }

}


