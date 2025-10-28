package es12;

import java.util.Scanner;

public class es12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        int somma = 0;
        double media;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Inserisci un numero intero: ");
            array[i] = scanner.nextInt();
            somma += array[i];
        }

        media = (double) somma / array.length;

        System.out.println("La somma degli elementi è: " + somma);
        System.out.println("La media degli elementi è: " + media);

        scanner.close();
    }
}