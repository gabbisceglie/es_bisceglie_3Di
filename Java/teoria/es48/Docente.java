public class Docente extends Persona{
    private String materia;

    public Docente(String nome, String cognome, String materia) {
        super(nome, cognome);
        this.materia = materia;
    }

    public void insegna() {
        System.out.println("Sto insegnando " + materia);
    }
}
