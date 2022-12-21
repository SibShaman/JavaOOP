package lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class VendingMachine {
    private ArrayList<Product> listProduct;

    public VendingMachine (ArrayList<Product> listProduct) {
      this.listProduct = listProduct;
  }

  // мы должны как то добавить товар в сам автомат
    public void addProduct(Product product){
      listProduct.add(product);
    }

    // покупатель должен ввести код товара
    private int getIdProduct(){
      Scanner inScanner = new Scanner(System.in);
      System.out.println("Введите номер товара который вы хотите приобрести: ");
      return inScanner.nextInt();
    }


    // показать товар (номер, название, цена)

  // мне не нравится логика этого метода, вроде на выходе правильно, но на вход идет какая то херня
//    public HashMap<Float, String> showProduct(Product product){
//      HashMap<Float, String> buyProduct = new HashMap<>();
//      if (getIdProduct() == product.getIdProduct()){
//        buyProduct.put(product.getPrice(), product.getName());
//      }
//      return buyProduct;
//    }





  // продать товар и выдать его покупателю
  // попрощаться




}
