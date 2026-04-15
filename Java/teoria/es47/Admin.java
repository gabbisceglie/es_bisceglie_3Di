public class Admin extends Utente {

    //costruttore per creare un nuovo admin
    public Admin(String username, String password) {
        super(username, password);
    }

    public void gestisciSistema() {
        System.out.println("Gestione del sistema in corso...");
    }
}