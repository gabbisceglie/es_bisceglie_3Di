package es4.es4;

//Dato un numero naturale N compreso tra 1 e 10, stamparne la tabellina.

import java.util.Scanner;

public class es4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero naturale N (1-10): ");
        int N = scanner.nextInt();

        if (N < 1 || N > 10) {
            System.out.println("Errore: il numero deve essere compreso tra 1 e 10.");
        } else {
            System.out.println("Tabellina del " + N + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + (N * i));
            }
        }

        scanner.close();
    }
}