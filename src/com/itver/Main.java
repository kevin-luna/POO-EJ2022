package com.itver;
import Tema1.misClases.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Crear un objeto o instanciamiento
        //Telefono telefono1; //esto aun no es un instanciamiento
        //telefono1 = new Telefono();//esto si es un instanciamiento
        //Telefono telefono2 = new Telefono();

        //telefono1.llamar(123);
        Calculadora casio = new Calculadora();
        casio.calcular_raiz(2);

        DiscoDuro seagate = new DiscoDuro();
        seagate.escribir((byte) 250);

        Impresora canon = new Impresora();
        canon.autolimpieza_cabezales();

        Perro firulais = new Perro();
        firulais.ladrar();

        Reloj timex = new Reloj();
        timex.ajustar_hora(2,40);

        ReproductorCD sony = new ReproductorCD();
        sony.reproducir(5);

        Termo tupperware = new Termo();
        tupperware.abrir_tapa();

        Webcam logitech = new Webcam();
        logitech.grabar();

        Persona persona = new Persona();
        persona.correr();
    }
}
