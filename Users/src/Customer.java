public class Customer extends Users{

    //ArrayList<int> cart;       reference

    Customer(String name, String password, long id) {
        this.name=name;
        this.password=password;
        this.ID=id;
        System.out.println("Customer created");
    }
}
