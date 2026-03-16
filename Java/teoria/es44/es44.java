package es44;

import java.util.Scanner;

public class es44 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        int scelta;
        titolare titolareCorrente = null;
        ContoBancario conto = null;

        do{
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Crea titolare");
            System.out.println("2. Crea conto");
            System.out.println("3. Visualizza saldo");
            System.out.println("4. Preleva denaro");
            System.out.println("5. Deposita denaro");
            System.out.println("0. Esci");

            scelta = scanner.nextInt();

            switch(scelta){
                case 1:
                    System.out.print("Inserisci il nome del titolare: ");
                    String nome = scanner.next();
                    System.out.print("Inserisci il cognome del titolare: ");
                    String cognome = scanner.next();
                    titolareCorrente = new titolare(nome, cognome);
                    System.out.println("Titolare creato con successo.");
                    System.out.println("--------------------------------------------------");
                    break;

                case 2:
                    if (titolareCorrente == null) {
                        System.out.println("Prima crea un titolare (opzione 1).");
                    } else {
                        conto = new ContoBancario(titolareCorrente);
                        System.out.println("Conto creato con successo.");
                        System.out.println("--------------------------------------------------");

                    }

                    break;

                case 3:
                    if (conto == null) {
                        System.out.println("Nessun conto disponibile. Crea prima un conto (opzione 2).");
                    } else {
                        System.out.println("Saldo attuale: " + conto.getSaldo());
                        System.out.println("--------------------------------------------------");
                    }

                    break;

                case 4:
                    if (conto == null) {
                        System.out.println("Nessun conto disponibile. Crea prima un conto (opzione 2).");
                        System.out.println("--------------------------------------------------");
                    } else {
                        conto.prelievo();
                    }

                    break;

                case 5:
                    if (conto == null) {
                        System.out.println("Nessun conto disponibile. Crea prima un conto (opzione 2).");
                        System.out.println("--------------------------------------------------");
                    } else {
                        conto.deposito(scanner);
                    }

                    break;
                case 0:
                    System.out.println("Uscita in corso...");
                    break;
                default:
                    System.out.println("Scelta non valida, riprova.");
            }

        }while(scelta != 0);

        scanner.close();
    }
}
