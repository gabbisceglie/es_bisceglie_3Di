package es6.es2;

import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
    do{
        System.out.print("Inserisci il numero di elementi (max 30): ");
        n = scanner.nextInt();
        }while (n < 1 || n > 30);

        int[] numeri = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (numeri[i] > max) {
                max = numeri[i];
            }
            if (numeri[i] < min) {
                min = numeri[i];
            }
        }

        System.out.print("Inserisci un numero di riferimento: ");
        int riferimento = scanner.nextInt();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (numeri[i] > riferimento) {
                j++;
            }
        }

        System.out.println("Valore più grande: " + max);
        System.out.println("Valore più piccolo: " + min);
        System.out.println("numero di valori più grandi di " + riferimento + ": " + j);

        scanner.close();
    }
}
