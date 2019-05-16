package hu.uni.miskolc.egyudv.oop.szgep;

public class Merevlemez extends Adathordozo {

    private double foglaltTerulet;

    public Merevlemez(String tipus, double kapacitas, double foglaltTerulet) {
        super(tipus, kapacitas);
        this.foglaltTerulet = foglaltTerulet;
    }

    static public Merevlemez melyikNagyobb(Merevlemez egyik, Merevlemez masik) {
        return egyik.getKapacitas() > masik.getKapacitas() ? egyik : masik;
    }

    @Override
    public double getSzabadTerulet() {
        return getKapacitas() - foglaltTerulet;
    }

    public double getFoglaltTerulet() {
        return foglaltTerulet;
    }

//    public boolean compareTo(Merevlemez merevlemez) {
//        return getSzabadTerulet() > merevlemez.getSzabadTerulet();
//    }

    public int compareTo(Merevlemez merevlemez) {
        if (getSzabadTerulet() < merevlemez.getSzabadTerulet())
            return -1;
        else if (merevlemez.getSzabadTerulet() < getSzabadTerulet())
            return 1;
        return 0;
    }

//    public int compareTo(Merevlemez merevlemez){
//        return getSzabadTerulet().compareTo(merevlemez.getSzabadTerulet());
//    }

    @Override
    public String toString() {
        return "Merevlemez{" +
                "tipus=" + getTipus() +
                ", kapacitas=" + getKapacitas() +
                ", foglaltTerulet=" + foglaltTerulet +
                ", szabadTerulet=" + getSzabadTerulet() +
                '}';
    }


}
