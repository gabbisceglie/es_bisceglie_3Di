package es17;

import java.util.Scanner;

public class es17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //lettura del numero di elementi
        int n=0;
        leggiNumero(scanner, n);

        //inserimento numeri da sommare
        int arr[] = new int[n];
        inserimentodati(scanner, n, arr);

        // Calcolo della somma
        int somma = calcolaSomma(arr, n);

        // Stampa del risultato
        System.out.println("La somma dei numeri inseriti è: " + somma);

        scanner.close();
    }

//Metodi-------------------------------------------------------------------------------------------

    //Legge il numero e lo memorizza in n
    public static int leggiNumero(Scanner scanner, int n) {
    
    try {
        System.out.print("Quanti numeri vuoi inserire?: ");

        n = scanner.nextInt();
    } catch (Exception e) {
        System.out.println("Errore di inserimento del numero.");
        return 0;
    }
        return n;
    }

//-------------------------------------------------------------------------------------------------

    //legge n valori e li memorizza nell'array
    public static void inserimentodati(Scanner scanner, int n, int[] arr) {
            for (int i = 0; i < n; i++) {
               try {    
                System.out.print("Inserisci il numero " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            

            } catch (Exception e) {
                System.out.println("Errore di inserimento dati nell'array.");
            }
        }
    }

//-------------------------------------------------------------------------------------------------

    // Calcola la somma
    public static int calcolaSomma(int[] arr, int n) {
        int somma = 0;
        for (int j = 0; j < n; j++) {
            somma += arr[j];
        }
        return somma;
    }

//chiusura main
}