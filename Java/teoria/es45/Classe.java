public class Classe {
    private int TotaleStudenti;
    private Studente[] studenti;

    public Classe(int TotaleStudenti) {
        this.TotaleStudenti = TotaleStudenti;
        this.studenti = new Studente[TotaleStudenti];
    }

    public void aggiungiStudente(Studente s) {
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i] == null) {
                studenti[i] = s;
                TotaleStudenti++;
                break;
            }
        }
    }

    public void rimuoviStudente(Studente s) {
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i] != null && studenti[i].equals(s)) {
                studenti[i] = null;
                TotaleStudenti--;
                break;
            }
        }
    }

    public void stampaNumeroStudenti() {
        System.out.println("Numero totale di studenti: " + TotaleStudenti);
    }

    public void stampaStudenti() {
        System.out.println("Elenco degli studenti:");
        for (Studente s : studenti) {
            if (s != null) {
                s.stampaStudente();
            }
        }
    }
}