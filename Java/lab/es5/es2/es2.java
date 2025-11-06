package es2;

import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero intero: ");
        int a = scanner.nextInt();

        System.out.print("Inserisci il secondo numero intero: ");
        int b = scanner.nextInt();

        //portali in valore assoluto
        a = Math.abs(a);
        b = Math.abs(b);
        System.out.println("Valore assoluto del primo numero: " + a);
        System.out.println("Valore assoluto del secondo numero: " + b);

        //trova il minore, calcola il doppio del minore e sommalo all'altro numero espresso sempre in valore assoluto
        int min = Math.min(a, b);
        int result = (2 * min) + Math.max(a, b);

        System.out.println("Il risultato finale è: " + result);

        scanner.close();

    }
}
