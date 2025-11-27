package es20;
                                                                /*Tabella delle variabili:
                                    ------------------------------------------------------------------------------------------
                                    |Nome          | Funzione                                                        | Tipo  |
                                    |--------------|-----------------------------------------------------------------|------ |
                                    |nArr          | Dimensione dell'array inserita dall'utente                      | int   |
                                    |arr           | Array che contiene i numeri inseriti dall'utente                | int[] |
                                    |max           | Valore massimo trovato (in main e in trovaMassimo)              | int   |
                                    |comparse      | Cont delle occorrenze del valore massimo (main/contaComparse)   | int   |
                                    |array         | Parametro dei metodi che rappresenta l'array (corrisponde a arr)| int[] |
                                    |valoreMassimo | Parametro di contaComparse che indica il valore da contare      | int   |
                                    |num           | Variabile di input usata nei metodi                             | int   |
                                    ------------------------------------------------------------------------------------------ */

import java.util.Scanner;

public class es20 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int nArr=0;

    // Input della dimensione dell'array con controllo di validità
    do{
        System.out.print("Inserisci la dimensione dell'array (intero positivo): ");
        nArr = scanner.nextInt();
    }while(nArr <= 0);

//---------------------------------------------------------------------------------------------------

    //Input dei valori nArr elementi con controllo di validità
    int[] arr = new int[nArr];
    for (int i = 0; i < nArr; i++) {
        try {
            System.out.print("Inserisci l'elemento " + (i + 1) + " (intero positivo): ");
            arr[i] = scanner.nextInt();
            if (arr[i] < 0) {
                System.out.println("Errore: Devi inserire un numero intero positivo.");
                i--; // Decrementa i per ripetere l'inserimento
            }
        } catch (Exception e) {
            System.out.println("Errore: Devi inserire un numero intero positivo.");
            scanner.next(); // Pulisce l'input non valido
            i--; // Decrementa i per ripetere l'inserimento
        }
    }

//---------------------------------------------------------------------------------------------------

int max= trovaMassimo(arr);

int comparse= contaComparse(arr, max);

System.out.println("Il valore massimo è: " + max);
System.out.println("Il valore massimo compare " + comparse + " volte.");

        scanner.close();
    }
    
//metodo 1: trova il valore massimo nell'array
    public static int trovaMassimo(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

//metodo 2: conta quante volte il valore massimo compare nell'array
    public static int contaComparse(int[] array, int valoreMassimo) {
        int comparse = 0;
        for (int num : array) {
            if (num == valoreMassimo) {
                comparse++;
            }
        }
        return comparse;
    }

}