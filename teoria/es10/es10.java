<<<<<<< HEAD
#package teoria.es10;

import java.util.Scanner;

public class es10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;

do {
        System.out.print("Inserisci un numero intero positivo: ");
        numero = scanner.nextInt();

} while(numero<=0);

    int somma = 0;

    for (int i = 1; i < (numero+1); i++) {
        System.out.print("Inserisci il " + i + " numero su " + numero + ": ");
        int n = scanner.nextInt();
        if (n > 0) {
            somma += n;
        } else {
            System.out.println("Per favore, inserisci solo numeri interi positivi.");
            i--; // Decrementa i per ripetere l'iterazione corrente
    }
}

        scanner.close();
        
    System.out.println("La somma dei numeri inseriti è: " + somma);    
      
    }
=======
#package teoria.es10;

import java.util.Scanner;

public class es10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;

do {
        System.out.print("Inserisci un numero intero positivo: ");
        numero = scanner.nextInt();

} while(numero<=0);

    int somma = 0;

    for (int i = 1; i < (numero+1); i++) {
        System.out.print("Inserisci il " + i + " numero su " + numero + ": ");
        int n = scanner.nextInt();
        if (n > 0) {
            somma += n;
        } else {
            System.out.println("Per favore, inserisci solo numeri interi positivi.");
            i--; // Decrementa i per ripetere l'iterazione corrente
    }
}

        scanner.close();
        
    System.out.println("La somma dei numeri inseriti è: " + somma);    
      
    }
>>>>>>> 4245b2530b2a1daa85035e815c4fb1ba6bedbe76
}