package cinema;

import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto costa il biglietto del cinema?");
        double prezzoBiglietto = scanner.nextDouble();

        System.out.println("Quanti anni hai?");
        int eta = scanner.nextInt();

        if (eta < 18) {
            prezzoBiglietto *= 0.8; // Sconto del 20% per minori di 18 anni
        } else if (eta >= 18) {
            prezzoBiglietto *= 0.95; // Sconto del 5% per i maggiori di 18 anni
        }

        // Mostrare il prezzo finale del biglietto
        System.out.println("Il prezzo finale del biglietto è: " + prezzoBiglietto);

        // Chiudere lo scanner per evitare perdite di risorse
        scanner.close();
    }
}