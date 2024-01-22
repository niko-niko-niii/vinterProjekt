import java.io.*; //fråga inte :3
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class Users implements Serializable {
    //all variables that customers and admins sharre
   protected String username;
   protected String password;
   protected long ID;
  protected ArrayList<Integer> cart = new ArrayList<Integer>();


    // Separate lists for customers and admins
    static ArrayList<Admin> admins = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();


   //ID giver
   private static long New_ID() {
      //long so users dont share same ID
        long id = 0;

       //todo: implement ser ID

       //ID counter
        id++;

        return id;
    }

    // Child factory
    // 1776 or 40K moment?
    public static void createAdmin(String username, String password) {
        long ID = Users.New_ID(); //ID getter
        Admin admin = new Admin(username, password, ID); //new admin creator
        admins.add(admin); // Add admin to the admins list
    }
    //only reason Admin and customer are separated is because im to lazy to do logic

    public static void createCustomer(String username, String password) {
        long ID = Users.New_ID(); //ID getter
        Customer customer = new Customer(username, password, ID);//new customer creator
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

    //Username Getter
    public String GetUserName()
    {
        return username;
    }

    //ID Getter
    public  long GetUserID(){ return this.ID;}



    //User menu
    public void menu(){
       // extra menu buttons will be in child classes
        System.out.println("""
                see cart\s
                add item to cart\s
                logg out\s
                remove item from cart\s
                """);
    }

    // Log in function
    protected boolean logg_In(String username, String password){
       //checks username and password
    if (this.username.equalsIgnoreCase(username) && this.password.equals(password) ) {
        System.out.println("Hi "+username);
        //calls menu
    menu();

    return true;
    }else return false;

    }


    //Add item to cart
    public void add_item(){
        Random random =new Random();

       //temp on random cuz products arent done yet
        int item=random.nextInt();
        cart.add(item);
        System.out.println("you added: "+item);
    }
    //removes item
    public void remove_item(){
        Scanner scanner =new Scanner(System.in);
       for(Integer item: cart){
           System.out.println(item);
       }
        System.out.println("write item id to remove it or write  \"done\"  when your done:");
       while(true){
           String answer = scanner.nextLine();
           try {


               int id=Integer.parseInt(answer);

               // Using Iterator to safely remove elements while iterating
               Iterator<Integer> iterator = cart.iterator();
               while (iterator.hasNext()) {

                   // Get the next element from the iterator
                   Integer item = iterator.next();

                   // Check if the current item matches the specified ID
                   if (id == item) {

                       // If the ID matches, remove the current item using the Iterator's remove method
                       iterator.remove();
                       System.out.println("item:"+id+" waslo removed");

                       // Break out of the loop after removing the first matching element
                       break;
                   }
               }
                //fuck it we try catch
               // if "answer" is a String instead of breaking it des some cool stuff
           }catch (Exception e){
               // the cool stuff
               // if String is "done" it exits the cart remover
              if(answer.equalsIgnoreCase("done")){
                  break;
              }else{
                  //else it does the closest thing to slaping your fingers with a ruler so hard that it breaks
                  // (and the ruler is  made from metal)
                  System.out.println("naughty naughty");
              }

           }

       }


    }



}
