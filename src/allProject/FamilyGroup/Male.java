package allProject.FamilyGroup;

import java.util.Objects;

public class Male extends MemberFamily {
    private String nameWife;
    public Male() {
        super();
    }

    public Male(String firstName, String secondName, String nameFather, String nameMother, int age, String nameWife) {
        super(firstName, secondName, nameFather, nameMother, age);
        this.nameWife = nameWife;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getSecondName() {
        return super.getSecondName();
    }

    @Override
    public void setSecondName(String secondName) {
        super.setSecondName(secondName);
    }

    @Override
    public String getNameFather() {
        return super.getNameFather();
    }



    @Override
    public void setNameFather(String nameFather) {
        super.setNameFather(nameFather);
    }

    @Override
    public String getNameMother() {
        return super.getNameMother();
    }

    @Override
    public void setNameMother(String nameMother) {
        super.setNameMother(nameMother);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public String getNameWife() {
        return nameWife;
    }

    public void setNameWife(String nameWife) {
        this.nameWife = nameWife;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Male male = (Male) o;
        return Objects.equals(nameWife, male.nameWife);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameWife);
    }

    @Override
    public String toString() {
        return "allProject.FamilyGroup.Male{" +
                "nameWife='" + nameWife + '\'' +
                "} " + super.toString();
    }




}
