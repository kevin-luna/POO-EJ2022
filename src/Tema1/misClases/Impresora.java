package Tema1.misClases;

public class Impresora{
    String fabricante;
    String modelo;
    int resolucion_maxima;
    String numero_serie;
    String sistema_tinta;

    public Impresora(){
        System.out.println("Construyendo una impresora");
    }

    public void encender(){
        System.out.println("Encendido");
    }

    public void apagar() {
        System.out.println("Apagado");
    }

    public boolean imprimir(String ruta_documento){
        System.out.println("Imprimiendo...");
        return true;
    }

    public boolean escanear(String ruta_guardado){
        System.out.println("Escaneando");
        return true;
    }

    public boolean fotocopiar(){
        System.out.println("Copiando...");
        return true;
    }

    public void autolimpieza_cabezales(){
        System.out.println("Limpiando cabezales");
    }
}