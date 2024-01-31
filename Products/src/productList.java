import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class productList {
    static Scanner scanner = new Scanner(System.in);
static ArrayList<product> products=new  ArrayList<>();

    private static void createProduct(int price,String name) {
        product product=new product(price, name);
        products.add(product);
    }


    public static void newProduct(){

           System.out.println("name the product");
           String name=scanner.nextLine();
        int price=0;
       while(true){
           try {
               System.out.println("write product price (10x)");
               price = scanner.nextInt();
               break;
           }catch (Exception e){
               System.out.println("write whole numbers only ");
           }
           double fprice= 10;
           System.out.println("you created: "+name+" it will cost: "+fprice/10);
           createProduct(price,name);
       }

    }


    public static void removeProduct() {
        while (true){
            for (product Product : productList.products) {
                double price = Product.getPrice();
                System.out.println(Product.getName() + " price:" + price / 10);
            }

            System.out.println("write products name");
            String prodRemove=scanner.nextLine();

            Iterator<product> productI=products.iterator();
            while(productI.hasNext()){

                product remove = productI.hasNext();




            }

            }

    }


    }