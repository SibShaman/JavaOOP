package allProject.FamilyGroup;

import java.util.Objects;

public class Female extends MemberFamily {
    private String nameHusband;
    public Female() {
        super();
    }

    public Female(String firstName, String secondName, String nameFather, String nameMother, int age, String nameHusband) {
        super(firstName, secondName, nameFather, nameMother, age);
        this.nameHusband = nameHusband;
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

    public String getNameHusband() {
        return nameHusband;
    }

    public void setNameHusband(String nameHusband) {
        this.nameHusband = nameHusband;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Female female = (Female) o;
        return Objects.equals(nameHusband, female.nameHusband);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameHusband);
    }

    @Override
    public String toString() {
        return "allProject.FamilyGroup.Female{" +
                "nameHusband='" + nameHusband + '\'' +
                "} " + super.toString();
    }
}
