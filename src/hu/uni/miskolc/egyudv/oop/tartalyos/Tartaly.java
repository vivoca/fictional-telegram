package hu.uni.miskolc.egyudv.oop.tartalyos;

public class Tartaly extends Tarolo {

    private Integer nyomas;

    public Tartaly(Integer terfogat, Integer nyomas) {
        super(terfogat);
        this.nyomas = nyomas;
    }

    static public Tartaly nagyobbTerfogat(Tartaly t1, Tartaly t2) {
        return t1.getTerfogat() > t2.getTerfogat() ? t1 : t2;
    }

    public boolean nagyobbNyomas(Tartaly tartaly) {
        return nyomas > tartaly.nyomas;
    }

    @Override
    public boolean veszelyes() {
        return getTerfogat() * nyomas > 100;
    }

    @Override
    public String toString() {
        return "Terfogat:  " + getTerfogat() + "\tNyomas:  " + nyomas + "\t" + (veszelyes() ? "Veszelyes" : "Nem veszelyes");
    }
}
