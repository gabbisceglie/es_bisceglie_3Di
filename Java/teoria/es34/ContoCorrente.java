
public class ContoCorrente {
    
    //attributo privato
    private double saldo;

    public void versa(double importo) {
        saldo += importo;
    }

    public void preleva(double importo) {
        saldo -= importo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void stampaSaldo() {
        System.out.println("Saldo attuale: " + saldo);
    }
}
