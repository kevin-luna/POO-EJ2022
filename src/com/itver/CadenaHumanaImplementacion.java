package com.itver;

import Tema1.CadenaHumana;
import Tema1.NodoPersona;

public class CadenaHumanaImplementacion {
    public static void main(String[] args) {
        NodoPersona luis = new NodoPersona("Luis Felipe");
        NodoPersona mario = new NodoPersona("Mario Alfredo");
        NodoPersona jorge = new NodoPersona("Jorge Angel",luis,mario);

        mario.setAdelante(jorge);
        luis.setAtras(jorge);

        System.out.println(jorge.getNombre()+" tiene a la izquierda a "+jorge.getAtras().getNombre());
        System.out.println(jorge.getNombre()+" tiene a la derecha a "+jorge.getAdelante().getNombre());

        System.out.println(luis.getNombre()+" tiene a la izquierda a "+luis.getAtras().getNombre());
        if(luis.getAdelante()==null) System.out.println(luis.getNombre()+" no tiene a nadie a su derecha");

        jorge.setAdelante(null);
        jorge.setAtras(null);

        //Implementación con la clase CadenaHumana

        CadenaHumana cadena = new CadenaHumana();
        cadena.formarAlFinal(luis);
        cadena.formarAlFinal(mario);
        cadena.formarAlFinal(jorge);

        System.out.println("Hay "+cadena.getNumeroPersonas()+" personas en la cadena");

        System.out.println("---Recorrido de inicio a fin---");
        cadena.mostrarCadenaInicioFin();
        //System.out.println("---Recorrido de fin a inicio---");
        //cadena.mostrarCadenaFinInicio();
        System.out.println();

        System.out.println("---NUEVA FILA CON EL COLADO---");
        NodoPersona abraham = new NodoPersona("Abraham");
        cadena.formarAtrasDe(abraham,mario);
        cadena.mostrarCadenaInicioFin();
    }
}
