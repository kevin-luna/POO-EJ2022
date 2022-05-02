package com.itver;

import Tema1.Palmera;

public class Cocoteros {
    public static void main(String[] args) {
        Palmera palmerita = new Palmera();

        palmerita.setAltura(5);
        palmerita.setCantidadCocos(25);
        palmerita.setColorHojas("Azul");

        double nuevaAltura = palmerita.crecer(1);

        System.out.println("La altura de la palmera es: "+nuevaAltura);

        if(palmerita.darFrutos(35)!=-1)
            System.out.println("Quedan "+palmerita.getcantidadCocos());
        else
            System.out.println("Posiblemente quieres más cocos de los que hay");
    }
}
