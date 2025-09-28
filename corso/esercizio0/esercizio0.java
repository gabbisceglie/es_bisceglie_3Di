package corso;

                            //Realizza una semplice calcolatrice con le 4 operazioni.

import java.util.Scanner;

public class esercizio0 {
    public static void main(String[] args) {
        int n1, n2;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci primo numero: ");
        n1 = tastiera.nextInt();

        System.out.println("Inserisci secondo numero: ");
        n2 = tastiera.nextInt();


        // Calcoli e stampe a video somma, differenza, prodotto e quoziente
        System.out.println("La somma dei due numeri è " + (n1+n2));
    
        System.out.println("La differenza dei due numeri è " + (n1-n2));

        System.out.println("Il prodotto dei due numeri è " + (n1*n2));

        System.out.println("Il quoziente dei due numeri è " + (n1/n2));

    }
}