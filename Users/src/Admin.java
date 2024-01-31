import java.util.Iterator;
import java.util.Scanner;

public class Admin extends Users{
    static Scanner scanner =new Scanner(System.in);
    Admin(String username, String password, long id) {
        this.username=username;
        this.password=password;
        this.ID=id;
        System.out.println("Customer created");
    }

    @Override
    public void menu() {
        menuLoop:
        while (true){
            super.menu();
            /*
            * empty space in case I want to add something unique to
            * menu I can do it here
            * with "sout(text)"
             */
            System.out.println("remove customer");
            System.out.println("product control //fake will be updated later ");


            String menu= scanner.nextLine();

            //menu switch
            switch (menu.toLowerCase()){
                case"see cart":
                    System.out.println("your items:");
                    System.out.println(cart);
                    break;
                case"add item to cart":
                    addItem();
                    break;

                case"remove item from cart":
                    removeItem();
                    break;

                case"remove customer":
                    userRemover();
                    break;

                case"logg out": break menuLoop;
                default: System.out.println("command isn't recognized");
            }
        }
    }


    private static void  userRemover(){

        do {


            System.out.println(Users.customers);
            System.out.println("who do you want to remove (write username):");
            String remove = scanner.nextLine();

            if(remove.equalsIgnoreCase("done")) break;
            else {

                // Using Iterator to safely remove elements while iterating
                Iterator<Customer> iterator = Users.customers.iterator();
                while (iterator.hasNext()) {

                    // Get the next element from the iterator
                    Customer customer = iterator.next();

                    // Check if the current user matches the specified username
                    if (remove.equalsIgnoreCase(customer.GetUserName())) {

                        // If the ID matches, remove the current item using the Iterator's remove method
                        iterator.remove();
                        System.out.println("user" + remove + "removed");

                        // Break out of the loop after removing the first matching element
                        break;
                    }
                }

                System.out.println("to exit write\"done\"");
            }
        }while(true);
    }

}
