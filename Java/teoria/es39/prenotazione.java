package es39;


public class prenotazione {
    private String codicePrenotazione;
    private String nomeCliente;
    private int NumeroPosti;
    private double prezzoPerPosto;

//-------------------GET E SET PRENOTAZIONE-------------------

    public String getCodicePrenotazione() {
        return codicePrenotazione;
    }

    public void setCodicePrenotazione (String codicePrenotazione) {
        if (codicePrenotazione.length() == 6) {
            this.codicePrenotazione = codicePrenotazione;
        } else {
            System.out.println("Errore: Il codice prenotazione deve avere ESATTAMENTE 6 caratteri.");
        }
    }

//------------------------------------------------------------

//-------------------GET E SET NOMECLIENTE--------------------
    public String getNomeCliente(){
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if(nomeCliente.length() >= 3) {
            this.nomeCliente = nomeCliente;
        } else {
            System.out.println("Errore: Il nome cliente deve avere ALMENO 3 caratteri");
        }
    }

//------------------------------------------------------------

//-------------------GET E SET NUMEROPOSTI--------------------

    public int getNumeroPosti() {
        return NumeroPosti;
    }

    public void setNumeroPosti(int NumeroPosti) {
        if (NumeroPosti > 0 && NumeroPosti <= 10) {
            this.NumeroPosti = NumeroPosti;
        } else {
            System.out.println("Errore: Il numero di posti deve essere compreso tra 1 e 10.");
        }
    }

//------------------------------------------------------------

//-------------------GET E SET NUMEROPOSTI--------------------

    public double getPrezzoPerPosto(){
        return prezzoPerPosto;
    }

    public void setPrezzoPerPosto(double prezzoPerPosto) {
        if(prezzoPerPosto > 0) {
            this.prezzoPerPosto = prezzoPerPosto;
        }
    }

    public void calcolaTotale() {
        System.out.println("Il totale è: " + (NumeroPosti * prezzoPerPosto));
    }

//------------------------------------------------------------

}