public class Utente {
    private String username;
    private String password;

    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login() {
        System.out.println("Login effettuato con successo!");
    }
}