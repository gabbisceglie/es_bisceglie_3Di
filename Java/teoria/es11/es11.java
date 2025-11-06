package es11;

//Dati N numeri, con N compreso tra 5 e 10, 
//si vuole calcolare la somma dei numeri pari e il prodotto dei numeri dispari e mostrare i risultati a video.

import java.util.Scanner;

public class es11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, numero, sommaPari = 0, prodottoDispari=1;

    try {
        do {
            System.out.print("Inserisci il numero di valori da inserire (tra 5 e 10): ");
            n = scanner.nextInt();
        } while (n < 5 || n > 10);

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                sommaPari += numero;
            } else {
                prodottoDispari *= numero;
            }
        }

        System.out.println("La somma dei numeri pari è: " + sommaPari);
        System.out.println("Il prodotto dei numeri dispari è: " + prodottoDispari);

        } catch (Exception e) {
             System.out.println("Input non valido. Assicurati di inserire un numero intero. Riavvia il programma.");
        }

        scanner.close();
    }
}