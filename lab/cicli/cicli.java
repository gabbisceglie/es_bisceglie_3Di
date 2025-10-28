package cicli;

//Scrivi un algoritmo che dati in input N numeri, determini: il maggiore, il minore e la differenza tra il maggiore e il minore.

import java.util.Scanner;

public class cicli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quanti numeri vuoi inserire? ");
        int N = input.nextInt();

        if (N <= 0) {
            System.out.println("Devi inserire un numero positivo maggiore di zero.");
            input.close();
            return;
        }

        System.out.print("Inserisci il numero 1: ");
        int numero = input.nextInt();
        int maggiore = numero;
        int minore = numero;

        for (int i = 2; i <= N; i++) {
            System.out.print("Inserisci il numero " + i + ": ");
            numero = input.nextInt();

            if (numero > maggiore) {
                maggiore = numero;
            }
            if (numero < minore) {
                minore = numero;
            }
        }

        int differenza = maggiore - minore;

        System.out.println("Il numero maggiore è: " + maggiore);
        System.out.println("Il numero minore è: " + minore);
        System.out.println("La differenza tra il maggiore e il minore è: " + differenza);

        input.close();
        
    }
}