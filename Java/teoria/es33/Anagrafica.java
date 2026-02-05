package es33;

public class Anagrafica {
    
    //attributi pubblici
    public String nome;
    public String cognome;

    //attributi privati
    private String email;
    private boolean registrata;

    public void registraEmail(String p_email) {
        email = p_email;
        registrata = true;
    }

    public void stampaDati() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);

        if (registrata) {
            System.out.println("Email: " + email);
        } else {
            System.out.println("Email non registrata.");
        }
    }
}
