package allProject;

import java.util.ArrayList;

public class Builder {
    private AddFamilyInterface builder;
    private ArrayList<Object> listTree;


    public Builder(AddFamilyInterface builder, ArrayList<Object> listTree) {
        super();
        this.builder = builder;
        this.listTree = listTree;
    }

    public ArrayList<Object> create(){
        return builder.addMan(listTree);
    }

}
