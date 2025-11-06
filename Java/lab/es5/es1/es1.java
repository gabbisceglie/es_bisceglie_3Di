package es1;

import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int nlire = 0, ndollari = 0, neuro = 0;
    char scelta;

    System.out.print("Inserisci il numero di lire: ");
    nlire = scanner.nextInt();
    
    ndollari = nlire / 1500;
    neuro = nlire / 1936;

    System.out.println("Seleziona la valuta di conversione:");
    System.out.println("D. Dollari");
    System.out.println("E. Euro");
    scelta = scanner.next().charAt(0);

    if (scelta == 'D' || scelta == 'd') {
        System.out.println(nlire + " lire corrispondono a " + ndollari + " dollari.");
    } else if (scelta == 'E' || scelta == 'e') {
        System.out.println(nlire + " lire corrispondono a " + neuro + " euro.");
    } else {
        System.out.println("Scelta non valida.");
    }
    scanner.close();












    }
}