package es11;

import java.util.Scanner;

public class es11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire le ore:");
        int ore = scanner.nextInt();

        System.out.println("Insersire i minuti:");
        int minuti = scanner.nextInt();

        System.out.println("Inserire i secondi:");
        int secondi = scanner.nextInt();

        int tempo_tot_secondi = ore * 3600 + minuti * 60 + secondi;

        System.out.println("Il tempo totale in secondi è: " + tempo_tot_secondi);

        scanner.close();
    }
}