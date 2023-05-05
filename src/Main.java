/*
*
*  public class allProject.FamilyGroup.Family <U extends  allProject.FamilyGroup.MemberFamily>
*
*  abstract class allProject.FamilyGroup.MemberFamily
*
*  public class allProject.FamilyGroup.Female extends allProject.FamilyGroup.MemberFamily
*
*  public class allProject.FamilyGroup.Male extends allProject.FamilyGroup.MemberFamily
*
* */

import allProject.AddFamilyInterface;
import allProject.Builder;
import allProject.FamilyGroup.Family;
import allProject.FamilyGroup.Female;
import allProject.FamilyGroup.Male;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

    ArrayList<Object> allFamily = new ArrayList<>();
    AddFamilyInterface family = new Family<>() {};
    Builder builder = new Builder(family, allFamily);

    builder.createMan();
        System.out.println(allFamily);
    }
}


