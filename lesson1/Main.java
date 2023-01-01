package lesson1;

//Задача семинара
// Торговый автомат содержит в себе наборы товаров. Покупатель вводит номер товара. Автомат высвечивает стоимость товара
// Покупатель его оплачивает. Из лотка выпадает заказанный товар.
// Проверьте все модификаторы видимости в ваших классах.

// Пропишите тела методов. Напишите main(), который демонстрирует, как работает торговый автомат.
// Создайте несколько классов товаров. Они все наследуются от родительского класса Product
// Товары обладают дополнительными характеристиками которые отбражаются в toString()
// Загрузите в автомат много разнообразных товаров

//классы - Торговый автомат
//       - Покупатель
//       - Товар

//Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
//При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.
//Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.

//Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и
//        реализуйте перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт, соответствующий имени, объему и температуре.
//В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.


import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    VendingMachine vendingMachine = new VendingMachine(new ArrayList<>());
    vendingMachine.addProduct(new ColdBeverage(1, "MineralWater", 98, 25));
    vendingMachine.addProduct(new ColdBeverage(2, "Water", 66, 44));
    vendingMachine.addProduct(new AlcoholicBeverage(3, "Cocktail", 105, 20));
    vendingMachine.addProduct(new AlcoholicBeverage(4, "Beer", 100, 30));
    vendingMachine.addProduct(new HotBeverage(5, "Coffee", 56, 19, 78));

    System.out.println(vendingMachine);
    int idMyProduct = vendingMachine.getProduct();
    vendingMachine.showChosenProduct(idMyProduct);
    vendingMachine.sellProduct(idMyProduct);
    vendingMachine.goodBay();
    System.out.printf("Остатки товаров в магазине = %s", vendingMachine);

  }
}
