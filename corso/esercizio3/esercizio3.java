package corso.esercizio3;

                        //Dato l'altezza e il raggio di base del cono determinare il volume

import java.util.Scanner;

public class esercizio3 {

    public static void main(String[] args) {
        
    double h, r, v;

Scanner scanner = new Scanner(System.in);

    System.out.println("Inserire l'altezza: ");
        h = scanner.nextInt();

    System.out.println("Inserire il raggio: ");
        r = scanner.nextInt();

    v = (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;

        System.out.println("Il volume del cono è " + v);

    }
}
