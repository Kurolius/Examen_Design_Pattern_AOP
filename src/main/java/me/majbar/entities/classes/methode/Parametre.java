package me.majbar.entities.classes.methode;

import me.majbar.utilityData.Type;

public class Parametre {
    private String name;
    private Type type;

    public Parametre(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
