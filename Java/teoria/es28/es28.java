package es28;

import java.util.Scanner;

public class es28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[][] = new int[3][5];
        generaArray(arr);

        System.out.println("Array generato:");
        stampaArray(arr);

        //il numero di elementi pari presenti nella matrice;
        int cPari = contaElementiPari(arr);
        System.out.println("Numero di elementi pari nella matrice: " + cPari);

        //somma degli elementi della prima colonna;
        int sommaPrimaColonna = sommaPrimaColonna(arr);
        System.out.println("Somma degli elementi della prima colonna: " + sommaPrimaColonna);

        //il valore massimo di ciascuna riga.
        int[] maxCiascunaRiga = valoreMassimoCiascunaRiga(arr);
        System.out.println("Valore massimo di ciascuna riga:");
        for (int i = 0; i < maxCiascunaRiga.length; i++) {
            System.out.println("Riga " + i + ": " + maxCiascunaRiga[i]);
        }


        scanner.close();
    }

    //metodo per generare numeri casuali per l'array
    public static void generaArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * (100+1)); // numeri da 0 a 100
            }
        }
    }

    //metodo per stampare l'array
    public static void stampaArray(int[][] arr) {
        System.out.println();
        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //metodo per contare gli elementi pari nella matrice
    public static int contaElementiPari(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    //metodo per sommare gli elementi della prima colonna
    public static int sommaPrimaColonna(int[][] arr) {
        int somma = 0;
        for (int i = 0; i < arr.length; i++) {
            somma += arr[i][0];
        }
        return somma;
    }

    //metodo per il valore massimo di ciascuna riga
    public static int[] valoreMassimoCiascunaRiga(int[][] arr) {
        int[] maxValues = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            maxValues[i] = max;
        }
        return maxValues;
    }
}