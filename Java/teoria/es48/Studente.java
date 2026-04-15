public class Studente extends Persona {
    private String classe;

    public Studente(String nome, String cognome, String classe) {
        super(nome, cognome);
        this.classe = classe;
    }
    
    @Override
    public void presentati() {
        System.out.println("Ciao, sono uno studente ");
    }

    public void studia() {
        System.out.println("Sto studiando...");
    }
    
}
