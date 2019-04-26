package hu.uni.miskolc.egyudv.oop.vizsgas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProbaZh {

    public static void main(String[] args) {

        System.out.println("ZH irok szama : ");
        Integer zhIrokSzama;
        Scanner scanIn = new Scanner(System.in);
        zhIrokSzama = Integer.valueOf(scanIn.nextLine());
        scanIn.close();

        List<InfosVizsgaZh> infosVizsgaZhList = new ArrayList<>();
        for (int i = 0; i < zhIrokSzama; i++) {
            InfosVizsgaZh infosVizsgaZh = new InfosVizsgaZh("ZHiro" + (i + 1));
            infosVizsgaZh.beallitPuskakSzamaEsPontszam((int) (Math.random() * 2 + 0), (int) (Math.random() * 100 + 0));
            infosVizsgaZhList.add(infosVizsgaZh);
        }

        double counter = 0;
        for (InfosVizsgaZh item : infosVizsgaZhList) {
            System.out.println(item);
            if (item.megfeleltE()) {
                counter++;
            }
        }

        System.out.println("Megfeleltek aránya: " + counter / zhIrokSzama);
    }

}
