public abstract class Family {

    private String firstName;
    private String secondName;
    private String mother;
    private String father;
    private int age;

    private enum gender {Male, Female}


    abstract void GetAllParent(String mother, String father);

    abstract void GetAllFamily(String mother, String father);

    abstract void GetAgeParent(String mother, String father);

}
