import java.util.Scanner;

public class Customer extends Users{
static Scanner scanner =new Scanner(System.in);
    Customer(String username, String password, long id) {
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
             * empty space in case i want to add something unique to
             * menue i can do it here
             * with "sout(text)"
             */

            String menu= scanner.nextLine();

            //menu switch
            switch (menu.toLowerCase()){
                case"see cart":
                    System.out.println("your items:");
                    System.out.println(cart);
                    break;

                case "add item to cart":
                    addItem();
                    break;

                case "remove item from cart":
                    removeItem();
                    break;

                case"logg out": break menuLoop;
                default: System.out.println("command isn't recognized");
            }

    }

    }
}
