package hu.uni.miskolc.egyudv.oop.ado.teszt;

import hu.uni.miskolc.egyudv.oop.ado.CsaladiAdokedvezmeny;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class AdozasTeszt {

    public static void main(String[] args) {
        CsaladiAdokedvezmeny[] csaladiAdokedvezmenyList = fillCsaladiAdokedvezmeny();

        System.out.println("\nKedvezmenyek listaja: ");
        printAllKedvezmeny(csaladiAdokedvezmenyList);

        System.out.println("\nLegnagyobb csaladi adokedvezmeny: " + legnagyobbKedvezmeny(csaladiAdokedvezmenyList));

        System.out.println("\n3 vagy több gyerek után: " + countHaromVagyTobbGyerek(csaladiAdokedvezmenyList));

        Arrays.sort(csaladiAdokedvezmenyList, new Comparator<CsaladiAdokedvezmeny>() {
            @Override
            public int compare(CsaladiAdokedvezmeny o1, CsaladiAdokedvezmeny o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("\nKedvezmenyek listaja rendezes utan:");
        printAllKedvezmeny(csaladiAdokedvezmenyList);

    }

    private static CsaladiAdokedvezmeny[] fillCsaladiAdokedvezmeny() {
        CsaladiAdokedvezmeny[] adokedvezmenyList = new CsaladiAdokedvezmeny[5];

        try {
            int i = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (i < 5) {
                try {
                    System.out.println(i + 1 + ". kedvezmeny adatai: ");
                    System.out.println("Tipus: ");
                    String tipus = reader.readLine();
                    System.out.println("Gyerekek szama: ");
                    int gyerekekSzama = Integer.valueOf(reader.readLine());
                    CsaladiAdokedvezmeny adokedvezmeny = new CsaladiAdokedvezmeny(tipus, gyerekekSzama);
                    adokedvezmenyList[i] = adokedvezmeny;
                    i++;
                } catch (NumberFormatException ex) {
                    System.out.println("Rossz szam formatum");
                }

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return adokedvezmenyList;
    }

    private static void printAllKedvezmeny(CsaladiAdokedvezmeny[] adokedvezmenyList) {
        for (CsaladiAdokedvezmeny adokedvezmeny : adokedvezmenyList) {
            System.out.println(adokedvezmeny);
        }
    }

    private static CsaladiAdokedvezmeny legnagyobbKedvezmeny(CsaladiAdokedvezmeny[] adokedvezmenyList) {
        CsaladiAdokedvezmeny legnagyobbKedvezmenyu = adokedvezmenyList[0];
        for (CsaladiAdokedvezmeny adokedvezmeny : adokedvezmenyList) {
            if (adokedvezmeny.compareToKedvezmeny(legnagyobbKedvezmenyu)) {
                legnagyobbKedvezmenyu = adokedvezmeny;
            }
        }
        return legnagyobbKedvezmenyu;
    }

    private static int countHaromVagyTobbGyerek(CsaladiAdokedvezmeny[] adokedvezmenyList) {
        int counter = 0;
        for (CsaladiAdokedvezmeny adokedvezmeny : adokedvezmenyList) {
            if (adokedvezmeny.getGyerekekSzama() >= 3) {
                counter++;
            }
        }
        return counter;
    }
}
