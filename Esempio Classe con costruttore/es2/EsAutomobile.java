import java.util.Scanner;

import es2.Automobile;

public class EsAutomobile {
    public static void main(String[] args) {

        //Dichiarare la tastiera per acquisire le informazioni sulle auto
        Scanner scanner = new Scanner(System.in);

        //Creare le prime tre auto con il costruttore che accetta tutti i valori come parametro;
        Automobile automobile1 = new Automobile("Peugeot", "207 3p", 163000, 65, 88, "rosso", "benzina", false, 2007, 06, 3150, "Brivio");

        Automobile automobile2 = new Automobile("Porsche", "Cayman", 100000, 217, 295, "grigio", "benzina", false, 2006, 04, 34000, "Poviglio");

        Automobile automobile3 = new Automobile("Land Rover", "Range Rover Equov..", 23000, 120, 163, "bianca", "diesel", true, 2022, 01, 47000, "Giulianova");

        /*Creare l’ultima auto con il costruttore vuoto e usare i metodi 
        set per impostare tutti i valori di tuttigli attributi;*/
        Automobile automobile4 = new Automobile();

        System.out.print("Inserisci la marca: ");
        String marca = scanner.nextLine();
        automobile4.setMarca(marca);

        System.out.print("Inserisci il modello: ");
        String modello = scanner.nextLine();
        automobile4.setModello(modello);

        System.out.print("Inserisci Km: ");
        int km = scanner.nextInt();
        automobile4.setKilometri(km);

        System.out.print("Inserisci Kw: ");
        int Kw = scanner.nextInt();
        automobile4.setKilowatt(Kw);

        System.out.print("Inserisci cavalli: ");
        int cavalli = scanner.nextInt();
        automobile4.setCavalli(cavalli);

        scanner.nextLine(); // consume endline after numeric input

        System.out.print("Inserisci colore: ");
        String colore = scanner.nextLine();
        automobile4.setColore(colore);

        System.out.print("Inserisci alimentazione: ");
        String alimentazione = scanner.nextLine();
        automobile4.setAlimentazionePrimaria(alimentazione);

        System.out.print("L'auto è elettrica? ");
        boolean elettrica = scanner.nextBoolean();
        automobile4.setElettrica(elettrica);

        System.out.println("Inserire l'anno: ");
        int anno = scanner.nextInt();
        automobile4.setAnno(anno);

        System.out.println("Inserire il mese: ");
        int mese = scanner.nextInt();
        automobile4.setMese(mese);

        System.out.println("Inserire il prezzo: ");
        double prezzo = scanner.nextDouble();
        automobile4.setPrezzo(prezzo);

        scanner.nextLine(); // consume endline after numeric input

        System.out.println("Inserire la città: ");
        String paese = scanner.nextLine();
        automobile4.setPaese(paese);

        //Stampare modello, marca e kilometri di tutte le quattro auto;
        System.out.println(automobile1.getModello());
        System.out.println(automobile1.getKilometri());

        System.out.println("--------------------------------------------------");

        System.out.println(automobile2.getModello());
        System.out.println(automobile2.getKilometri());

        System.out.println("--------------------------------------------------");

        System.out.println(automobile3.getModello());
        System.out.println(automobile3.getKilometri());

        System.out.println("--------------------------------------------------");

        System.out.println(automobile4.getModello());
        System.out.println(automobile4.getKilometri());

        System.out.println("--------------------------------------------------");

        /*Stampare modello, marca e colore dell’auto con il prezzo più basso, facendo i confronti dei prezzi
        delle quattro auto (e non stampando a mano la quarta perché vediamo che è quella con il prezzo
        più basso), usando il metodo getPrezzo; */
        if (automobile1.getPrezzo() < automobile2.getPrezzo() && automobile1.getPrezzo() < automobile3.getPrezzo() && automobile1.getPrezzo() < automobile4.getPrezzo()) {
            System.out.println("L'auto più economica è: " + automobile1.getMarca() + " " + automobile1.getModello() + " di colore " + automobile1.getColore());
        } else if (automobile2.getPrezzo() < automobile1.getPrezzo() && automobile2.getPrezzo() < automobile3.getPrezzo() && automobile2.getPrezzo() < automobile4.getPrezzo()) {
            System.out.println("L'auto più economica è: " + automobile2.getMarca() + " " + automobile2.getModello() + " di colore " + automobile2.getColore());
        } else if (automobile3.getPrezzo() < automobile1.getPrezzo() && automobile3.getPrezzo() < automobile2.getPrezzo() && automobile3.getPrezzo() < automobile4.getPrezzo()) {
            System.out.println("L'auto più economica è: " + automobile3.getMarca() + " " + automobile3.getModello() + " di colore " + automobile3.getColore());
        } else {
            System.out.println("L'auto più economica è: " + automobile4.getMarca() + " " + automobile4.getModello() + " di colore " + automobile4.getColore());
        }

        //Stampare modello, marca e anno delle auto con più di 50mila kilometri e meno di 200mila kilometri
        if (automobile1.getKilometri() > 50000 && automobile1.getKilometri() < 200000) {
            System.out.println("Auto con più di 50mila km e meno di 200mila km: " + automobile1.getMarca() + " " + automobile1.getModello() + " anno " + automobile1.getAnno());
        }
        if (automobile2.getKilometri() > 50000 && automobile2.getKilometri() < 200000) {
            System.out.println("Auto con più di 50mila km e meno di 200mila km: " + automobile2.getMarca() + " " + automobile2.getModello() + " anno " + automobile2.getAnno());
        }
        if (automobile3.getKilometri() > 50000 && automobile3.getKilometri() < 200000) {
            System.out.println("Auto con più di 50mila km e meno di 200mila km: " + automobile3.getMarca() + " " + automobile3.getModello() + " anno " + automobile3.getAnno());
        }
        if (automobile4.getKilometri() > 50000 && automobile4.getKilometri() < 200000) {
            System.out.println("Auto con più di 50mila km e meno di 200mila km: " + automobile4.getMarca() + " " + automobile4.getModello() + " anno " + automobile4.getAnno());
        }


        //Chiudere la tastiera
        scanner.close();
    }
}