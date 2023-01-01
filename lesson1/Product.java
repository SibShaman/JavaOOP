package lesson1;

import java.util.Objects;

public class Product {

  private int idProduct;
  private String name;
  private float price;
  private int count;

  public Product(int idProduct, String name, float price, int count) {
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

  public float getPrice() {
    return price;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return idProduct == product.idProduct && Float.compare(product.price, price) == 0
        && count == product.count && Objects.equals(name, product.name);
  }

  @Override
  public String toString() {
    return "Product{" +
        "idProduct=" + idProduct +
        ", name='" + name + '\'' +
        ", price=" + price +
        ", count=" + count +
        '}'+ "\n";
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduct, name, price, count);
  }

}
