public class Computer extends Dispositivo {
    private String Os;

    public Computer(String marca, String modello, String os) {
        super(marca, modello);
        this.Os = os;
    }

    @Override
    public void descrivi() {
        System.out.println("Sono un computer");
    }

    public void accendi() {
        System.out.println("Il computer si sta avviando");
    }
}