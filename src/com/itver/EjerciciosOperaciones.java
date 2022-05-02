package com.itver;

import Tema1.Operaciones;

import java.util.Scanner;

public class EjerciciosOperaciones {
    public static void main(String[] args) {
        //Operaciones operaciones = new Operaciones();
        Scanner entrada = new Scanner(System.in);
        int valor1,valor2;

        valor1=entrada.nextInt();
        valor2=entrada.nextInt();


        int resultado = Operaciones.suma(valor1,valor2);

        System.out.println(resultado);

        //Operaciones operaciones1 = new Operaciones();
        int res2 = Operaciones.multiplicar(valor1,valor2);
        int res3 = Operaciones.multiplicar(valor1,valor2);
        System.out.println(res2);
        System.out.println(res3);
    }
}
