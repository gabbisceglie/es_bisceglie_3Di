package es6.es1;

import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        int[] array = new int[10];

        riempiArray(array);
        stampaArray(array);
        rendiPari(array);
        System.out.println(); //a capo per leggibilità

        System.out.println("Array dopo aver reso tutti i numeri pari:");
        stampaArray(array);


        scanner.close();

    }

    //metodo per riempire l'array
    public static void riempiArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 101); //valori casuali tra 0 e 100
        }
    }

    //metodo per stampare l'array
    public static void stampaArray(int[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.println("Alla posizione " + (i+1) + ": " + array[i] + " ");
        }
    }

    //metodo per rendere tutti i numeri pari
    public static void rendiPari(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1; //+1 per rendere pari
            }
        }
    }
}