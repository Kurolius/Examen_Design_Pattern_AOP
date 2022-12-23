package me.majbar.Observer;

public class DefaultObserver implements Observer {
    @Override
    public void update() {
        System.out.println("Default Observer");
    }
}

