package lesson8.visitor.uicomponents;

import lesson8.visitor.Reporter;

public class Daire extends Noqte{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    public void accept(Reporter reporter){
        reporter.reportDaire(this);
    }

    public void reportDaire(Daire daire) {
        System.out.println("Daire report: ");
        System.out.println("Radius: " + daire.getRadius());
    }
}
