public class Parent extends Family {

    private String firstName;
    private String secondName;
    private String mother;
    private String father;
    private int age;

    private enum gender {Male, Female}


    public Parent(String firstName, String secondName, String mother, String father, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.mother = mother;
        this.father = father;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMother() {
        return mother;
    }

    public String getFather() {
        return father;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    void GetAgeParent(String mother, String father) {

    }

    @Override
    void GetAllParent(String mother, String father) {

    }

    @Override
    void GetAllFamily(String mother, String father) {

    }

    @Override
    public String toString() {
        return "Parent{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                ", age=" + age +
                '}';
    }
}
