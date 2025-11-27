package teoria;

import java.util.Scanner;

/*Scrivi un algoritmo che:
1) legga da tastiera n numeri interi e li memorizzi in un array ordinato in modo crescente;
2) chieda all’utente di inserire un numero da cercare;
3) utilizzi l’algoritmo di ricerca binaria (o dicotomica) per stabilire se il numero è presente o meno nell’array;
4) visualizzi un messaggio appropriato:
“Numero trovato nella posizione X” se il numero è presente;
“Numero non presente nella sequenza” se non lo è.*/

public class es19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int[] array = new int[n];

        System.out.print("Inserisci il numero di elementi da memorizzare: ");
        n = scanner.nextInt();

        System.out.println("Inserisci " + n + " numeri interi in ordine crescente:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Inserisci il numero da cercare: ");
        int cercaN = scanner.nextInt();

        int risultato = binarySearch(array, cercaN);

        if (risultato != -1) {
            System.out.println("Numero trovato nella posizione " + risultato);
        } else {
            System.out.println("Numero non presente nella sequenza");
        }

        scanner.close();
    }
}