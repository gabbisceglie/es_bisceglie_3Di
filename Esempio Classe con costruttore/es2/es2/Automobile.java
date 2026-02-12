package es2;
public class Automobile {
    
    //ATTRIBUTI (O VARIABILI DI ISTANZA):
    private String marca;
    private String modello;
    private int kilometri;
    private int kilowatt;
    private int cavalli;
    private String colore;
    private String alimentazionePrimaria;
    private boolean elettrica;
    private int anno;
    private int mese;
    private double prezzo;
    private String paese;

    //COSTRUTTORE (NON VUOTO):
    public Automobile(String marca, String modello, int kilometri, int kilowatt, int cavalli, String colore, String alimentazionePrimaria, boolean elettrica, int anno, int mese, double prezzo, String paese) {
        this.marca = marca;
        this.modello = modello;
        this.kilometri = kilometri;
        this.kilowatt = kilowatt;
        this.cavalli = cavalli;
        this.colore = colore;
        this.alimentazionePrimaria = alimentazionePrimaria;
        this.elettrica = elettrica;
        this.anno = anno;
        this.mese = mese;
        this.prezzo = prezzo;
        this.paese = paese;
    }

    //COSTRUTTORE (VUOTO):
    public Automobile(){}
    
    //GETTER E SETTER:
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getKilometri() {
        return kilometri;
    }

    public void setKilometri(int kilometri) {
        this.kilometri = kilometri;
    }

    public int getKilowatt() {
        return kilowatt;
    }

    public void setKilowatt(int kilowatt) {
        this.kilowatt = kilowatt;
    }

    public int getCavalli() {
        return cavalli;
    }

    public void setCavalli(int cavalli) {
        this.cavalli = cavalli;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getAlimentazionePrimaria() {
        return alimentazionePrimaria;
    }

    public void setAlimentazionePrimaria(String alimentazionePrimaria) {
        this.alimentazionePrimaria = alimentazionePrimaria;
    }

    public boolean isElettrica() {
        return elettrica;
    }

    public void setElettrica(boolean elettrica) {
        this.elettrica = elettrica;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getMese() {
        return mese;
    }

    public void setMese(int mese) {
        this.mese = mese;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getPaese() {
        return paese;
    }

    public void setPaese(String paese) {
        this.paese = paese;
    }
    
    
}