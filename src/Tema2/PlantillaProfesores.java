package Tema2;

import javax.swing.*;

public class PlantillaProfesores {
    public static void main(String[] args) {
        ProfesorAsignatura pepe = new ProfesorAsignatura("José Sánchez","Tipo C",126,"Programacion Orientada a Objetos",20);
        ProfesorAsignatura maria = new ProfesorAsignatura("Maria Hernandez","Tipo A",57,"Fundamentos de Programación",12);

        //POLIMORFISMO de comportamiento: Habilidad de adaptar el comportamiento de diferentes tipos de objetos
        Profesor profe = new Profesor("Felipe Quevedo","Tipo B",78);
        System.out.println(profe.obtenerDatos());
        System.out.println("=============================================");
        System.out.println(pepe.obtenerDatos());
        System.out.println(maria.obtenerDatos());
    }
}
