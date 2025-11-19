package es18;

import java.util.Scanner;

public class es18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //lettura del numero di elementi
        int[] numeri = leggiNumeri(scanner);

        //calcolo del massimo e della sua posizione
        int[] risultato = trovaMassimo(numeri);

        //stampa del risultato
        stampaRisultato(risultato[0], risultato[1]);

        scanner.close();
    }

    //lettura dei numeri interi e memorizzazione nell'array
    public static int[] leggiNumeri(Scanner scanner) {
        System.out.print("Quanti numeri interi vuoi inserire? ");
        int n = scanner.nextInt();
        int[] numeri = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
        }
        return numeri;
    }

    //metodo per trovare il massimo e il la sua posizione
    public static int[] trovaMassimo(int[] numeri) {
        int massimo= Integer.MIN_VALUE;
        int posizione= 0;
        for (int i=0; i < numeri.length; i++) {
            if (numeri[i] > massimo) {
                massimo = numeri[i];
                posizione = i+1; // posizione inizia da 1 e non da 0
            }
        }
        return new int[]{massimo, posizione};
    }

    //metodo per stampare il risultato
    public static void stampaRisultato(int massimo, int posizione) {
        System.out.println("Il valore massimo è: " + massimo);
        System.out.println("La sua posizione è: " + posizione);
    }
}