package es6.es3;

import java.util.Scanner;

public class es3 {
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

        System.out.print("Inserisci un numero di riferimento: ");
        int riferimento = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numeri[i] == riferimento) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Il numero di riferimento è presente nel vettore e compare " + count + " volte.");
        } else {
            System.out.println("Il numero di riferimento non è presente nel vettore.");
        }

        scanner.close();
    }
}
