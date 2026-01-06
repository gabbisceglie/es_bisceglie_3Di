import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr1[]=new int[10];
        int arr2[]=new int[10];

        riempiArray(arr1);
        riempiArray(arr2);

        System.out.println();

        System.out.println("Array 1:");
        stampaArray(arr1);

        System.out.println("\nArray 2:");
        stampaArray(arr2);

        System.out.println("\nArray unito:");
        int[] arr3 = unisciArray(arr1, arr2);
        stampaArray(arr3);

        scanner.close();
    }

    //metodo per riempire un array con numeri generati tra 1 e 100
    public static void riempiArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }
    }

    //metodo per stampare un array
    public static void stampaArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //metodo per unire i due array in un terzo array da 20 elementi
    public static int[] unisciArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i=0; i<arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i=0; i<arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        return arr3;
    }
    
}
