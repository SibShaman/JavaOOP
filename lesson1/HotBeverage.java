package lesson1;

public class HotBeverage extends Product{

  private int temperature;

  public HotBeverage(int idProduct, String name, float price, int count, int temperature) {
    super(idProduct, name, price, count);
    this.temperature = temperature;
  }

  public int getTemperature() {
    return temperature;
  }

  @Override
  public String toString() {
    return "HotBeverage{" +
        "idProduct=" + getIdProduct() +
        ", name='" + getName()+ '\'' +
        ", price=" + getPrice() +
        ", count=" + getCount() +
        ", temperature=" + temperature +
        '}'+ "\n";
  }
}
