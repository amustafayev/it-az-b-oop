package lesson6.sdf_example;

public class YanacaqCenleri {
    //Max ne qeder saxlaya bilir
    private int tutum;
    private int yanacaqMiqdari;
    private YanacaqNovu yanacaqNovu;


    public int doldur(int yanacaqMiqdari) {
        if (yanacaqMiqdari + this.yanacaqMiqdari > tutum) {
            System.out.println("Yanacaq ceni bu qeder yanacagi qebul ede bilmir");
            System.out.println("Qebul olunan: " + (tutum - this.yanacaqMiqdari));
            this.yanacaqMiqdari += tutum-this.yanacaqMiqdari;
            return yanacaqMiqdari - (tutum-this.yanacaqMiqdari);
        }
        this.yanacaqMiqdari += yanacaqMiqdari;
        return 0;
    }

    public void istifadeEt(int miqdar){
        if (this.yanacaqMiqdari >= miqdar){
            System.out.println("Doldurulur...");
            this.yanacaqMiqdari-=miqdar;
        }else {
            System.out.println("Yeteri qeder yanacaq yoxdur.");
        }
    }
}
