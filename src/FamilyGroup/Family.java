package FamilyGroup;

import java.util.ArrayList;
import java.util.Scanner;


public class Family <U extends MemberFamily>  implements AddFamilyInterface {

    public ArrayList<U> addMan(ArrayList<U> allFamily) {

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

        allFamily.add((U) father);

        return allFamily;
    }

    public ArrayList<U> addWoman(ArrayList<U> allFamily) {

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

        allFamily.add((U) mother);

        return allFamily;

    }

}
