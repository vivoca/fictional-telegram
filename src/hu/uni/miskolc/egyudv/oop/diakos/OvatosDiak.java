package hu.uni.miskolc.egyudv.oop.diakos;

public class OvatosDiak extends Diak {

    private Integer utiKtg;

    public OvatosDiak(String nev, Integer penz, Integer utiKtg) {
        super(nev, penz);
        this.utiKtg = utiKtg;
    }

    @Override
    public boolean sorozik(Integer sorAra) {
        if ((sorAra + utiKtg) <= getPenz()) {
            super.sorozik(sorAra);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Penzmag: " + (getPenz() - utiKtg);
    }
}
