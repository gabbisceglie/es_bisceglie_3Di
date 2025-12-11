import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    int n;

    do {
        System.out.print("Quanti numeri vuoi inserire nell'array? ");
        n = scanner.nextInt();
    } while (n <= 0);

    int[] array = new int[n];

    caricaArray(array);

    System.out.println("Array originale: ");
    stampaArray(array);        
        
    System.out.println(); // Riga vuota per separazione
    System.out.println("L'array dopo la rotazione in avanti: ");

    ruotaArray(array);
    stampaArray(array);

    scanner.close();

    }

    // Metodo per caricare l'array con numeri interi casuali
    public static void caricaArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // Numeri casuali tra 0 e 99
        }
    }

    // Metodo per stampare l'array
    public static void stampaArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Posizione " + (i+1) + ": " + array[i]);

        }
    }

    // Metodo per ruotare l'array in avanti
    public static void ruotaArray(int[] array) {
        int temp = array[array.length - 1];

        for (int i=0; i<array.length; i++) {
            int current = array[i];
            array[i] = temp;
            temp = current;
        }
    }
}