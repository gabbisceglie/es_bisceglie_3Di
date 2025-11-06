package es13;

import java.util.Scanner;

public class es13 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        int[] numeri = new int[10];
        int num = 0, numero1 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci un numero");
            num = tastiera.nextInt();
            numeri[i] = num;
        }

        System.out.println("Inserisci il numero da trovare");
        numero1 = tastiera.nextInt();

        boolean trovato = false;
        for (int i = 0; i < 10; i++) {
            if (numero1 == numeri[i]) {
                trovato = true;
                break;
            }
        }

        if (trovato == true) {
            System.out.println("Il numero è presente nell'array");
        } else {
            System.out.println("Il numero non è presente nell'array");
        }

        tastiera.close();
    }
}