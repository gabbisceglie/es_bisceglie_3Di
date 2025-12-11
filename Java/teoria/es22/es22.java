import java.util.Scanner;

/*
Progetta un algoritmo per ordinare un array di numeri interi utilizzando il Bubble Sort e
rappresentalo tramite un diagramma di flusso.

Realizza poi la corrispondente implementazione in Java, che dovrà:
• leggere la dimensione dell’array e i suoi elementi,
• applicare il Selection Sort,
• stampare l’array ordinato.
Il programma deve rispettare il principio di modularità.
*/

public class es22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("Inserisci la dimensione dell'array (intero positivo): ");
            n = scanner.nextInt();
        } while (n<=0);

        int[] arr = new int[n];

        //carica l'array
        caricaArray(scanner, arr);

        //ordina l'array con Selection Sort
        selectionSort(arr);

        // Stampa l'array ordinato
        System.out.println("Array ordinato:");
        for (int i=0; i < n; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + arr[i]);
        }

        scanner.close();
    }

    //metodo per caricare l'array
    public static void caricaArray(Scanner scanner, int[] arr) {
        for (int i=0; i < arr.length; i++) {
            System.out.print("Inserisci l'elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    //metodo per ordinare l'array con Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i < n - 1; i++)
        {
            int minimo = i;
            for (int j=i+1; j<n; j++) {
                if (arr[j] < arr[minimo]) {
                    minimo = j;
                }
            }
            // Scambia arr[i] con arr[minimo]
            int temp = arr[i];
            arr[i] = arr[minimo];
            arr[minimo] = temp;
        }
    }

}
