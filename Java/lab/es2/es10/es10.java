package es10;

import java.util.Scanner;

public class es10 {
public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Scegli l'opzione di conversione:");
    System.out.println("1. Celsius a Fahrenheit");
    System.out.println("2. Fahrenheit a Celsius");
    int scelta = scanner.nextInt();

    if (scelta == 1) {
        System.out.print("Inserisci la temperatura in Celsius: ");

        //conversione Celsius a Fahrenheit
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.printf("%.2f °C sono %.2f °F%n", celsius, fahrenheit);

        //conversione Fahrenheit a Celsius
    } else if (scelta == 2) {
        System.out.print("Inserisci la temperatura in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("%.2f °F sono %.2f °C%n", fahrenheit, celsius);

    } else {
        System.out.println("Scelta non valida.");
    }

    scanner.close();

    }
}