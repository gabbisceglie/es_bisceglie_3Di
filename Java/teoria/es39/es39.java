package es39;

import java.util.Scanner;

public class es39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        prenotazione prenotazione = new prenotazione();

        // Leggi valori dall'utente usando lo scanner
        System.out.print("Inserisci codice prenotazione (6 caratteri): ");
        String codice = scanner.nextLine();
        prenotazione.setCodicePrenotazione(codice);

        System.out.print("Inserisci nome cliente: ");
        String nome = scanner.nextLine();
        prenotazione.setNomeCliente(nome);

        System.out.print("Inserisci numero posti (1-10): ");
        String postiStr = scanner.nextLine();
        try {
            int posti = Integer.parseInt(postiStr);
            prenotazione.setNumeroPosti(posti);
        } catch (NumberFormatException e) {
            System.out.println("Input non valido per numero posti.");
        }

        System.out.print("Inserisci prezzo per posto: ");
        String prezzoStr = scanner.nextLine();
        try {
            double prezzo = Double.parseDouble(prezzoStr);
            prenotazione.setPrezzoPerPosto(prezzo);
        } catch (NumberFormatException e) {
            System.out.println("Input non valido per prezzo.");
        }

        System.out.println("Prenotazione: ");
        System.out.println("Codice: " + prenotazione.getCodicePrenotazione());
        System.out.println("Nome: " + prenotazione.getNomeCliente());
        System.out.println("Posti: " + prenotazione.getNumeroPosti());
        System.out.println("Prezzo per posto: " + prenotazione.getPrezzoPerPosto());

        prenotazione.calcolaTotale();

        scanner.close();
    }
}