package es7.es2;

/*
Scrivere un programma che riceve in ingresso una sequenza di N numeri interi (anche casuali). 
Il valore N è inserito dall’utente. I numeri sono memorizzati in un vettore. Terminato l’inserimento della sequenza di numeri, il programma deve visualizzare una riga di
asterischi per ogni numero inserito. Il numero di asterischi nella riga è pari al valore del
numero inserito. Ad esempio, dato il vettore 9 4 6 il programma deve visualizzare:
Elemento 1: 9 *********
Elemento 2: 4 ****
Elemento 3: 6 ******
scrivi i metodi 
void caricaArray
void visualizzaAsterischi
 */

import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

    do {
        System.out.print("Inserisci il numero di elementi (N): ");
        n = scanner.nextInt();
    } while (n <= 0);

        int[] array = new int[n];

        caricaArray(array, scanner);

        visualizzaAsterischi(array);


        scanner.close();
    }

    //Metodo per caricare l'array con i numeri inseriti dall'utente
    public static void caricaArray(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Inserisci l'elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }  
    }

    //Metodo per visualizzare gli asterischi in base ai valori dell'array
    public static void visualizzaAsterischi(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println(); // Vai a capo dopo ogni riga di asterischi
        }
    }    
}
