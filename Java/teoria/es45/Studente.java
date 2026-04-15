public class Studente {

    private String nome;
    private String cognome;

    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;

    }

    public void stampaStudente() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
    }
}