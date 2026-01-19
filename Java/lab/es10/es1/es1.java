package es1;

import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

    do {
        System.out.print("Inserisci un numero intero: ");
        n=scanner.nextInt();
    }while(n<0);   

    int[] array = new int [n];

    caricaArray(array);

    System.out.println("Array originale: ");
    stampaArray(array);


    System.out.println("L'array è ordinato in modo: ");
    controllaOrdinamento(array);

        scanner.close();
    }

    //metodo per caricare un array con numeri generati casualmente
    public static void caricaArray(int[] array) {
        for (int i = 0; i<array.length; i++) {
            array[i] = (int) (Math.random() * 100); //numeri casuali tra 0 e 99
        }
    }

    //metodo per stampare un array
    public static void stampaArray(int[] array) {
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //metodo per controllare se l'array è ordinato in modo crescente o decrescente
    public static void controllaOrdinamento(int[] array ) {

        //se è crescente, stampa sulla stessa riga "crescente"
        //se è decrescente, stampa sulla stessa riga "decrescente"
        //se non è ordinato, stampa "nullo"
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                    System.out.print("crescente");
            } else if (array[i] < array[i - 1]) {
                 System.out.print("decrescente");
            } else {
                System.out.print("nullo");
            }
        }
    }
}