package es7;

import java.util.Scanner;

public class es7 {
    public static void main(String[] args) {

        int n1, n2;
        double quoziente;

        Scanner scanner = new Scanner(System.in);

        //richiede i 2 numeri (riga 13/18)
        System.out.print("Inserire primo numero: ");
        n1 = scanner.nextInt();

        System.out.print("Inserire secondo numero: ");
        n2 = scanner.nextInt();

        System.out.println("La somma è: " + (n1+n2));

        System.out.println("La differenza è: " + (n1-n2));

        System.out.println("Il prodotto è: " + (n1*n2));

        if (n2 != 0) {
            quoziente = (double)n1/n2;
            System.out.println("Il quoziente è: " + quoziente);
        } else {
            System.out.println("Divisione per zero non permessa.");
        }

        scanner.close();
    }
}