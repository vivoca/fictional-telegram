package hu.uni.miskolc.egyudv.oop.vizsgas;

public class InfosVizsgaZh extends VizsgaZh {

    private Integer puskakSzama;

    public InfosVizsgaZh(String name) {
        super(name);
    }

    public void beallitPuskakSzamaEsPontszam(Integer puskakSzama, Integer pontSzam) {
        this.puskakSzama = puskakSzama;
        super.setPont(pontSzam);
    }

    @Override
    public boolean megfeleltE() {
        return puskakSzama == 0 && super.megfeleltE();
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + (megfeleltE() ? "Megfelelt" : "Nem megfelelt");
    }
}
