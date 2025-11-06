package es8;

import java.util.Scanner;

public class es8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedere all'utente di inserire il lato del quadrato
        System.out.print("Inserisci lato del quadrato: ");
        double lato = scanner.nextDouble();


        // Calcolare area e perimetro
        double area = lato * lato;
        double perimetro = 4 * lato;

        // Stampare i risultati
        System.out.println("Il perimetro del quadrato è: " + perimetro);
        System.out.println("L'area del quadrato è: " + area);

        // Chiudere lo scanner per evitare perdite di risorse
        scanner.close();
    }
}