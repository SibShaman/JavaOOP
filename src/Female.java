import java.util.Objects;

public class Female extends Family {

    private String nameHusband;

    public Female(String firstName, String secondName, String nameFather, String nameMother, int age, String nameHusband) {
        super(firstName, secondName, nameFather, nameMother, age);
        this.nameHusband = nameHusband;
    }

    public Female(String firstName, String secondName, String nameFather, String nameMother, int age) {
        super(firstName, secondName, nameFather, nameMother, age);
    }

    public Female() {

    }

    public String getNameHusband() {
        return nameHusband;
    }

    public void setNameHusband(String nameHusband) {
        this.nameHusband = nameHusband;
    }

    @Override
    public String toString() {
        return "Female{" +
                "nameHusband='" + nameHusband + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Female female = (Female) o;
        return nameHusband.equals(female.nameHusband);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameHusband);
    }
}
