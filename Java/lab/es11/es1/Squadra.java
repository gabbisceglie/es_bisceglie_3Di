package es11.es1;

public class Squadra {

    //Attributi
	private String nome;
	private int annoDiFondazione;
	private Giocatore[] giocatori;

    //Costruttore
	public Squadra(String nome, int annoDiFondazione) {
		this.nome = nome;
		this.annoDiFondazione = annoDiFondazione;
		this.giocatori = new Giocatore[22];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnnoDiFondazione() {
		return annoDiFondazione;
	}

	public void setAnnoDiFondazione(int annoDiFondazione) {
		this.annoDiFondazione = annoDiFondazione;
	}

	public Giocatore[] getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(Giocatore[] giocatori) {
		this.giocatori = giocatori;
	}

    //------------------------------------------------------------

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Squadra: ").append(nome)
				.append(", anno di fondazione: ").append(annoDiFondazione)
				.append("\nGiocatori:");
		for (Giocatore giocatore : giocatori) {
			if (giocatore != null) {
				stringBuilder.append("\n").append(giocatore);
			}
		}
		return stringBuilder.toString();
	}

	public boolean aggiungiGiocatore(Giocatore giocatore) {
		if (giocatore == null) {
			return false;
		}

		for (int i = 0; i < giocatori.length; i++) {
			if (giocatori[i] == null) {
				giocatori[i] = giocatore;
				return true;
			}
		}

		return false;
	}

	public boolean cercaGiocatore(Giocatore giocatore) {
		if (giocatore == null) {
			return false;
		}

		for (int i = 0; i < giocatori.length; i++) {
			Giocatore giocatorePresente = giocatori[i];
			if (giocatorePresente != null) {
				return true;
			}
		}

		return false;
	}
}