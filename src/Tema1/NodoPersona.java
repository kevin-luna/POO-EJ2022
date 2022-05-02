package Tema1;

public class NodoPersona {
    private String nombre;
    private NodoPersona adelante;
    private NodoPersona atras;

    public NodoPersona(String nombre){
        this.nombre = nombre;
    }
    public NodoPersona(String nombre, NodoPersona adelante, NodoPersona atras){
        this.nombre=nombre;
        this.adelante = adelante;
        this.atras = atras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAdelante(NodoPersona p){
        this.adelante = p;
    }

    public void setAtras(NodoPersona p){
        this.atras = p;
    }

    public NodoPersona getAdelante() {
        return adelante;
    }

    public NodoPersona getAtras(){
        return atras;
    }
}
