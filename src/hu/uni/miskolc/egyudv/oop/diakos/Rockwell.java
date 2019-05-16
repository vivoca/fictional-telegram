package hu.uni.miskolc.egyudv.oop.diakos;

import java.util.Scanner;

public class Rockwell {

    public static void main(String[] args) {
//        OvatosDiak ovatosDiak = new OvatosDiak("Kis Elemér", 2222, 244);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diak neve: ");
        String name = scanner.nextLine();
        System.out.println("Diak penze: ");
        int penz = scanner.nextInt();
        System.out.println("Diak utikoltsege: ");
        int utiktg = scanner.nextInt();
        OvatosDiak ovatosDiak = new OvatosDiak(name, penz, utiktg);
        scanner.close();

        int i = 0;
        while (ovatosDiak.sorozik(300)) {
            i++;
            System.out.println("Sörök szama: " + i + "\t" + ovatosDiak.toString());
        }
    }
}
