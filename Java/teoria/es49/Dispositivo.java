public class Dispositivo {
    private String marca;
    private String modello;

    public Dispositivo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public void descrivi() {
        System.out.println("Sono un dispositivo generico.");
    }
}