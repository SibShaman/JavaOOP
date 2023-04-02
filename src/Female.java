public class Female extends Family {

    private String nameHusband;

    public Female(String firstName, String secondName, int age, String nameHusband) {
        super(firstName, secondName, age);
        this.nameHusband = nameHusband;
    }

    public String getNameHusband() {
        return nameHusband;
    }
}
