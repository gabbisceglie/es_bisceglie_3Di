import java.io.*;

public class es34 {
    public static void main(String[] args) {
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);

        //creazione dell'oggetto
        ContoCorrente conto = new ContoCorrente();

        //dichiarazione e inizializzazione variabili
        String valore= " ";
        double importo=0;

        System.out.print("Importa da versare: ");
        try {
            valore = tastiera.readLine();
            importo = Double.parseDouble(valore);
        } catch (IOException e) {

        }

        conto.versa(importo);
        conto.stampaSaldo();

        System.out.print("Importo da prelevare: ");
        try {
            valore = tastiera.readLine();
            importo = Double.parseDouble(valore);
        } catch (IOException e) {

        }

    if(conto.getSaldo() >= importo) {
        conto.preleva(importo);
        conto.stampaSaldo();
    } else {
        System.out.println("Prelievo non disponibile.");
    }
    }
}