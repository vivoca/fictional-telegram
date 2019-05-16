package hu.uni.miskolc.egyudv.oop.ado;

public class CsaladiAdokedvezmeny extends Adokedvezmeny {

    private static int[] kedvezmeny = {10000, 17500, 33000};
    private int gyerekekSzama;
    private int kedvezmenyEgyGyerekre;

    public CsaladiAdokedvezmeny(String tipus, int gyerekekSzama) {
        super(tipus);
        this.gyerekekSzama = gyerekekSzama;
        if (gyerekekSzama == 0) {
            kedvezmenyEgyGyerekre = 0;
        } else if (gyerekekSzama < 3) {
            kedvezmenyEgyGyerekre = kedvezmeny[gyerekekSzama - 1];
        } else {
            kedvezmenyEgyGyerekre = kedvezmeny[2];
        }
    }

    public int getGyerekekSzama() {
        return gyerekekSzama;
    }

    public int getKedvezmenyEgyGyerekre() {
        return kedvezmenyEgyGyerekre;
    }

    @Override
    public int adokedvezmenyMerteke() {
        return gyerekekSzama * kedvezmenyEgyGyerekre;
    }

    public boolean compareToKedvezmeny(CsaladiAdokedvezmeny adokedvezmeny) {
        return adokedvezmenyMerteke() > adokedvezmeny.adokedvezmenyMerteke();
    }

    public int compareTo(CsaladiAdokedvezmeny adokedvezmeny) {
        return Integer.compare(adokedvezmenyMerteke(), adokedvezmeny.adokedvezmenyMerteke());
    }

    @Override
    public String toString() {
        return "CsaladiAdokedvezmeny{" +
                "gyerekekSzama=" + gyerekekSzama +
                ", kedvezmenyEgyGyerekre=" + kedvezmenyEgyGyerekre +
                ", adokedvezmeny=" + adokedvezmenyMerteke() +
                '}';
    }
}
