public class product {
    int price; // price is 10x to accommodate cents
    String name;

    public product(int price, String name){
        this.price=price;
        this.name=name;
    }

    public int getPrice() {
        return price;
    }
    public static String getName() {
        return name;
    }
}
