
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Shop implements SellTelefon {
    private ArrayList<Telefon> listTelefon;

    public Shop() {
    }

    public ArrayList<Telefon> create(ArrayList<Telefon> listTelefon) {
        Telefon nokia = new Telefon("Nokia", "3310", 6.14, 4500, "Android", 12000.0);
        Telefon samsung = new Telefon("Samsung", "5460", 5.5, 3000, "Android", 22000.0);
        Telefon apple = new Telefon("Apple", "13Pro", 6.14, 2500, "Ios", 100000.0);
        Telefon oppo = new Telefon("Oppo", "120+", 5.45, 6000, "Android", 54000.0);
        listTelefon.add(nokia);
        listTelefon.add(samsung);
        listTelefon.add(apple);
        listTelefon.add(oppo);
        return listTelefon;
    }

    public ArrayList<Telefon> sell(ArrayList<Telefon> listTelefon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой телефон купили: ");
        String buyPhone = sc.next();
        sc.close();
        ArrayList<Telefon> tempList = new ArrayList();
        Iterator var5 = listTelefon.iterator();

        while(var5.hasNext()) {
            Telefon telefon = (Telefon)var5.next();
            if (!buyPhone.equals(telefon.getNameFactory())) {
                tempList.add(telefon);
            }
        }

        listTelefon.clear();
        listTelefon.addAll(tempList);
        return listTelefon;
    }
}