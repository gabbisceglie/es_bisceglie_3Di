package es12;

import java.util.Scanner;

public class es12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il prezzo del prodotto: ");
        double prezzo = scanner.nextDouble();

        //aggiunta dell'IVA del 22%
        double iva = prezzo * 0.22;
        double prezzoConIva = prezzo + iva;

        //stampa del prezzo con IVA
        System.out.printf("Il prezzo con IVA è: %.2f%n", prezzoConIva);

        scanner.close();
    }
}