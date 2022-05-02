package Tema1;

public class Persona2 {
    String nombre;
    String apellido;
    double talla;
    int edad;
    double peso;
    String colorOjos;
    String tez;

    public Persona2(){
        edad=0;
    }

    public Persona2(double nuevaTalla,double nuevoPeso){
        edad=0;
        talla=nuevaTalla;
        peso=nuevoPeso;
    }

    public Persona2(String nombre,String apellidos,int edad){
        this.nombre=nombre;
        this.apellido=apellidos;
        this.edad=edad;
    }

    public void imprimeEstado(){
        System.out.println("Los datos del objeto son:");
        System.out.println("=========================");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Talla: "+talla);
        System.out.println("Edad: "+edad);
        System.out.println("Peso: "+peso);
        System.out.println("Color de ojos: "+colorOjos);
        System.out.println("Color de piel: "+tez);
    }
}
