package lesson8.visitor.uicomponents;

import lesson8.visitor.Reporter;

public class Kvadrat extends DuzXett {
    private int teref;

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    public void accept(Reporter reporter){
        reporter.report(this);
    }
}
