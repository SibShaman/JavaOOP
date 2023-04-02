public class Male extends Family {
    private String nameWife;

    public Male(String firstName, String secondName, int age, String nameWife) {
        super(firstName, secondName, age);
        this.nameWife = nameWife;
    }

    public String getNameWife() {
        return nameWife;
    }
}
