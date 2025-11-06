package es4.es2;

/*
Schema variabili:

numeroProdotti: tiene traccia del numero di prodotti acquistati dall'utente

prezzoProdotto: memorizza il prezzo di ciascun prodotto inserito dall'utente

totaleSpesa: accumula il costo totale di tutti i prodotti acquistati
*/

/*
Analisi del problema:

L'algoritmo deve calcolare la spesa totale di un utente in base al numero di prodotti acquistati e ai loro prezzi.
1. Chiedere all'utente di inserire il numero di prodotti acquistati.

2. Inizializzare una variabile per tenere traccia della spesa totale.

3. Utilizzare un ciclo per iterare attraverso il numero di prodotti:
    a. Per ogni prodotto, chiedere all'utente di inserire il prezzo.
    b. Aggiungere il prezzo del prodotto alla spesa totale.

4. Alla fine del ciclo, visualizzare la spesa totale all'utente.
 */

import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di prodotti acquistati: ");
        int numeroProdotti = scanner.nextInt();

        double totaleSpesa = 0.0;
        for (int i = 1; i <= numeroProdotti; i++) {
            System.out.print("Inserisci il prezzo del prodotto " + i + ": ");
            double prezzoProdotto = scanner.nextDouble();
            totaleSpesa += prezzoProdotto;
        }

        System.out.printf("La spesa totale è: %.2f%n", totaleSpesa);

        scanner.close();
    }
}