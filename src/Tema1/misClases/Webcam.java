package Tema1.misClases;

public class Webcam{
    int resolucion;
    float peso;
    int canales;
    String colores;

    public Webcam(){
        System.out.println("Construyendo una webcam");
    }

    public void grabar(){
        System.out.println("Grabando!");
    }

    public void fotografiar(){
        System.out.println("Fotografía capturada");
    }

    public void escanear(){
        System.out.println("Escaneando...");
    }
}