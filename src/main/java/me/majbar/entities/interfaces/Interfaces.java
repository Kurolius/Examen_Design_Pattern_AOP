package me.majbar.entities.interfaces;

import me.majbar.entities.Entity;
import me.majbar.entities.classes.methode.Abstraite;

import java.util.ArrayList;

public class Interfaces extends Entity {
    private ArrayList<Abstraite> abstraitesMethode = new ArrayList<Abstraite>();
    public Interfaces(String name) {
        super(name);
    }
}

