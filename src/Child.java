import java.util.ArrayList;
import java.util.Scanner;

public class Child extends Family {
    private String nameFather;
    private String nameMother;

    public Child(String firstName, String secondName, int age, String nameFather, String nameMother) {
        super(firstName, secondName, age);
        this.nameFather = nameFather;
        this.nameMother = nameMother;
    }

    public String getNameFather() {
        return nameFather;
    }

    public String getNameMother() {
        return nameMother;
    }

    public ArrayList<Child> GetDataFamilyMember() {
        ArrayList<Child> listMan = new ArrayList<>();
        Scanner dataMan = new Scanner(System.in);
        System.out.println("Введите имя");
        String firstName = dataMan.nextLine();
        System.out.println("Введите фамилиию");
        String secondName = dataMan.nextLine();
        System.out.println("Введите возраст");
        int age = dataMan.nextInt();
        System.out.println("Введите имя отца");
        String nameFather = dataMan.nextLine();
        System.out.println("Введите имя матери");
        String nameMother = dataMan.nextLine();
        return listMan;
    }
}
