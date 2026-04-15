public class Main {
    public static void main(String[] args) {
        Studente studente = new Studente("Mario", "Rossi", "5A");
        Docente docente = new Docente("Gianni", "Gianni", "Matematica");

        studente.presentati();
        studente.studia();

        docente.presentati();
        docente.insegna();
    }
}
