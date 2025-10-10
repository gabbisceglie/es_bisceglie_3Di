package es9;

import java.util.Scanner;

public class es9 {
    public static void main(String[] args) {

        //crea lo scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto al HyperClub!");

        //richiede l'età
        System.out.print("Inserisci la tua età: ");

        //uso il try catch per gestire l'input e per eventuali errori(es. inserimento di testo al posto di un numero)
        try {
            int eta = scanner.nextInt();
            if (eta < 0) {
                System.out.println("Età non valida");
            } else if (eta < 18) {
                System.out.println("Torna a bere il latte da mamma, sei minorenne!");
            } else {
                System.out.println("Vai a ballare, e dacci dentro!");
            }
        } catch (Exception e) {
            System.out.println("Input non valido. Per favore, inserisci un numero intero.");
        } finally {

            //per evitare memory leak
            scanner.close();
        }
    }
}

/*Consegna:
1.    Disegna un diagramma di flusso che rappresenti il seguente algoritmo:

Chiedere all’utente di inserire la propria età.
Se l’età è minore di 0, visualizzare un messaggio di errore (“Età non valida”).
Se l’età è minore di 18, visualizzare il messaggio “Accesso non consentito ai minori”.
Altrimenti, visualizzare il messaggio “Accesso consentito”.
Gestire eventuali errori di input (es. inserimento di testo al posto di un numero).    
2.    Converti il diagramma di flusso in un programma Java che utilizzi:
La classe Scanner per leggere l’età.
Una struttura condizionale if...else if...else.
Un blocco try-catch per intercettare eventuali eccezioni di input.*/