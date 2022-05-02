package Tema1.misClases;

public class Persona{
    String nombre;
    String color_ojos;
    String color_cabello;
    float estatura;
    float peso;
    int edad;
    String nacionalidad;

    public Persona(){
        System.out.println("Construyendo una persona");
    }

    public void reir(){
        System.out.println("JAJAJA");
    }

    public void caminar(){
        System.out.println("Caminando");
    }

    public void correr(){
        System.out.println("Corriendo");
    }

    public void agacharse(){
        System.out.println("Agachado");
    }

    public void comer(String comida){
        System.out.println("Comiendo"+comida);
    }

    public void respirar(){
        System.out.println("Respirando");
    }
}