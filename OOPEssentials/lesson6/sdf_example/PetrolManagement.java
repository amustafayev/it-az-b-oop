package lesson6.sdf_example;

import lesson6.sdf_example.car.CarsInterface;
import lesson6.sdf_example.yanacaq_ceni.YanacaqCenIdare;

public abstract class PetrolManagement {
    private YanacaqCenIdare yanacaqCenIdare;

    public abstract int meblegiMueyyenEt(YanacaqNovu yanacaqNovu, int yanacaqMiqdari);

    //polymorphism
    public void yanacaqDoldurma(CarsInterface masin, int yanacaqMiqdari) {
        YanacaqNovu yanacaqNovu = yanacaginTipiniMueyyenlesdir(masin);
        yanacaqCenIdare.yanacaqiGetir(yanacaqNovu);
        int mebleg = meblegiMueyyenEt(yanacaqNovu, yanacaqMiqdari);
        //TODO: odenis sistemi ile birlesdir
    }

    public abstract YanacaqNovu yanacaginTipiniMueyyenlesdir(CarsInterface masin);

}
