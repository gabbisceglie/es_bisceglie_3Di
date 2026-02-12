package es36;

import java.util.Scanner;

/*Descrivi la classe per il programma che calcola il perimetro di un poligono regolare
in cui tutti i lati hanno la stessa lunghezza. L'applicazione legge da tastiera il numero dei lati e la lunghezza del lato del poligono
e calcola il valore del perimetro */

public class poligono {

	private int numeroLati;
	private double lunghezzaLato;

	public poligono(int numeroLati, double lunghezzaLato) {
		setNumeroLati(numeroLati);
		setLunghezzaLato(lunghezzaLato);
	}

	public int getNumeroLati() {
		return numeroLati;
	}

	public void setNumeroLati(int numeroLati) {
		do {
            System.out.print("Inserisci un numero di lati valido (almeno 3): ");
            numeroLati = new Scanner(System.in).nextInt();
        } while (numeroLati < 3);
		this.numeroLati = numeroLati;
	}

	public double getLunghezzaLato() {
		return lunghezzaLato;
	}

	public void setLunghezzaLato(double lunghezzaLato) {

        Scanner scanner = new Scanner(System.in);

		do {
            System.out.print("Inserisci una lunghezza del lato valida (maggiore di 0): ");
            lunghezzaLato = scanner.nextDouble();
        } while (lunghezzaLato <= 0);
		this.lunghezzaLato = lunghezzaLato;
	}

	public double calcolaPerimetro() {
		return (numeroLati * lunghezzaLato);
	}

}