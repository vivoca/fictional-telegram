package hu.uni.miskolc.egyudv.oop.szgep.teszt;

import hu.uni.miskolc.egyudv.oop.szgep.Merevlemez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Taroloteszt {

    public static void main(String[] args) {
        Merevlemez[] merevlemezArray = fillMerevlemezArray();

        System.out.println("\nLegnagyobb kapacitasu merevlemez: " + legnagyobbKapacitas(merevlemezArray));

        System.out.println("\nEnnyi merevlemeznel nagyobb a szabad terulet mint a foglalt: " + countTobbSzabad(merevlemezArray));

        System.out.println("\nMerevlemezek listaja:");
        printAllMerevlemez(merevlemezArray);

        System.out.println("\nSorba rendezve szabad terulet alapjan:");
        Arrays.sort(merevlemezArray, new Comparator<Merevlemez>() {
            @Override
            public int compare(Merevlemez o1, Merevlemez o2) {
                return o1.compareTo(o2);
            }
        });
        printAllMerevlemez(merevlemezArray);

    }

    private static Merevlemez[] fillMerevlemezArray() {
        Merevlemez[] merevlemezArray = new Merevlemez[5];

        try {
            int i = 0;
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            while (i < 5) {
                try {
                    System.out.println(i + 1 + ". merevlemez adatai: ");
                    System.out.println("\tTipus: ");
                    String tipus = input.readLine();
                    System.out.println("\tKapacitas: ");
                    double kapacitas = Double.valueOf(input.readLine());
                    System.out.println("\tFoglalt terulet: ");
                    double foglaltTerulet = Double.valueOf(input.readLine());
                    while (kapacitas < foglaltTerulet) {
                        System.out.println("A foglalt terulet nem lehet nagyobb a a kapacitasnal");
                        System.out.println("\tFoglalt terulet: ");
                        foglaltTerulet = Double.valueOf(input.readLine());
                    }
                    Merevlemez merevlemez = new Merevlemez(tipus, kapacitas, foglaltTerulet);
                    merevlemezArray[i] = merevlemez;
                    i++;
                } catch (NumberFormatException ex) {
                    System.out.println("Rossz szam formatum");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return merevlemezArray;
    }

    private static Merevlemez legnagyobbKapacitas(Merevlemez[] merevlemezArray) {
        Merevlemez legnagyobbKapacitasu = merevlemezArray[0];
        for (Merevlemez merevlemez : merevlemezArray) {
            legnagyobbKapacitasu = Merevlemez.melyikNagyobb(legnagyobbKapacitasu, merevlemez);
        }
        return legnagyobbKapacitasu;
    }

    private static int countTobbSzabad(Merevlemez[] merevlemezArray) {
        int counter = 0;
        for (Merevlemez merevlemez : merevlemezArray) {
            if (merevlemez.getSzabadTerulet() > merevlemez.getFoglaltTerulet()) {
                counter++;
            }
        }
        return counter;
    }

    private static void printAllMerevlemez(Merevlemez[] merevlemezArray) {
        for (Merevlemez merevlemez : merevlemezArray) {
            System.out.println(merevlemez);
        }
    }
}
