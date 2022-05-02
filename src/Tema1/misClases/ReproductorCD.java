package Tema1.misClases;

public class ReproductorCD{
    int numero_discos;
    String salidas;
    String fabricante;
    String modelo;
    int volumen_max;
    int volumen_actual;

    public ReproductorCD(){
        System.out.println("Construyendo un reproductor de CD");
    }

    public void encender(){
        System.out.println("Encendido");
    }

    public void apagar(){
        System.out.println("Apagado");
    }

    public boolean reproducir(int numero_disco){
        System.out.println("Reproduciendo el disco "+numero_disco);
        return true;
    }

    public void pausar(){
        System.out.println("Reproducción pausada");
    }

    public void detener(){
        System.out.println("Reproducción detenida");
    }

    public int subir_volumen(int v){
        return volumen_actual+=v;
    }

    public int bajar_volumen(int v){
        return volumen_actual-=v;
    }

    public void abrir_bandeja(){
        System.out.println("La bandeja está abierta");
    }

    public void cerrar_bandeja(){
        System.out.println("La bandeja está abierta");
    }
}