package es44;

import java.util.Scanner;

public class ContoBancario {

    private double saldo;
    private titolare titolare;

    Scanner scanner = new Scanner(System.in);

    public ContoBancario(titolare titolare) {
        this.titolare = titolare;
        this.saldo = 1000.0;
    }

    public void prelievo() {
        System.out.print("Inserisci l'importo da prelevare: ");
        int importo = scanner.nextInt();
        if (importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo effettuato con successo.");
        } else {
            System.out.println("Saldo insufficiente.");
        }
    }

    public void deposito(Scanner scanner) {
        System.out.print("Inserisci l'importo da depositare: ");
        int importo = scanner.nextInt();
        saldo += importo;
        System.out.println("Deposito effettuato con successo.");
    }

    public double getSaldo() {
        return saldo;
    }
}
