package es40;

import java.util.Scanner;

public class es40 {
    public static void main(String[] args) {
        
    Gestione prenotazione = new Gestione();

    Scanner scanner = new Scanner(System.in);

    System.out.print("Inserisci codice prenotazione (6 caratteri): ");
    prenotazione.setCodicePrenotazione(scanner.nextLine());

    System.out.print("Inserisci nome cliente: ");
    prenotazione.setNomeCliente(scanner.nextLine());

    System.out.print("Inserisci numero biglietti (1-8): ");
    prenotazione.setNumeroBiglietti(scanner.nextInt());

    System.out.print("Inserisci prezzo biglietto (6-15): ");
    prenotazione.setPrezzoBiglietto(scanner.nextInt());

    scanner.nextLine();
    System.out.print("Inserisci tipologia cliente (intero, studente, Senior): ");
    prenotazione.setTipologiaCliente(scanner.nextLine());

    scanner.close();

    System.out.println("Codice Prenotazione: " + prenotazione.getCodicePrenotazione());
    System.out.println("Nome Cliente: " + prenotazione.getNomeCliente());
    System.out.println("Numero Biglietti: " + prenotazione.getNumeroBiglietti());
    System.out.println("Prezzo Biglietto: " + prenotazione.getPrezzoBiglietto());
    System.out.println("Tipologia Cliente: " + prenotazione.getTipologiaCliente());
    System.out.println("Totale da pagare: " + prenotazione.calcolaTotale());















    }
}