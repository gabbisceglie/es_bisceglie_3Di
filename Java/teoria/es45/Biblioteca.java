public class Biblioteca {
    private int NLibri=0;
    private Libro[] libri;
    
    public Biblioteca() {
        libri = new Libro[100]; // Inizializza l'array con una capacità di 100 libri
    }

    public void aggiungiLibro(Libro libro) {
        if (NLibri < libri.length) {
            libri[NLibri] = libro;
            NLibri++;
        }
    }

    public void rimuoviLibro() {
        if (NLibri > 0) {
            NLibri--;
            libri[NLibri] = null; // Rimuove l'ultimo libro aggiunto
        } else {
            System.out.println("Non ci sono libri da rimuovere.");
        }
    }

    public void stampaNLibri() {
        System.out.println("Numero di libri: " + NLibri);
    }
}