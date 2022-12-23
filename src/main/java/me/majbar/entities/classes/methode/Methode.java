package me.majbar.entities.classes.methode;

import me.majbar.entities.classes.classutility.ClassElements;
import me.majbar.entities.classes.classutility.StatedElement;
import me.majbar.utilityData.Type;
import me.majbar.utilityData.Visibility;

public class Methode extends StatedElement {
    private Type returnType;
    private Parametre[] parametres;

    public Methode(String name, Type returnType, Visibility visibility, boolean isStatic, boolean isFinal, boolean isAbstract, Parametre[] parametres) {
        super(name, visibility, isStatic, isFinal, isAbstract);
        this.returnType = returnType;
        this.parametres = parametres;
    }

}