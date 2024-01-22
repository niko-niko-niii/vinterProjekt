public class Customer extends Users{

    Customer(String name, String password, long id) {
        this.name=name;
        this.password=password;
        this.ID=id;
        System.out.println("Customer created");
    }

    @Override
    public void menu() {
        super.menu();
        System.out.println("""
        see cart\s
        logg out\s
        """);

    }
}
