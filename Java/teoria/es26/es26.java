package es26;

public class es26 {
    public static void main(String[] args) {
    
        //creo un array 3x3
        int arr[][] = new int[3][3];

        //metodo per generare numeri casuali per l'array
        generaArray(arr);

        //stampo l'array
        stampaArray(arr);

        int somma=sommaElementi(arr);
        System.out.println("Somma di tutti gli elementi: " + somma);

        int diagonale=sommaDiagonalePrincipale(arr);
        System.out.println("Somma della degli elementi della diagonale principale: " + diagonale);





}

    //metodo per generare numeri casuali per l'array
    public static void generaArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * (100+1)); // numeri da 0 a 100
            }
        }
    }

    //metodo per stampare l'array
    public static void stampaArray(int[][] arr) {
        System.out.println();
        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //metodo per la somma di tutti gli elementi
    public static int sommaElementi(int[][] arr) {
        int somma = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                somma += arr[i][j];
            }
        }
        return somma;
    }

    //metodo per la somma degli elementi della diagonale principale
    public static int sommaDiagonalePrincipale(int[][] arr) {
        int somma = 0;
        for (int i = 0; i < arr.length; i++) {
            somma += arr[i][i];
        }
        return somma;
    }

}