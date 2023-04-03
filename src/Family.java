import java.util.Objects;

public abstract class Family {

    private String firstName;
    private String secondName;

    private String nameFather;
    private String nameMother;
    private int age;

    public Family(String firstName, String secondName, String nameFather, String nameMother, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.nameFather = nameFather;
        this.nameMother = nameMother;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getNameFather() {
        return nameFather;
    }

    public String getNameMother() {
        return nameMother;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Family{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", nameFather='" + nameFather + '\'' +
                ", nameMother='" + nameMother + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return age == family.age && firstName.equals(family.firstName) && secondName.equals(family.secondName) && nameFather.equals(family.nameFather) && nameMother.equals(family.nameMother);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, nameFather, nameMother, age);
    }
}
