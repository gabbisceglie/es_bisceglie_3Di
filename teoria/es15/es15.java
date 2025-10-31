package es15;
/*
Scrivere un programma che:
Chiedere all’utente quanti voti desidera inserire.
Creare un array di dimensione corrispondente.
Consentire all’utente di inserire i voti uno alla volta.
Calcolare la media aritmetica dei voti.
Visualizzare a video tutti i voti inseriti e la media finale.
*/

import java.util.Scanner;

public class es15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Quanti voti desideri inserire? ");
        n = scanner.nextInt();

        int[] voti = new int[n];
        int somma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il voto " + (i + 1) + ": ");
            voti[i] = scanner.nextInt();
            somma += voti[i];
        }

        double media = (double) somma / n;
        System.out.println("I voti inseriti sono:");
        for (int i=0; i<n; i++) {
            System.out.println(voti[i]);
        }

        System.out.printf("La media dei voti è: %.2f%n", media);

        scanner.close();

    }
}