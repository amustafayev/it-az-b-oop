package lesson8.visitor;

import lesson8.visitor.uicomponents.*;

public class Main {
    public static void main(String[] args) {

        DuzXett duzXett = new DuzXett();
        Kvadrat kvadrat = new Kvadrat();
        Noqte noqte = new Noqte();
        Daire daire = new Daire();

        Reporter reporter = new Reporter();

        reporter.reportAllForms(duzXett);
        reporter.reportAllForms(noqte);
        reporter.reportAllForms(kvadrat);
        reporter.reportAllForms(daire);



        System.out.println("------------------------------");
        reporter.report(new DuzXett());
        reporter.report(new Kvadrat());
        reporter.report(new Daire());
        reporter.report(new Noqte());
        //---------------------------------------\

        System.out.println("=============================================");

        Daire daire1 = new Daire();
        reporter.reportDaire(daire1);
        //OR
        daire1.accept(reporter);
        kvadrat.accept(reporter);


    }

    //L
    // AL  -> BL -> CL -> FL
    // A use L  -> B use L -> C use L -> F use L


}
