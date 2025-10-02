package esercizio2;

            //Determinare l’ipotenusa di un triangolo rettangolo sapendo la lunghezza dei cateti


import java.util.Scanner;

public class esercizio2 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
    
        
        double c1, c2, ipo;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Inserire il primo cateto: ");
        c1 = scanner.nextInt();

    System.out.println("Inserire il secondo cateto: ");
        c2 = scanner.nextInt();

    ipo = Math.sqrt((c1 * c1) + (c2 * c2));

    System.out.println("L'ipotenusa è " + ipo);

    scanner.close(); //per evitare perdite di memoria
    }

}
