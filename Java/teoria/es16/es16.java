package es16;

import java.util.Scanner;

public class es16 {
//_______________________________________________Main__________________________________________________
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lettura dei dati
        int num1 = leggiNumero1(scanner);
        int num2 = leggiNumero2(scanner);
        
        // Calcolo della somma
        int somma = calcolaSomma(num1, num2);

        // Stampa del risultato
        stampaRisultato(somma);

        scanner.close();
    }
//_______________________________________________Main__________________________________________________



    // 1. Legge i due numeri e li ritorna come oggetto Coppia
    public static int leggiNumero1(Scanner scanner) {
        System.out.print("Inserire primo numero: ");
        int num1 = scanner.nextInt();

        return num1;
    }

    public static int leggiNumero2(Scanner scanner) {
        System.out.print("Inserire secondo numero: ");
        int num2 = scanner.nextInt();

        return num2;
    }

    // 2. Calcola la somma
    public static int calcolaSomma(int num1, int num2) {
        return num1 + num2;
    }

    // 3. Stampa il risultato
    public static void stampaRisultato(int risultato) {
        System.out.println("Il risultato è: " + risultato);
    }
}