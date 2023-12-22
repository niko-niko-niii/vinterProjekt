public class Customer extends Users{

    //ArrayList<int> cart;       reference

    Customer(String name, String password, long id) {
        this.name=name;
        this.password=password;
        System.out.println("Customer created");
    }

    void addItemToCart(){

    }
    void removeItemFromCart(){

    }
    String GetCart(){

        
        return "y";
    }
}
