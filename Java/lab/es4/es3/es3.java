package es4.es3;

/*
Date N coppie di numeri, con N preso in input, 
contare e stampare le coppie la cui somma è compresa in un intervallo [A,B] (estremi compresi),
con A e B presi in input.
 */

import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di coppie di numeri (N): ");
        int N = scanner.nextInt();

        System.out.print("Inserisci il valore di A: ");
        int A = scanner.nextInt();

        System.out.print("Inserisci il valore di B: ");
        int B = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Inserisci la coppia di numeri " + (i + 1) + " (separati da spazio): ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int sum = num1 + num2;

            if (sum >= A && sum <= B) {
                count++;
            }
        }

        System.out.println("Numero di coppie la cui somma è compresa tra " + A + " e " + B + ": " + count);

        scanner.close();
    }
}