package es4.es1;

/*
Scrivi un algoritmo che determini il numero di scatti effettuati da un utente
telefonico e l’ammontare della sua bolletta. Vengono forniti in input i seguenti
dati:
• Il nome dell’utente;
• Il numero di scatti emersi dalla lettura della bolletta precedente;
• Il numero di scatti emersi dalla lettura della bolletta attuale;
• Il costo dello scatto.
• Il costo del canone fisso.

Ricorda inoltre che:
– Per determinare il valore della bolletta occorre anche aggiungere un canone fisso 
– Il costo dello scatto raddoppia se si superano 1000 scatti, per la sola parte eccedente
i 1000 scatti.

Fornire una breve analisi del problema, realizzare la tabella delle variabili e il
diagramma di flusso. Successivamente, implementare l'algoritmo in Flowgorithm
e infine nel linguaggio Java
*/

import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dei dati
        System.out.print("Inserisci il nome dell'utente: ");
        String nomeUtente = input.nextLine();

        System.out.print("Inserisci il numero di scatti della bolletta precedente: ");
        int scattiPrecedenti = input.nextInt();

        System.out.print("Inserisci il numero di scatti della bolletta attuale: ");
        int scattiAttuali = input.nextInt();

        System.out.print("Inserisci il costo dello scatto: ");
        double costoScatto = input.nextDouble();

        System.out.print("Inserisci l'importo del canone fisso: ");
        double canoneFisso = input.nextDouble();

        input.close();

        // Calcolo del numero di scatti effettuati
        int scattiEffettuati = scattiAttuali - scattiPrecedenti;

        // Calcolo del costo della bolletta
        double costoTotale;
        if (scattiEffettuati > 1000) {
            int scattiNormali = 1000;
            int scattiEccedenti = scattiEffettuati - 1000;
            costoTotale = (scattiNormali * costoScatto) + (scattiEccedenti * costoScatto * 2) + canoneFisso;
        } else {
            costoTotale = (scattiEffettuati * costoScatto) + canoneFisso;
        }

        // Output del risultato
        System.out.println("\nBolletta per l'utente: " + nomeUtente);
        System.out.println("Numero di scatti effettuati: " + scattiEffettuati);
        System.out.printf("Importo totale della bolletta: %.2f\n", costoTotale);

        input.close();

    }
}