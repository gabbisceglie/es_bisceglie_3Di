package es43;

public class Prenotazioni {

    private String codicePrenotazione;
    private String nomeCliente;
    private int numeroNottiPrenotate;
    private double prezzoPerNotte;
    private boolean servizioMinibar;

    public Prenotazioni() {
    }

    public String getCodicePrenotazione() {
        return codicePrenotazione;
    }

    public void setCodicePrenotazione(String codicePrenotazione) {
        this.codicePrenotazione = codicePrenotazione;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroNottiPrenotate() {
        return numeroNottiPrenotate;
    }

    public void setNumeroNottiPrenotate(int numeroNottiPrenotate) {
        this.numeroNottiPrenotate = numeroNottiPrenotate;
    }

    public double getPrezzoPerNotte() {
        return prezzoPerNotte;
    }

    public void setPrezzoPerNotte(double prezzoPerNotte) {
        this.prezzoPerNotte = prezzoPerNotte;
    }

    public boolean isServizioMinibar() {
        return servizioMinibar;
    }

    public void setServizioMinibar(boolean servizioMinibar) {
        this.servizioMinibar = servizioMinibar;
    }

    public double calcolaCostoTotale() {
        double costoBase = numeroNottiPrenotate * prezzoPerNotte;
        if(servizioMinibar) {
            costoBase += 20; // costo aggiuntivo per il minibar
        }
        return costoBase;
    }
}
