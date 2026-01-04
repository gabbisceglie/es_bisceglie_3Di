import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int n;

    do{
        System.out.print("Inserisci un numero: ");
        n = scanner.nextInt();
    }while(n<0);

    int arr[] = new int[n];

    riempiArray(arr);

    System.out.println("Array riempito:");
    stampaArray(arr);

    System.out.println("Array ruotato in avanti:");
    ruotaArray(arr);
    stampaArray(arr);






        scanner.close();
    }

    //metodo per riempire l'array di N numeri casuali generati tra 1 e 100
    public static void riempiArray(int arr[]){
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

    //metodo per ruotare l'array in avanti
    public static void ruotaArray(int arr[]){
        if(arr.length == 0) return; // Gestione caso array vuoto

        int ultimo = arr[arr.length - 1];
        for(int i=arr.length - 1; i>0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = ultimo;
    }
}