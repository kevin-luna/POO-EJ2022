package Tema2;

import java.util.Scanner;

public class TestNegativeNumberException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        try{
            n = leeNumero(input);
        }catch (NegativeNumberException e){
            System.out.println("No se pueden leer números negativos.");
            //(e.printStackTrace();
        }
    }

    public static int leeNumero(Scanner input) throws NegativeNumberException{

        int n = input.nextInt();
        if(n<0) throw new NegativeNumberException("Se intentó leer un número negativo");
        return n;
    }
}
