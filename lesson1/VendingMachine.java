package lesson1;

import java.util.ArrayList;
import java.util.Scanner;
import org.jetbrains.annotations.NotNull;

public class VendingMachine {

  private ArrayList<Product> listProduct;

  public VendingMachine(ArrayList<Product> listProduct) {
    this.listProduct = listProduct;
  }

  public ArrayList<Product> getListProduct() {
    return listProduct;
  }

  @Override
  public String toString() {
    return "VendingMachine{" +
        "listProduct=" + listProduct +
        '}' ;
  }

  // мы должны как то добавить товар в сам автомат
  public void addProduct(Product product) {
    getListProduct().add(product);
  }

  // покупатель должен ввести код товара
  public int getProduct() {
    Scanner inScanner = new Scanner(System.in);
    System.out.println("Введите номер товара который вы хотите приобрести: ");
    return inScanner.nextInt();
  }

  // показать товар (номер, название, цена)
  public void showChosenProduct(int id) {
    for (Product product : listProduct) {
      if (product.getIdProduct() == id) {
        System.out.printf("Название товара: %s, Стоимость: %s", product.getName(),
            product.getPrice());
      }
    }
  }

// продать товар и выдать его покупателю
  public void sellProduct(int id){
    for (Product product : listProduct) {
      if (product.getIdProduct() == id) {
        int count = product.getCount() - 1;
        product.setCount(count);
      }
    }
  }

  public void goodBay(){
    System.out.println("До свидания, приходите к нам еще");
  }


}
