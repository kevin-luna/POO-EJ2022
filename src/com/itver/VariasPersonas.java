package com.itver;

import Tema1.Persona2;

public class VariasPersonas {
    public static void main(String[] args) {
        Persona2 p1 = new Persona2();
        p1.imprimeEstado();

        Persona2 p2 = new Persona2(1.75,85.5);
        p2.imprimeEstado();
    }
}
