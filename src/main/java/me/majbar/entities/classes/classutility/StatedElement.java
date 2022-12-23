package me.majbar.entities.classes.classutility;

import me.majbar.entities.classes.classutility.ClassElements;
import me.majbar.utilityData.Visibility;
public class StatedElement extends ClassElements {
    private Visibility visibility;
    private boolean isStatic;
    private boolean isFinal;
    private boolean isAbstract;

    public StatedElement(String name) {
        super(name);
    }
    public StatedElement(String name, Visibility visibility, boolean isStatic, boolean isFinal, boolean isAbstract) {
        super(name);
        this.visibility = visibility;
        this.isStatic = isStatic;
        this.isFinal = isFinal;
        this.isAbstract = isAbstract;
    }
}
