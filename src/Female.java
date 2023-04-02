import java.util.ArrayList;
import java.util.Scanner;

public class Female extends Family {

    private String nameHusband;

    public Female(String firstName, String secondName, int age, String nameHusband) {
        super(firstName, secondName, age);
        this.nameHusband = nameHusband;
    }

    public String getNameHusband() {
        return nameHusband;
    }

    public ArrayList<Female> GetDataFamilyMember() {
        ArrayList<Female> listMan = new ArrayList<>();
        Scanner dataMan = new Scanner(System.in);
        System.out.println("Введите имя");
        String firstName = dataMan.nextLine();
        System.out.println("Введите фамилиию");
        String secondName = dataMan.nextLine();
        System.out.println("Введите возраст");
        int age = dataMan.nextInt();
        System.out.println("Введите имя мужа");
        String nameHusband = dataMan.nextLine();
        return listMan;
    }
}
