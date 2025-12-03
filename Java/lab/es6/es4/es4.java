package es6.es4;

/*
Scrivere un programma che riceve in ingresso una sequenza di N numeri interi (anche casuali). 
I numeri sono memorizzati in un vettore. 
Il valore N è inserito dall’utente, ma il vettore può contenere al massimo 10 numeri. 
il programma deve verificare se gli elementi del vettore sono tutti uguali tra loro. 
*/

import java.util.Scanner;

public class es4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("Inserisci il numero di elementi (max 10): ");
            n = scanner.nextInt();
        } while (n < 1 || n > 10);

        int[] numeri = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
        }

        boolean tuttiUguali = true;

        for(int i=1; i<n; i++) {
            if(numeri[i] != numeri[0]) {
                tuttiUguali = false;
                break;
            }
        }

        if(tuttiUguali==true) {
            System.out.println("Tutti gli elementi sono uguali.");
        } else {
            System.out.println("Gli elementi non sono tutti uguali.");
        }

        scanner.close();
    }
}
