package lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class VendingMachine {
    HashMap<Integer, Product> listProduct = new HashMap<>();

    // мы должны как то добавить товар в сам автомат
    public void addProduct(int id, Product product){
      listProduct.put(id, product);
    }

    // покупатель должен ввести код товара
    public int getIdProduct(){
      Scanner inScanner = new Scanner(System.in);
      System.out.println("Введите номер товара который вы хотите приобрести: ");
      return inScanner.nextInt();
    }


    // показать товар (номер, название, цена)
    private HashMap<Integer, String> showProduct(Product product){
      HashMap<Integer, String> buyProduct = new HashMap<>();
      if (getIdProduct() == product.getIdProduct()){
        buyProduct.put(product.getPrice(), product.getName());
      }
      return buyProduct;
    }





  // продать товар и выдать его покупателю
  // попрощаться




}
