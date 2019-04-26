package hu.uni.miskolc.egyudv.oop.diakos;

public class Diak {

    private String nev;
    private Integer penz;

    public Diak(String nev, Integer penz) {
        this.nev = nev;
        this.penz = penz;
    }

    public boolean sorozik(Integer sorAra) {
        if (sorAra <= penz) {
            penz = penz - sorAra;
            return true;
        }
        return false;
    }

    public Integer getPenz() {
        return penz;
    }
}
