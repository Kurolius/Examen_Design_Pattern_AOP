package me.majbar.Adapter;

import me.majbar.Strategy.CodeGeneration.CodeGenerationStrategy;

public class CodeGenerationAdapter implements CodeGeneration {

    private CodeGenerationStrategy strategy;

    public CodeGenerationAdapter(CodeGenerationStrategy strategy) {
        this.strategy = strategy;
    }
    @Override
    public void Generate() {;
        System.out.println("Generating code");
    }
}

