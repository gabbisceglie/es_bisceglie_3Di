package es42;

import java.util.Scanner;

public class es42 {
    public static void main(String[] args) {
        
    Prestiti prestito1 = new Prestiti();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci nome cliente: ");
        prestito1.setNomeStudente(scanner.nextLine());

        System.out.print("Inserisci codice prestito (5 caratteri): ");
        prestito1.setCodicePrestito(scanner.nextLine());

        System.out.print("Inserisci titolo libro: ");
        prestito1.setTitoloLibro(scanner.nextLine());

        System.out.print("Inserisci numero giorni prestito (1-30): ");
        prestito1.setNumeroGiorniPrestito(scanner.nextInt());

        System.out.print("Inserisci giorni di ritardo (>=0): ");
        prestito1.setGiorniRitardo(scanner.nextInt());

        double penale = prestito1.calcolaPenale();
        if(penale > 0) {
        System.out.println("Penale da pagare: " + penale + " euro");
        } else {
            System.out.println("Nessuna penale da pagare.");
        }

        scanner.close();
    }
}
