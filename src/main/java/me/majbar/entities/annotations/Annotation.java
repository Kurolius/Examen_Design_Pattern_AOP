package me.majbar.entities.annotations;

import me.majbar.entities.Entity;

import java.util.ArrayList;

public class Annotation extends Entity {
    private ArrayList<Propriete> attributes = new ArrayList<Propriete>();
    public Annotation(String name) {
        super(name);
    }
}


