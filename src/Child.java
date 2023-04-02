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
}
