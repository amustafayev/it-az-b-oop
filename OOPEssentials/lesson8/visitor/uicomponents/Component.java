package lesson8.visitor.uicomponents;

import lesson8.visitor.Reporter;

public class Component implements Fiqur{
    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    public void accept(Reporter reporter){
        reporter.report(this);
    }
}
