/*
*
*  public class FamilyGroup.Family <U extends  FamilyGroup.MemberFamily>
*
*  abstract class FamilyGroup.MemberFamily
*
*  public class FamilyGroup.Female extends FamilyGroup.MemberFamily
*
*  public class FamilyGroup.Male extends FamilyGroup.MemberFamily
*
* */

import FamilyGroup.Family;
import FamilyGroup.Female;
import FamilyGroup.Male;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

    ArrayList<Male> allMan = new ArrayList<>();
    ArrayList<Female> allWomen = new ArrayList<>();


    Family<Male> man = new Family<>();
    man.addMan(allMan);
    System.out.println(allMan);

    Family<Female> women = new Family<>();
    women.addWoman(allWomen);
    System.out.println(allWomen);

    }
}


