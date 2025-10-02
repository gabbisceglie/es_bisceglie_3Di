package esercizio0;

                            //Realizza una semplice calcolatrice con le 4 operazioni.

import java.util.Scanner;

public class esercizio0 {
    public static void main(String[] args) {
        int n1, n2;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Inserisci primo numero: ");
            n1 = scanner.nextInt();
            System.out.println("Inserisci secondo numero: ");
            n2 = scanner.nextInt();
            // Calcoli e stampe a video somma, differenza, prodotto e quoziente
            System.out.println("La somma dei due numeri è " + (n1+n2));
            System.out.println("La differenza dei due numeri è " + (n1-n2));
            System.out.println("Il prodotto dei due numeri è " + (n1*n2));
            System.out.println("Il quoziente dei due numeri è " + (n1/n2));
            //per evitare perdite di memoria
        }
    }
}