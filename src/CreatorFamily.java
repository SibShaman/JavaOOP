import java.util.ArrayList;
import java.util.Scanner;

public class CreatorFamily implements FamilyInterface{

    @Override
    public ArrayList<Family> addMemberMan(ArrayList<Family> family) {

        Male father = new Male();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.next();
        System.out.println("Введите фамилию: ");
        String secondName = sc.next();
        System.out.println("Введите имя отца: ");
        String nameFather = sc.next();
        System.out.println("Введите имя матери: ");
        String nameMother = sc.next();
        System.out.println("Введите возраст: ");
        int age = sc.nextInt();
        System.out.println("Введите имя жены: ");
        String nameWife = sc.next();

        father.setFirstName(name);
        father.setSecondName(secondName);
        father.setNameFather(nameFather);
        father.setNameMother(nameMother);
        father.setAge(age);
        father.setNameWife(nameWife);

        family.add(father);
        return family;
    }

    @Override
    public ArrayList<Family> addMemberWoman(ArrayList<Family> family) {
        Female mother = new Female();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.next();
        System.out.println("Введите фамилию: ");
        String secondName = sc.next();
        System.out.println("Введите имя отца: ");
        String nameFather = sc.next();
        System.out.println("Введите имя матери: ");
        String nameMother = sc.next();
        System.out.println("Введите возраст: ");
        int age = sc.nextInt();
        System.out.println("Введите имя мужа: ");
        String nameHusband = sc.next();

        mother.setFirstName(name);
        mother.setSecondName(secondName);
        mother.setNameFather(nameFather);
        mother.setNameMother(nameMother);
        mother.setAge(age);
        mother.setNameHusband(nameHusband);

        family.add(mother);

        return family;
    }
}
