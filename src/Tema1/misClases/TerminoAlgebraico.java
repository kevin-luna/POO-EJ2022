package Tema1.misClases;

public class TerminoAlgebraico{
    boolean signo;
    float coeficiente;
    float variable;
    int exponente;
    float valor;

    public TerminoAlgebraico(){
        System.out.println("Construyendo un término algebráico");
    }

    public float sumar(float sumando){
        return valor+sumando;
    }

    public float resta(float sustraendo){
        return  valor-sustraendo;
    }

    public float multiplicar(float factor){
        return  valor*factor;
    }

    public float dividir(float divisor){
        return valor/divisor;
    }
}