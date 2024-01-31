public class productMenu {

    public void newProduct(){
    productList.newProduct();
    }
    public void removeProduct(){
    productList.removeProduct();

    }
    public void editProduct(){

    }
    public void productList(){

        for (product Product: productList.products) {
            double price=Product.getPrice();
            System.out.println(Product.getName()+" price:"+price/10);
        }

    }


}