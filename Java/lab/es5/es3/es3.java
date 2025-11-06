package es3;

import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero, somma=0, conteggio=0;
        int massimo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        // Integer.MIN_VALUE è il valore minimo che un int può rappresentare: -2^31 = -2147483648 (dati trovati su google)
        // Integer.MAX_VALUE è il valore massimo che un int può rappresentare: 2^31 - 1 = 2147483647 (dati trovati su google)

        while (true) {
            System.out.print("Inserisci un numero naturale (0 o negativo per terminare): ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                break;
            }

            if (numero > massimo) {
                massimo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }

            somma += numero;
            conteggio++;
        }

        if (conteggio > 0) {
            double media = (double) somma / conteggio;
            System.out.println("Il massimo è " + massimo + ", il minimo è " + minimo + ", la media è " + media);
        } else {
            System.out.println("Nessun numero valido inserito.");
        }

        scanner.close();
    }

}