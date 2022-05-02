package Tema1.misClases;

public class Termo{
    float alto;
    float largo;
    float ancho;
    String color;
    String material;
    float capacidad_max;
    float nivel;

    public Termo(){
        System.out.println("Construyendo un Termo");
    }

    public void abrir_tapa(){
        System.out.println("Tapa abierta");
    }

    public void cerrar_tapa(){
        System.out.println("Tapa cerrada");
    }

    public float llenar(float ml){
        nivel += ml;
        return nivel;
    }

    public float vaciar(float ml){
        nivel -= ml;
        return nivel;
    }
}