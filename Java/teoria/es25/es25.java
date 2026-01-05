package es25;

import java.util.Scanner;

public class es25 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Inserisci la lunghezza dell'array: ");
    int n = scanner.nextInt();

    int[] array = new int[n];

    generaArray(array);

    System.out.println("Array generato:");
    stampaArray(array);

    sommaArray(array);

        scanner.close();
    }


    //metodo per caricare l'array con valori generati casualmente
    public static void generaArray (int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100)+1;
        }
    }

    //metodo per stampare l'array
    public static void stampaArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //metodo per calcolare e stampare la somma degli elementi dell'array
    public static void sommaArray(int arr[]){
        int somma = 0;
        for(int i=0; i<arr.length; i++){
            somma += arr[i];
        }
        System.out.println("La somma degli elementi dell'array è: " + somma);
    }

}
