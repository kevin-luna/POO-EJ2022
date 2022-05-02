package Tema1;

public class Computadora {

    String marca;
    String modelo;
    String procesador;
    int cantidadRAM;
    int cantidadAlmacenamiento;
    boolean unidadOptica;
    boolean TPM;
    double consumo;

    //Todo
    public Computadora(String marca, String modelo, String procesador, int cantidadRAM, int cantidadAlmacenamiento, boolean unidadOptica, boolean TPM, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.cantidadRAM = cantidadRAM;
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
        this.unidadOptica = unidadOptica;
        this.TPM = TPM;
        this.consumo = consumo;
    }
    //Sin fabricante (armada) y con unidad optica
    public Computadora(String procesador, int cantidadRAM, int cantidadAlmacenamiento, boolean unidadOptica, boolean TPM, double consumo) {
        this.procesador = procesador;
        this.cantidadRAM = cantidadRAM;
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
        this.unidadOptica = unidadOptica;
        this.TPM = TPM;
        this.consumo = consumo;
    }
    //Con fabricante y sin unidad optica
    public Computadora(String marca, String modelo, String procesador, int cantidadRAM, int cantidadAlmacenamiento, boolean TPM, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.cantidadRAM = cantidadRAM;
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
        this.TPM = TPM;
        this.consumo = consumo;
    }
    //Sin fabricante y sin unidad optica
    public Computadora(String procesador, int cantidadRAM, int cantidadAlmacenamiento, boolean TPM, double consumo) {
        this.procesador = procesador;
        this.cantidadRAM = cantidadRAM;
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
        this.TPM = TPM;
        this.consumo = consumo;
    }
    //Sin consumo
    public Computadora(String marca, String modelo, String procesador, int cantidadRAM, int cantidadAlmacenamiento, boolean TPM) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.cantidadRAM = cantidadRAM;
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
        this.TPM = TPM;
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setCantidadRAM(int cantidadRAM) {
        this.cantidadRAM = cantidadRAM;
    }

    public void setCantidadAlmacenamiento(int cantidadAlmacenamiento) {
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
    }

    public void setUnidadOptica(boolean unidadOptica) {
        this.unidadOptica = unidadOptica;
    }

    public void setTPM(boolean TPM) {
        this.TPM = TPM;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getCantidadRAM() {
        return cantidadRAM;
    }

    public int getCantidadAlmacenamiento() {
        return cantidadAlmacenamiento;
    }

    public boolean tieneUnidadOptica() {
        return unidadOptica;
    }

    public boolean tieneTPM() {
        return TPM;
    }

    public double getConsumo() {
        return consumo;
    }


}
