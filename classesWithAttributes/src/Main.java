public class Main {

    public static void main(String[] args) {
        Product product= new Product(232323,"Lenovo","",3,5900);
        /*product.setDescription("");
        product.setId(232323);
        product.setName("Lenovo");
        product.setStockAmount(3);
        product.setPrice(5900);*/
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}
