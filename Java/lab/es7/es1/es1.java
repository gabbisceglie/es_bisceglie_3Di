package es7.es1;

import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("Inserisci il numero di elementi (max 30): ");
            n = scanner.nextInt();
        } while (n<1 || n>30);

        int[] array = new int[n];

        caricaArray(array);

        int risultato = sonoStrettamenteCrescente(array);

        if (risultato==1) {
            System.out.println("Il vettore è strettamente crescente.");
        } else {
            System.out.println("Il vettore non è strettamente crescente.");
        }

        

        scanner.close();
    }

    //metodo per caricare l'array
    public static void caricaArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Inserisci l'elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }

    //metodo per verificare se l'array è strettamente crescente
    public static int sonoStrettamenteCrescente(int[] array) {
        for (int i=0; i<array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return 0;
            }
        }
        return 1;
    }

}