package lesson8.visitor;

import lesson8.visitor.uicomponents.*;

public class Reporter {

    public void report(Fiqur fiqur) {
        System.out.println("Fiqur report");
    }

    public void report(Noqte noqte) {
        System.out.println("Noqte report");
        System.out.println("Koordinatlar: " + noqte.getX() + " " + noqte.getY());
    }

    public void report(Daire daire) {
        System.out.println("Daire report");
        System.out.println("Radius: "+ daire.getRadius());
    }

    public void reportduzXett(DuzXett duzXett) {

    }

    public void reportDaire(Daire daire) {
        System.out.println("Daire report: ");
        System.out.println("Radius: " + daire.getRadius());
    }

    public void reportNoqte(Noqte noqte) {
        System.out.println("Noqte report");
        System.out.println("Koordinatlar: " + noqte.getX() + " " + noqte.getY());
    }

    public void reportAllForms(Fiqur fiqur) {
        report(fiqur);
    }
}
