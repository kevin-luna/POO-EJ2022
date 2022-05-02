package Tema1.misClases;

public class Calculadora{
    String marca;
    String modelo;
    String alimentacion;

    public Calculadora(){
        System.out.println("Construyendo una calculadora");
    }

    public void encender(){
        System.out.println("Teléfono encendido");
    }

    public void apagar(){
        System.out.println("Teléfono apagado");
    }

    public float calcular_raiz(float numero){
        return (float) Math.sqrt(numero);
    }

    public float calcular_log(float numero){
        return (float) Math.log(numero);
    }


}