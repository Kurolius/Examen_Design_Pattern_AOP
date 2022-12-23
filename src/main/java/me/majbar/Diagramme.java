package me.majbar;

import me.majbar.Strategy.CodeExport.ExportStrategie;
import me.majbar.Strategy.CodeGeneration.CodeGenerationStrategy;
import me.majbar.entities.Entity;

import java.util.ArrayList;

public class Diagramme {
    private String name;
    private ArrayList<Entity> Entity = new ArrayList<Entity>();
    private ExportStrategie exportStrategie;
    private CodeGenerationStrategy codeGenerationStrategy;

    public void ExportDiagramme() {
        exportStrategie.export();
    }
    public void GenerateCode() {
        codeGenerationStrategy.Generate();
    }
}
