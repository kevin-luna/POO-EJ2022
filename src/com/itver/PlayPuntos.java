package com.itver;

import Tema1.Punto;

public class PlayPuntos {
    public static void main(String[] args) {
        Punto ivan = new Punto(10,20);
        Punto jorge = new Punto(20,40);
        Punto arath = new Punto(5,10);

        double resultado = 0.0;
        resultado = ivan.distancia(jorge);
        System.out.println(resultado);
    }
}
