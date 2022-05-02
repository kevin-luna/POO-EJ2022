package Tema1;

public class Telefono{
    String tipo;
    float resolucion;
    String modelo;

    public Telefono(){
        System.out.println("Construyendo un teléfono");
    }

    public int llamar(int numero){
        System.out.println("llamando al número "+numero);
        return 0;
    }

    public String enviarMensaje(String mensaje){
        return "";
    }

    public void colgar(){

    }
}