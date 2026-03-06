package es42;
public class Prestiti {
    
    private String codicePrestito; //esattamente 5 caratteri
    private String nomeStudente;
    private String titoloLibro;
    private int numeroGiorniPrestito; //1=<x<=30
    private int giorniRitardo; //>=0

    public String getCodicePrestito() {
        return codicePrestito;
    }

    public void setCodicePrestito(String codicePrestito) {
        if (codicePrestito.length() == 5) {
            this.codicePrestito = codicePrestito;
        }
    }

    public String getNomeStudente() {
        return nomeStudente;
    }

    public void setNomeStudente(String nomeStudente) {
        this.nomeStudente = nomeStudente;
    }

    public String getTitoloLibro() {
        return titoloLibro;
    }

    public void setTitoloLibro(String titoloLibro) {
        this.titoloLibro = titoloLibro;
    }

    public int getNumeroGiorniPrestito() {
        return numeroGiorniPrestito;
    }

    public void setNumeroGiorniPrestito(int numeroGiorniPrestito) {
        if (numeroGiorniPrestito >= 1 && numeroGiorniPrestito <= 30) {
            this.numeroGiorniPrestito = numeroGiorniPrestito;
        }
    }

    public int getGiorniRitardo() {
        return giorniRitardo;
    }

    public void setGiorniRitardo(int giorniRitardo) {
        if (giorniRitardo >= 0) {
            this.giorniRitardo = giorniRitardo;
        }
    }

    public double calcolaPenale() {
        if (giorniRitardo > 0) {
            return giorniRitardo * 0.50;
        } else {
            return 0;
        }
    }
}
