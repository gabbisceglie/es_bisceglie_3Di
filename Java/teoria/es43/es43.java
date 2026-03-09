package es43;

import java.util.Scanner;

public class es43 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Prenotazioni prenotazione1 = new Prenotazioni();
    
            prenotazione1.setNomeCliente("Mario Rossi");
            prenotazione1.setCodicePrenotazione("PR123");
            prenotazione1.setNumeroNottiPrenotate(5);
            prenotazione1.setPrezzoPerNotte(100);
            prenotazione1.setServizioMinibar(true);
    
            double costoTotale = prenotazione1.calcolaCostoTotale();
            System.out.println("Costo totale della prenotazione: " + costoTotale + " euro");

            // Richiedi all'utente se desidera visualizzare il riepilogo della prenotazione
            System.out.println("Richiedi il riepilogo della prenotazione? (yes/no)");
            String risposta = scanner.nextLine();
            if(risposta.equalsIgnoreCase("yes")) {
                System.out.println("Riepilogo Prenotazione:");
                System.out.println("Nome Cliente: " + prenotazione1.getNomeCliente());
                System.out.println("Codice Prenotazione: " + prenotazione1.getCodicePrenotazione());
                System.out.println("Numero Notti Prenotate: " + prenotazione1.getNumeroNottiPrenotate());
                System.out.println("Prezzo per Notte: " + prenotazione1.getPrezzoPerNotte() + " euro");
                System.out.println("Servizio Minibar: " + (prenotazione1.isServizioMinibar() ? "Sì" : "No"));
                System.out.println("Costo Totale: " + costoTotale + " euro");
            } else {
                System.out.println("Riepilogo non richiesto.");
            }

        scanner.close();
    }
}
