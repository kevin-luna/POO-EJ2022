package com.itver;

import Tema1.TarjetaDebito;

public class Tarjetas {
    public static void main(String[] args) {
        TarjetaDebito tarjeta1 = new TarjetaDebito();
        tarjeta1.setNumero("236709878");
        tarjeta1.setBanco("BBVA");
        tarjeta1.setNombreTitular("KEVIN ALEJANDRO GUTIERREZ LUNA");
        tarjeta1.setFechaCaducidad("04/25");
        tarjeta1.setLimite(10000);
        tarjeta1.setSaldoActual(500);

        System.out.println("Tienes "+tarjeta1.getSaldoActual()+" pesos en tu tarjeta.");

        double retiro = 700;
        if(tarjeta1.retirar(retiro)!=-1){
            System.out.println("Quedan "+tarjeta1.getSaldoActual()+" pesos en la tarjeta.");
        }else{
            System.out.println("No puedes retirar más dinero del que tienes.");
        }

        double transferencia=100;
        String cuentaObjetivo = "898901";
        if(tarjeta1.transferir(transferencia,cuentaObjetivo)!=-1){
            System.out.println("Se ha transferido "+transferencia+" a la cuenta "+cuentaObjetivo+" de forma exitosa");
        }else{
            System.out.println("No puedes transferir más dinero del que tienes");
        }
    }
}
