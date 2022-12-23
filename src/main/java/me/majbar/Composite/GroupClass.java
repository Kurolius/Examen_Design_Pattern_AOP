package me.majbar.Composite;

import me.majbar.entities.classes.Classes;

import java.util.ArrayList;

public class GroupClass {
    
    private ArrayList<Classes> classes = new ArrayList<Classes>();
    private ArrayList<GroupClass> groupClasses = new ArrayList<GroupClass>();

    public GroupClass(ArrayList<Classes> classes, ArrayList<GroupClass> groupClasses) {
        this.classes = classes;
        this.groupClasses = groupClasses;
    }

    public void addClass(Classes classes) {
        this.classes.add(classes);
    }
    public  void addGroupClass(GroupClass groupClass) {
        this.groupClasses.add(groupClass);
    }
}
