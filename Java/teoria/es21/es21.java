                                                            /*Tabella delle variabili:
                                --------------------------------------------------------------------------------------------
                                | Nome     | Tipo       | Scopo / Descrizione                                              |
                                |----------|------------|------------------------------------------------------------------|
                                | scanner  | Scanner    | Lettura da tastiera (input dell'utente)                          |
                                | nArr     | int        | Dimensione dell'array (numero di elementi, intero positivo)      |
                                | arr      | int[]      | Array di interi che verrà ordinato                               |
                                | i        | int        | Indice esterno usato nei cicli for                               |
                                | j        | int        | Indice interno usato nei cicli for                               |
                                | minimo   | int        | Indice dell'elemento minimo trovato nella porzione non ordinata  |
                                | temp     | int        | Variabile temporanea usata per lo scambio di elementi            |
                                --------------------------------------------------------------------------------------------

- Realizza un programma in Java, che dovrà:
• leggere la dimensione dell’array e i suoi elementi,
• applicare il Selection Sort,
• stampare l’array ordinato.
Il programma deve rispettare il principio di modularità. */

import java.util.Scanner;

public class es21 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int nArr;

        do {
        System.out.print("Inserisci la dimensione dell'array (intero positivo): ");
        nArr = scanner.nextInt();
        } while (nArr <= 0);

        int[] arr = new int[nArr];

        for (int i = 0; i < nArr; i++) {
            System.out.print("Inserisci l'elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < nArr - 1; i++)
        {
            int minimo = i;
            for (int j = i + 1; j < nArr; j++) {
                if (arr[j] < arr[minimo]) {
                    minimo = j;
                }
            }
            // Scambia arr[i] con arr[minimo]
            int temp = arr[i];
            arr[i] = arr[minimo];
            arr[minimo] = temp;
        }

        // Stampa l'array ordinato
        System.out.println("Array ordinato:");

        for (int i = 0; i < nArr; i++) {
            System.out.print(arr[i] + " ");
        }




    scanner.close();

    }
}