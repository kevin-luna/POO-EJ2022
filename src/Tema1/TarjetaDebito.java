package Tema1;

public class TarjetaDebito {
    private String numero;
    private double saldoActual;
    private String nombreTitular;
    private String banco;
    private String fechaCaducidad;
    private double limite;

    public TarjetaDebito(){
        System.out.println("Construyendo una tarjeta de débito");
    }

    public double depositar(double cantidad){
        if(cantidad<=limite){
            saldoActual+=cantidad;
            return saldoActual;
        }else return -1;
    }

    public double retirar(double cantidad){
        if(cantidad<=saldoActual){
            saldoActual-=cantidad;
            return saldoActual;
        }else return -1;

    }

    public double transferir(double cantidad,String cuenta){

        if(cantidad<=saldoActual){
            saldoActual-=cantidad;
            return saldoActual;
        }else return -1;

    }

    public void setNumero(String nuevoNumero){
        numero=nuevoNumero;
    }

    public double setSaldoActual(double nuevoSaldo) {
        if(nuevoSaldo<=limite){
            saldoActual = nuevoSaldo;
            return saldoActual;
        }
        else return -1;

    }

    public void setNombreTitular(String nuevoTitular) {
        nombreTitular = nuevoTitular;
    }

    public void setBanco(String nuevoBanco) {
        banco = nuevoBanco;
    }

    public void setFechaCaducidad(String nuevaFechaCaducidad) {
        fechaCaducidad = nuevaFechaCaducidad;
    }

    public void setLimite(double nuevoLimite) {
        limite = nuevoLimite;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getBanco() {
        return banco;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
}
