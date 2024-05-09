package lesson8.visitor.uicomponents;

import lesson8.visitor.Reporter;

public class Noqte implements Fiqur {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    public void accept(Reporter reporter){
        reporter.reportNoqte(this);
    }
}
