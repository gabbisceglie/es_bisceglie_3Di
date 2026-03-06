package es40;
public class Gestione {

    private String CodicePrenotazione;
    private String NomeCliente;
    private int NumeroBiglietti;
    private int PrezzoBiglietto;
    private String TipologiaCliente;

    public String getCodicePrenotazione() {
        return CodicePrenotazione;
    }

    public void setCodicePrenotazione(String codicePrenotazione) {
        if((codicePrenotazione.length()) == 6) {
        CodicePrenotazione = codicePrenotazione;            
        }
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public int getNumeroBiglietti() {
        return NumeroBiglietti;
    }

    public void setNumeroBiglietti(int numeroBiglietti) {
        if(numeroBiglietti >= 1 && numeroBiglietti <= 8) {
        NumeroBiglietti = numeroBiglietti;            
        }
    }

    public int getPrezzoBiglietto() {
        return PrezzoBiglietto;
    }

    public void setPrezzoBiglietto(int prezzoBiglietto) {
        if(prezzoBiglietto >= 6 && prezzoBiglietto <= 15) {
        PrezzoBiglietto = prezzoBiglietto;
        }
    }

    public String getTipologiaCliente() {
        return TipologiaCliente;
    }

    public void setTipologiaCliente(String tipologiaCliente) {
        if(tipologiaCliente.equals("intero") || tipologiaCliente.equals("studente") || tipologiaCliente.equals("Senior")) {
        TipologiaCliente = tipologiaCliente;            
        }
    }

    public double calcolaTotale() {
        double totale = NumeroBiglietti * PrezzoBiglietto;
        if(TipologiaCliente.equals("studente")) {
            totale = totale - (totale * 0.10);
        } else if(TipologiaCliente.equals("Senior")) {
            totale = totale - (totale * 0.15);
        }
        return totale;
    }
}
