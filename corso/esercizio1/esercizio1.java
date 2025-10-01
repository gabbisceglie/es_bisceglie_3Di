package esercizio1;

// Determinare area e perimetro di un quadrato ricevendo in input la lunghezza del lato

import java.util.Scanner;

public class esercizio1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String[] args) {

        int l;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire la lunghezza del lato: ");
        l = scanner.nextInt();

        // Operazioni varie
        System.out.println("L'area del quadrato è " + (l * l));
        System.out.println("Il perimetro del quadrato è " + (l * 4));

        scanner.close(); //per evitare perdite di memoria
        
    }
}