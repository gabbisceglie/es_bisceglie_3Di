import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int n;

    do{
        System.out.print("Inserisci lunghezza array: ");
        n = scanner.nextInt();
    }while(n<0);

    int arr[] = new int[n];

    riempiArray(arr);

    System.out.println("Array riempito:");
    stampaArray(arr);

    System.out.print("Ordine dell'array:");
    ruotaArray(arr);

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

    //metodo per controllare se l'array è crescente, decrescente o né l'uno né l'altro, e stampa il risultato
    public static void ruotaArray(int arr[]){
        boolean crescente = true;
        boolean decrescente = true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                decrescente = false;
            } else if(arr[i] > arr[i+1]){
                crescente = false;
            }
        }

        //stampa il risultato
        if(crescente){
            System.out.print(" Crescente");
        } else if(decrescente){
            System.out.print(" Decrescente");
        } else {
            System.out.print(" Né crescente né decrescente");
        }
    }
    
}