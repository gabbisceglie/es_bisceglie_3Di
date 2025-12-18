package es24;

import java.util.Scanner;

public class es24 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    int n;

do{
    System.out.print("Inserisci la dimensione dell'array (intero positivo): ");
    n = scanner.nextInt();
}while(n <= 0);

int arr[] = new int[n];

    //lettura dell'array
    leggiArray(arr, scanner);

    //array nel suo stato originale
    System.out.println("Array originale:");
    stampaArray(arr);

    //ordinamento dell'array
    System.out.println("Ordinamento dell'array...");
    ordinaArray(arr);

    //riga vuota per separare le sezioni
    System.out.println();

    //array dopo l'ordinamento
    System.out.println("Array ordinato:");
    stampaArray(arr);

        scanner.close();
    }

    // Metodo per stampare l'array
    public static void stampaArray(int[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.println("Elemento " + (i+1) + ": " + array[i]);
        }
    }

    //metodo per leggere l'array
    public static void leggiArray(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Inserisci il valore per l'elemento " + i + ": ");
            array[i] = scanner.nextInt();
        }
    }

    //metodo per ordinare l'array con insertion sort
    public static void ordinaArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            //sposta gli elementi dell'array che sono maggiori di key
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}