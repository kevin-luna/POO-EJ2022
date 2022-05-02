package Tema1.misClases;

public class Perro{
    String nombre;
    String raza;
    String color_pelo;
    String patron_pelo;
    float peso;
    int edad;

    public Perro(){
        System.out.println("Construyendo un perro");
    }

    public void ladrar(){
        System.out.println("Wof wof!");
    }

    public void comer(String alimento){
        System.out.println("Comiendo "+alimento);
    }

    public void dormir(){
        System.out.println("Zzzzz...");
    }

    public void jugar(String juguete){
        System.out.println("Jugando");
    }

    public void saltar(){
        System.out.println("Saltando");
    }
}