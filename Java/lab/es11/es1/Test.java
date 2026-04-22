package es11.es1;

import java.time.LocalDate;
import java.util.Random;

public class Test {

    private static final String[] NOMI = {
            "Luca", "Marco", "Andrea", "Matteo", "Davide", "Simone", "Alessio", "Stefano",
            "Federico", "Gabriele", "Francesco", "Nicolo", "Tommaso", "Riccardo", "Emanuele"
    };

    private static final String[] COGNOMI = {
            "Rossi", "Bianchi", "Verdi", "Esposito", "Romano", "Ricci", "Marino", "Greco",
            "Bruno", "Gallo", "Conti", "De Luca", "Mancini", "Lombardi", "Barbieri"
    };

    public static void main(String[] args) {
        Random random = new Random();

        Squadra primaSquadra = new Squadra("Atletico Bisceglie", 1978);
        Squadra secondaSquadra = new Squadra("Sporting Trani", 1985);

        for (int i = 0; i < 22; i++) {
            Giocatore giocatore = creaGiocatoreCasuale(random, i + 1);
            primaSquadra.aggiungiGiocatore(giocatore);
        }

        for (int i = 0; i < 22; i++) {
            Giocatore giocatore = creaGiocatoreCasuale(random, i + 1);
            secondaSquadra.aggiungiGiocatore(giocatore);
        }

        Giocatore daCercare = primaSquadra.getGiocatori()[random.nextInt(22)];

        System.out.println("Giocatore da cercare: " + daCercare);

        boolean presenteNellaPrima = primaSquadra.cercaGiocatore(daCercare);
        boolean presenteNellaSeconda = secondaSquadra.cercaGiocatore(daCercare);

        if (presenteNellaPrima) {
            System.out.println("Il giocatore e' presente nella prima squadra: " + primaSquadra.getNome());
        }

        if (presenteNellaSeconda) {
            System.out.println("Il giocatore e' presente nella seconda squadra: " + secondaSquadra.getNome());
        }

        if (!presenteNellaPrima && !presenteNellaSeconda) {
            System.out.println("Il giocatore non e' presente in nessuna delle due squadre.");
        }
    }

    private static Giocatore creaGiocatoreCasuale(Random random, int numeroMaglia) {
        String nome = NOMI[random.nextInt(NOMI.length)];
        String cognome = COGNOMI[random.nextInt(COGNOMI.length)];
        int anno = 1988 + random.nextInt(18);
        int mese = 1 + random.nextInt(12);
        int giorno = 1 + random.nextInt(28);
        LocalDate dataDiNascita = LocalDate.of(anno, mese, giorno);
        boolean riserva = numeroMaglia > 11;

        return new Giocatore(nome, cognome, dataDiNascita, numeroMaglia, riserva);
    }
}
