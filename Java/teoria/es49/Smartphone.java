public class Smartphone extends Dispositivo {
    private long numeroTelefono;

    public Smartphone(String marca, String modello, long numeroTelefono) {
        super(marca, modello);
        this.numeroTelefono = numeroTelefono;
    }

    public void chiama() {
        System.out.println("Sto effettuando una chiamata dal numero: " + numeroTelefono);
    }
}