package Tema1.misClases;

public class DiscoDuro{
    float almacenamiento;
    int rpm;
    String fabricante;
    String modelo;
    String numero_serie;

    public DiscoDuro(){
        System.out.println("Construyendo un disco duro");
    }

    public void encender(){
        System.out.println("Encendido");
    }

    public void apagar() {
        System.out.println("Apagado");
    }

    public void leer(byte dato){
        System.out.println("Leyendo datos...");
    }

    public void escribir(byte dato){
        System.out.println("Escribiendo datos...");
    }

    public boolean autopruebaSMART(){
        System.out.println("Ejecutando prueba...");
        return true;
    }
}