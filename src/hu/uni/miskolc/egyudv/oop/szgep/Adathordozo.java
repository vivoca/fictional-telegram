package hu.uni.miskolc.egyudv.oop.szgep;

public abstract class Adathordozo {

    private String tipus;
    private double kapacitas;

    public Adathordozo() {
    }

    public Adathordozo(String tipus, double kapacitas) {
        this.tipus = tipus;
        this.kapacitas = kapacitas;
    }

    public String getTipus() {
        return tipus;
    }

    public double getKapacitas() {
        return kapacitas;
    }

    abstract public double getSzabadTerulet();
}
