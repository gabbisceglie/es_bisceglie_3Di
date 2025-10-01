package esercizio6;

//Determinare la superficie totale di un cilindro dati raggio di base e altezza

import java.util.Scanner;

public class esercizio6 {
    
    public static void main(String[] args) {

        double raggio, altezza, superficieTotale, areaBase, areaLaterale;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il raggio di base del cilindro:");
        raggio = scanner.nextDouble();

        System.out.println("Inserisci l'altezza del cilindro:");
        altezza = scanner.nextDouble();

        areaBase = 2 * Math.PI * raggio * raggio;
        areaLaterale = 2 * Math.PI * raggio * altezza;
        superficieTotale = areaBase + areaLaterale;
        
        System.out.println("La superficie totale del cilindro e': " + superficieTotale);
        
        scanner.close(); //per evitare perdite di memoria
    }
}
