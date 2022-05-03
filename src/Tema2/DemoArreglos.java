package Tema2;

public class DemoArreglos {
    public static void main(String[] args) {
        Object numeros[]=new Object[20];
        numeros[0]=20;
        numeros[1]=10.5;

        Profesor maestros[]=new Profesor[10];

        ProfesorAsignatura pepe = new ProfesorAsignatura("José Sánchez","Tipo C",126,"Programacion Orientada a Objetos",20);
        ProfesorAsignatura maria = new ProfesorAsignatura("Maria Hernandez","Tipo A",57,"Fundamentos de Programación",12);
        Profesor profe = new Profesor("Felipe Quevedo","Tipo B",78);

        //POLIMORFISMO DE CLASE
        maestros[0]=profe;
        maestros[1]=pepe;
        maestros[2]=maria;
    }
}
