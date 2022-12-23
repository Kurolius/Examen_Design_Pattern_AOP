package me.majbar.entities.classes;

import me.majbar.Observer.Observer;
import me.majbar.entities.Entity;
import me.majbar.entities.classes.classutility.ClassElements;
import me.majbar.utilityData.Visibility;

import java.util.ArrayList;

public class Classes extends Entity {

    private Visibility visibility;
    private boolean isAbstract;
    private boolean isFinal;
    private boolean isStatic;

    private ArrayList<ClassElements> classElements = new ArrayList<ClassElements>();

    private ArrayList<Observer> ObserverList = new ArrayList<Observer>();

    public Classes(String name, Visibility visibility, boolean isAbstract, boolean isFinal, boolean isStatic) {
        super(name);
        this.visibility = visibility;
        this.isAbstract = isAbstract;
        this.isFinal = isFinal;
        this.isStatic = isStatic;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }
    public void Attach(Observer observer){
        ObserverList.add(observer);
    }
    public void notifyAllObservers(){
        for (Observer observer : ObserverList) {
            observer.update();
        }
    }
}

