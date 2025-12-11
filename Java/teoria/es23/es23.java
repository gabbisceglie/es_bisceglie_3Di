package es23;

import java.util.Scanner;

/*
ES. n. 23
Dato un array di N interi scrivere un algoritmo (o programma Java) per invertire gli elementi (cioè
il primo deve andare al posto dell’ultimo e viceversa, il secondo al posto del penultimo, etc.).
La dimensione e gli elementi dell'array devono essere forniti in input dall'utente.
È necessario utilizzare metodi distinti per invertire l’array e stampare il risultato ovvero l’array
invertito.
Implementare i controlli per verificare la correttezza dei dati inseriti dall’utente.

VINCOLI:
• I numeri gestiti dal problema devono essere interi positivi
SVOLGIMENTO:
• Analisi (descrizione del problema)
• Definizione dei dati di INPUT e OUTPUT (redigere la tabella delle variabili)
• Definizione del flowchart (controllo dei vincoli sui dati di input)
• Implementazione in Java (assicurati di commentare il codice in modo chiaro)
*/

public class es23 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    int n;
    
    do {
        System.out.print("Inserisci la dimensione dell'array (intero positivo): ");
        n = scanner.nextInt();
    } while (n <= 0);

    int[] array = new int[n];

    generaArray(array);

    System.out.println("Array originale:");
    stampaArray(array);

    System.out.println();

    System.out.println("Array invertito:");
    invertiArray(array);
    stampaArray(array);

        scanner.close();
    }

    // Metodo per generare l'array con numei generati casualmente
    public static void generaArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // Numeri casuali tra 0 e 99
        }
    }

    // Metodo per stampare l'array
    public static void stampaArray(int[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.println("Elemento " + (i+1) + ": " + array[i]);
        }
    }

    // Metodo per invertire l'array
    public static void invertiArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1 -i] = temp;
        }
    }

}
