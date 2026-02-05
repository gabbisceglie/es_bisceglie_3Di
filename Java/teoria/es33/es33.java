package es33;

import java.io.*;

public class es33 {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        //creazione dell'oggetto
        Anagrafica contatto = new Anagrafica();

        System.out.print("Inserisci il nome: ");
        try {
            contatto.nome = tastiera.readLine();
            System.out.print("Inserisci il cognome: ");
        } catch (IOException e) {}

        System.out.print("Inserisci il cognome: ");
        try {
            contatto.cognome = tastiera.readLine();
        } catch (IOException e) {}

        System.out.print("Inserisci email: ");
        try {
            String email = tastiera.readLine();
            contatto.registraEmail(email);
        } catch (IOException e) {}

        System.out.println("\nRiepilogo contatto:");
        contatto.stampaDati();
    }
}
