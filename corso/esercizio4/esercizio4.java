package esercizio4;

//Determinare area e perimetro di una circonferenza ricevendo in input la lunghezza del raggio

import java.util.Scanner;

public class esercizio4 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
    double r, a, p;

    System.out.println("Inserisci il raggio della circonferenza: ");
    Scanner scanner = new Scanner(System.in);
    r = scanner.nextDouble();

    a = Math.PI * r * r;
    p = 2 * Math.PI * r;

    System.out.println("Area: " + a);
    System.out.println("Perimetro: " + p);
    
    scanner.close(); //per evitare perdite di memoria
    }
}