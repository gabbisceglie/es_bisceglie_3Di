package es4;

import java.util.Scanner;

class Es4Main {
    public static void main(String[] args) {

/*Date N persone, di ciascuna sono dati il peso e l'altezza. Calcolare per ognuna
l'indice di massa corporea = (peso in kg) / (altezza in m)^2.
Si conti man mano il numero di quelle che hanno indice maggiore di un valore K prefissato e scelto dall'utente. */

        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.print("Inserisci il valore di K: ");
        double K = scanner.nextDouble();

        System.out.print("Inserisci il numero di persone: ");
        int persone = scanner.nextInt();

        for (int i = 0; i < persone; i++) {
            System.out.print("Inserisci il peso della persona " + (i + 1) + " (in kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Inserisci l'altezza della persona " + (i + 1) + " (in m): ");
            double altezza = scanner.nextDouble();

            double indiceMassaCorporea = peso / (altezza * altezza);

            if (indiceMassaCorporea > K) {
                count++;
            }
        }

        System.out.println("Numero di persone con indice di massa corporea maggiore di K: " + count);
        scanner.close();
    }
}