package esercizio5;

//Determinare area e perimetro di un rettangolo ricevendo in input base e altezza

import java.util.Scanner;

public class esercizio5 {
    public static void main(String[] args) {

        double base, altezza, area, perimetro;

        System.out.println("Inserisci la base del rettangolo:");
        Scanner scanner = new Scanner(System.in);
        base = scanner.nextDouble();

        System.out.println("Inserisci l'altezza del rettangolo:");
        altezza = scanner.nextDouble();

        area = base * altezza;
        perimetro = 2 * (base + altezza);

        System.out.println("L'area del rettangolo e': " + area);
        System.out.println("Il perimetro del rettangolo e': " + perimetro);
        
        scanner.close(); //per evitare perdite di memoria
    }
}
