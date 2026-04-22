package es11.es1;

import java.time.LocalDate;

public class Giocatore {

	//Attributi
	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
	private int numeroMaglia;
	private boolean riserva;

	//Costruttore
	public Giocatore(String nome, String cognome, LocalDate dataDiNascita,
			int numeroMaglia, boolean riserva) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.numeroMaglia = numeroMaglia;
		this.riserva = riserva;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public int getNumeroMaglia() {
		return numeroMaglia;
	}

	public void setNumeroMaglia(int numeroMaglia) {
		this.numeroMaglia = numeroMaglia;
	}

	public boolean isRiserva() {
		return riserva;
	}

	public void setRiserva(boolean riserva) {
		this.riserva = riserva;
	}

	@Override
	public String toString() {
		return "Giocatore: " + nome + " " + cognome
				+ ", data di nascita: " + dataDiNascita
				+ ", numero di maglia: " + numeroMaglia
				+ ", riserva: " + riserva;
	}
}