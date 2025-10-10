package es13;

import java.util.Scanner;

public class es13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input del numero di giorni
        System.out.print("Inserisci il numero di giorni: ");
        int giorni = scanner.nextInt();

        //quanti anni, mesi e giorni ci sono in quei giorni
        int anni = giorni / 365;
        int mesi = (giorni % 365) / 30;
        int giorniRimanenti = (giorni % 365) % 30;

        //stampa del risultato
        System.out.printf("%d giorni corrispondono a %d anni, %d mesi e %d giorni.%n", giorni, anni, mesi, giorniRimanenti);

        scanner.close();
    }
}