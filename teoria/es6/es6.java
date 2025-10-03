package es6;

import java.util.Scanner;

public class es6 {
    public static void main(String[] args) {

        //dichiara variabili
        int a,b;

        //crea scanner
        Scanner scanner = new Scanner(System.in);

        //richiede primo num
        System.out.println("Inserisci un numero: ");
        a = scanner.nextInt();

        //richiede secondo num
        System.out.println("Inserisci un altro numero: ");
        b = scanner.nextInt();

        //stampa somma
        System.out.println("La somma dei due numeri è: " + (a+b));

        //per evitare perdite di risorse
        scanner.close();
    }
}