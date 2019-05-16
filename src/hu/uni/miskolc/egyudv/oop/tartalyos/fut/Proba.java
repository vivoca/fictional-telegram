package hu.uni.miskolc.egyudv.oop.tartalyos.fut;

import hu.uni.miskolc.egyudv.oop.tartalyos.Tartaly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proba {

    public static void main(String[] args) {
        List<Tartaly> tartalyList = fillTartalyList();

        printTartalyList(tartalyList);

        System.out.println("\nLegnagyobb nyomasu tartaly: \t" + legnagyobbNyomas(tartalyList));

        System.out.println("\nLegnagyobb terfogatu tartaly: \t" + legnagyobbTerfogat(tartalyList));
    }

    private static List<Tartaly> fillTartalyList() {
        List<Tartaly> tartalyList = new ArrayList<>();
        Scanner scanIn = new Scanner(System.in);
        int i = 0;
        while (tartalyList.size() < 5) {
            try {
                System.out.println(i + 1 + ". tartaly adatai: ");
                System.out.println("Terfogat: ");
                int terfogat = Integer.valueOf(scanIn.nextLine());
                System.out.println("Nyomas: ");
                int nyomas = Integer.valueOf(scanIn.nextLine());
                Tartaly tartaly = new Tartaly(terfogat, nyomas);
                tartalyList.add(tartaly);
                i++;
            } catch (NumberFormatException ex) {
                System.out.println("Rossz szam formatum");
            }
        }
        scanIn.close();
        return tartalyList;
    }


    private static void printTartalyList(List<Tartaly> tartalyList) {
        for (Tartaly tartaly : tartalyList) {
            System.out.println(tartaly);
        }
    }

    private static Tartaly legnagyobbNyomas(List<Tartaly> tartalyList) {
        Tartaly legnagyobbNyomasuTartaly = tartalyList.get(0);
        for (Tartaly tartaly : tartalyList) {
            if (tartaly.nagyobbNyomas(legnagyobbNyomasuTartaly)) {
                legnagyobbNyomasuTartaly = tartaly;
            }
        }
        return legnagyobbNyomasuTartaly;
    }

    private static Tartaly legnagyobbTerfogat(List<Tartaly> tartalyList) {
        Tartaly legnagyobbTerfogatuTartaly = tartalyList.get(0);
        for (Tartaly tartaly : tartalyList) {
            legnagyobbTerfogatuTartaly = Tartaly.nagyobbTerfogat(legnagyobbTerfogatuTartaly, tartaly);
        }
        return legnagyobbTerfogatuTartaly;
    }
}
