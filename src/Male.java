import java.util.Objects;

public class Male extends Family {
    private String nameWife;

    public Male(String firstName, String secondName, String nameFather, String nameMother, int age, String nameWife) {
        super(firstName, secondName, nameFather, nameMother, age);
        this.nameWife = nameWife;
    }

    public Male(String firstName, String secondName, String nameFather, String nameMother, int age) {
        super(firstName, secondName, nameFather, nameMother, age);
    }

    public String getNameWife() {
        return nameWife;
    }

    @Override
    public String toString() {
        return "Male{" +
                "nameWife='" + nameWife + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Male male = (Male) o;
        return nameWife.equals(male.nameWife);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameWife);
    }
}
