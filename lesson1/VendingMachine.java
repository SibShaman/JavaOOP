package lesson1;

import java.util.ArrayList;
import java.util.Scanner;
import org.jetbrains.annotations.NotNull;

public class VendingMachine {
    private ArrayList<Product> listProduct;

    public VendingMachine (ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

    // мы должны как то добавить товар в сам автомат
    public void addProduct(Product product){
        getListProduct().add(product);
    }

    // покупатель должен ввести код товара
    private int getProduct(){
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Введите номер товара который вы хотите приобрести: ");
        return inScanner.nextInt();
    }

    // показать товар (номер, название, цена)
    private void showProduct(@NotNull Product product){
        if (getProduct() == product.getIdProduct()){
            System.out.printf("Название товара: %s, Стоимость: %s", product.getName(), product.getPrice());
        }
        else {
          System.out.println("Такого товара нет в наличии");
        }
    }


    // продать товар и выдать его покупателю


    // попрощаться




}
