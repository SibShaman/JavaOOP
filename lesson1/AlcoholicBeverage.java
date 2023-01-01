package lesson1;

public class AlcoholicBeverage extends Product{

  public AlcoholicBeverage(int idProduct, String name, float price, int count) {
    super(idProduct, name, price, count);
  }

  @Override
  public String toString() {
    return "AlcoholicBeverage{" +
        "idProduct=" + getIdProduct() +
        ", name='" + getName() + '\'' +
        ", price=" + getPrice() +
        ", count=" + getCount() +
        '}'+ "\n";


  }
}
