package hu.uni.miskolc.egyudv.oop.vizsgas;

public class VizsgaZh {

    private final Integer maxPont = 100;
    private String name;
    private Integer pont;

    public VizsgaZh(String name) {
        this.name = name;
    }

    public boolean megfeleltE() {
        return pont > (maxPont / 2);
    }

    public void setPont(Integer pont) {
        this.pont = pont;
    }

    @Override
    public String toString() {
        return "Vizsgazo neve: " + name + "\tPontszama: " + pont;
    }
}
