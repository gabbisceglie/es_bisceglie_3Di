import java.util.Scanner;

public class es27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int array[][] = new int[4][4];

        generaArray(array);

        System.out.println("Array generato:");
        stampaArray(array);

        //la somma di tutti gli elementi della matrice;
        int somma=sommaElementi(array);
        System.out.println("Somma di tutti gli elementi: " + somma);

        //la somma degli elementi della diagonale principale (elementi con indice di riga uguale all’indice di colonna);
        int diagonale=sommaDiagonalePrincipale(array);
        System.out.println("Somma della degli elementi della diagonale principale: " + diagonale);

        //la somma degli elementi della diagonale secondaria (elementi con indice di riga + indice di colonna uguale a dimensione − 1);
        int diagonaleSecondaria = sommaDiagonaleSecondaria(array);
        System.out.println("Somma della degli elementi della diagonale secondaria: " + diagonaleSecondaria);

        //il valore massimo presente nella matrice e la sua posizione (riga e colonna);
        int max = valoremax(array);
        System.out.println("Valore massimo: " + max);

        //la somma degli elementi di ogni riga, stampando il risultato per ciascuna riga.
        int riga=sommaElementiRiga(array);
        System.out.println("Somma degli elementi di ogni riga: " + riga);





        scanner.close();
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

    //metodo per la somma degli elementi della diagonale secondaria
    public static int sommaDiagonaleSecondaria(int[][] arr) {
        int somma = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            somma += arr[i][n - 1 - i];
        }
        return somma;
    }

    //metodo per trovare il valore massimo nella matrice
    public static int valoremax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    //metodo per la somma degli elementi di ogni riga
    public static int sommaElementiRiga(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sommaRiga = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sommaRiga += arr[i][j];
            }
            System.out.println("Somma della riga " + i + ": " + sommaRiga);
        }
        return 0;
    }
}