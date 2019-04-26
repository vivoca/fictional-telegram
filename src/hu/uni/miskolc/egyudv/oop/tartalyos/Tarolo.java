package hu.uni.miskolc.egyudv.oop.tartalyos;

public abstract class Tarolo {

    private Integer terfogat;

    public Tarolo(Integer terfogat) {
        this.terfogat = terfogat;
    }

    public abstract boolean veszelyes();

    public Integer getTerfogat() {
        return terfogat;
    }
}
