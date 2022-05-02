package com.itver;

import Tema1.CuerpoCeleste;

public class SistemaSolar {
    public static void main(String[] args) {
        CuerpoCeleste sol = new CuerpoCeleste("Estrella","Sol");
        CuerpoCeleste tierra = new CuerpoCeleste("Planeta","Tierra",sol);
        CuerpoCeleste luna = new CuerpoCeleste("Satelite","Luna",tierra);

        CuerpoCeleste saturno = new CuerpoCeleste("Planeta","Saturno",sol);
        CuerpoCeleste titan = new CuerpoCeleste("Satelite","Titan",saturno);

        if(sol.getOrbital()==null) System.out.println(sol.getNombre()+" no orbita a ningún cuerpo");
        System.out.println(tierra.getNombre()+" orbita a "+tierra.getOrbital());
        System.out.println(luna.getNombre()+" orbita a "+luna.getOrbital());

        System.out.println(saturno.getNombre()+" orbita a "+saturno.getOrbital());
        System.out.println(titan.getNombre()+" orbita a "+titan.getOrbital());
    }
}
