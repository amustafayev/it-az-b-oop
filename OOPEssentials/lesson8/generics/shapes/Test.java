package lesson8.generics.shapes;

import lesson8.visitor.uicomponents.DuzXett;
import lesson8.visitor.uicomponents.Kvadrat;
import lesson8.visitor.uicomponents.Noqte;

public class Test {



    public <T extends DuzXett> String accept(T shape){

        return "Noqte";
    }

}
