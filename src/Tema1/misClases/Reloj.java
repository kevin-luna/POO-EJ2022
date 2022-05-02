package Tema1.misClases;

public class Reloj{
    String fabricante;
    String modelo;
    String material;
    String tipo;
    String alimentacion;
    boolean resistencia_agua;
    String formato_hora;
    int hora_actual;

    public Reloj(){
        System.out.println("Construyendo un reloj");
    }

    public int mostrar_hora(){
        return hora_actual;
    }

    public void ajustar_hora(int hora,int minutos){
        System.out.println("Ahora son las "+hora+":"+minutos);
    }

    public void encender_iluminacion(){
        System.out.println("Brillando");
    }

    public void programar_alarma(int hora,int minutos){
        System.out.println("Alarma programada para las "+hora+" con "+minutos+" minutos ");
    }

    public void cronometro(){
        System.out.println("Cronometro iniciado");
    }

}