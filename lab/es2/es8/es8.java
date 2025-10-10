package es8;

import java.util.Scanner;

public class es8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //chiede i tre numeri
        System.out.print("Inserisci il primo numero: ");
        int n1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int n2 = scanner.nextInt();

        System.out.print("Inserisci il terzo numero: ");
        int n3 = scanner.nextInt();

        //calcola la media
        double media = (n1 + n2 + n3) / 3.0;
        System.out.println("La media dei tre numeri è: " + media);

        //chiude lo scanner per evitare perdite di memoria
        scanner.close();

    }
}