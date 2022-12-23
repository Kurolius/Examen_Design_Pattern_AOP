package me.majbar.entities.classes.methode;

import me.majbar.utilityData.Type;
import me.majbar.utilityData.Visibility;

public class Concrete extends Methode {


    public Concrete(String name, Type type, Visibility visibility, boolean isStatic, boolean isFinal, boolean isAbstract) {
        super(name, type, visibility, isStatic, isFinal, isAbstract, null);
    }
}

