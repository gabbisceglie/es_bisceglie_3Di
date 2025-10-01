package esercizio7;

/*Dato il raggio del cerchio di base di un cilindro e la sua altezza, calcolare il peso
del cilindro sapendo che la sostanza di cui è composto ha peso specifco = 3,40
g/cm3 (Volume = area della base x altezza; Peso = Volume x Peso specifco).*/

import java.util.Scanner;

public class esercizio7 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        double raggio, altezza, peso;
        final double PESO_SPECIFICO = 3.40;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il raggio di base del cilindro:");
        raggio = scanner.nextDouble();

        System.out.println("Inserisci l'altezza del cilindro:");
        altezza = scanner.nextDouble();

        double volume = Math.PI * raggio * raggio * altezza;
        peso = volume * PESO_SPECIFICO;

        System.out.println("Il peso del cilindro è: " + peso + " g");

        scanner.close(); //per evitare perdite di memoria
    }
}
