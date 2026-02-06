//Es35
import java.util.Scanner;

public class es35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Credenziali utente = new Credenziali("admin", "1234");

        System.out.print("Inserisci login: ");
        String loginInserito = scanner.nextLine();

        System.out.print("Inserisci password: ");
        String passwordInserita = scanner.nextLine();

        if (utente.verifica(loginInserito, passwordInserita)) {
            System.out.println("Accesso consentito");
        } else {
            System.out.println("Accesso negato");
        }

        scanner.close();
    }
}
