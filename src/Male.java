import java.util.ArrayList;
import java.util.Scanner;

public class Male extends Family {
    private String nameWife;

    public Male(String firstName, String secondName, int age, String nameWife) {
        super(firstName, secondName, age);
        this.nameWife = nameWife;
    }

    public String getNameWife() {
        return nameWife;
    }

    @Override
    public ArrayList<Male> GetDataFamilyMember() {
        ArrayList<Male> listMan = new ArrayList<>();
        Scanner dataMan = new Scanner(System.in);
        System.out.println("Введите имя");
        String firstName = dataMan.nextLine();
        System.out.println("Введите фамилиию");
        String secondName = dataMan.nextLine();
        System.out.println("Введите возраст");
        int age = dataMan.nextInt();
        System.out.println("Введите имя жены");
        String nameWife = dataMan.nextLine();
        return listMan;
    }
}
