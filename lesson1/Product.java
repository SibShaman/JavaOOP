package lesson1;

public class Product {
    private int idProduct;
    private String name;
    private int price;
    private int count;

    public Product(int idProduct, String name, int price, int count) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }



}
