package es9;

import java.util.Scanner;

public class es9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    System.out.println("Inserire raggio della sfera: ");
    int raggio = scanner.nextInt();

    double volume = (4.0/3.0) * Math.PI * Math.pow(raggio, 3);
    double superficie = 4.0 * Math.PI * Math.pow(raggio, 2);

    System.out.printf("Volume: %.2f\n", volume);
    System.out.printf("Superficie: %.2f\n", superficie);

    scanner.close();

    }
}
