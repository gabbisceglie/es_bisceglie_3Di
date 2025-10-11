package stabilimento;

import java.util.Scanner;

public class stabilimento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quante ore vuoi affittare l'ombrellone?");
        int ore = scanner.nextInt();

        System.out.println("Quanti lettini vuoi affittare?");
        int lettini = scanner.nextInt();



        //se le ore sono piu di 4, allora è 1 euro all'ora, altrimenti 1,50 euro all'ora
        if(ore > 4) {
            System.out.println("Il prezzo totale è: " + (ore * 1) + " euro, piu 5 euro a lettino, quindi in totale: " + ((ore * 1) + (lettini * 5)) + " euro");
        } else {
            System.out.println("Il prezzo totale è: " + (ore * 1.5) + " euro, piu 5 euro a lettino, quindi in totale: " + ((ore * 1.5) + (lettini * 5)) + " euro");
        }

        scanner.close();
    }
}
