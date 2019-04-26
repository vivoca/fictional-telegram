package hu.uni.miskolc.egyudv.oop.diakos;

public class Rockwell {

    public static void main(String[] args) {
        OvatosDiak ovatosDiak = new OvatosDiak("Kis Elemér", 2222, 244);
        int i = 0;

        while (ovatosDiak.sorozik(300)) {
            i++;
            System.out.println("Sörök szama: " + i + "\t" + ovatosDiak.toString());
        }
    }
}
