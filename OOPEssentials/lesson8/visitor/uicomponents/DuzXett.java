package lesson8.visitor.uicomponents;

import lesson8.visitor.Reporter;

public class DuzXett extends Noqte {

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    public void accept(Reporter reporter) {
        reporter.reportduzXett(this);
    }


}
