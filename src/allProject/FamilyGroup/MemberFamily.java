package allProject.FamilyGroup;

import java.util.Objects;

public abstract class MemberFamily {
    private String firstName;
    private String secondName;
    private String nameFather;
    private String nameMother;
    private int age;

    public MemberFamily() {
    }

    public MemberFamily(String firstName, String secondName, String nameFather, String nameMother, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.nameFather = nameFather;
        this.nameMother = nameMother;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getNameFather() {
        return nameFather;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public String getNameMother() {
        return nameMother;
    }

    public void setNameMother(String nameMother) {
        this.nameMother = nameMother;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "allProject.FamilyGroup.MemberFamily{" +
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
        MemberFamily that = (MemberFamily) o;
        return age == that.age && Objects.equals(firstName, that.firstName) && Objects.equals(secondName, that.secondName) && Objects.equals(nameFather, that.nameFather) && Objects.equals(nameMother, that.nameMother);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, nameFather, nameMother, age);
    }
}
