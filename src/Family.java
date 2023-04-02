import java.util.ArrayList;
import java.util.Scanner;

public abstract class Family {

    private String firstName;
    private String secondName;
    private int age;

    public Family(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public int getAge() {
        return age;
    }
    public abstract ArrayList<Male> GetDataFamilyMember();
}
