import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    ArrayList<Family> allFamily = new ArrayList<>();

    CreatorFamily creator = new CreatorFamily();
    creator.addMemberMan(allFamily);
    creator.addMemberWoman(allFamily);

        for (Family member: allFamily) {
            System.out.println(member.toString());
        }



   }
}