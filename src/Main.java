import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Family> allFamily = new ArrayList<>();

        GetParents(allFamily);

        for (Family member:allFamily) {
            System.out.println(member);
        }
    }

    public static ArrayList<Family> GetParents(ArrayList<Family> allFamily){

        Male father = new Male("Alan", "Smit", "Jhon", "Elis", 44, "Alla");
        Male son = new Male("Ken", "Smit", "Alan", "Alla", 17);

        Female mother = new Female("Alla", "Smit", "Den", "Kris", 38, "Alan");
        Female daughter = new Female("Maria", "Smit", "Alan", "Alla", 14);

        if (mother.getNameHusband().equals(father.getFirstName())){
            allFamily.add(father);
            allFamily.add(mother);
        }

        
        return allFamily;
    }

}