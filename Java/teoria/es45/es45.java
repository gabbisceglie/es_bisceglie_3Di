public class es45 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Il nome della rosa", "Umberto Eco");
        Libro libro2 = new Libro("1984", "George Orwell");
        Libro libro3 = new Libro("Il piccolo principe", "Antoine de Saint-Exupery");

        biblioteca.aggiungiLibro(libro1);
        biblioteca.aggiungiLibro(libro2);
        biblioteca.aggiungiLibro(libro3);

        biblioteca.stampaNLibri();

        biblioteca.rimuoviLibro();

        biblioteca.stampaNLibri();
    }
}