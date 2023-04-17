
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        ArrayList<Telefon> listTelefon = new ArrayList();
        shop.create(listTelefon);
        Iterator var3 = listTelefon.iterator();

        Telefon temp;
        while(var3.hasNext()) {
            temp = (Telefon)var3.next();
            System.out.println(temp.toString());
        }

        shop.sell(listTelefon);
        var3 = listTelefon.iterator();

        while(var3.hasNext()) {
            temp = (Telefon)var3.next();
            System.out.println(temp.toString());
        }

    }
}
