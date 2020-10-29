public class Product {
    public Product(int id,String name,String description,double stockAmount,int price){
        System.out.println("Yapıcı blok çalıştı");
        this.id=id;
        this.description=description;
        this.name=name;
        this.stockAmount=stockAmount;
        this.price=price;

    }
    //Attribute or field
    private int id;
    private String name;
    private double stockAmount;
    private String description;
    private int price;
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(double stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getKod() {
        return name.substring(0,1)+id;
    }

}
