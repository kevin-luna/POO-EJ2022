package Tema1;

public class DemoClaseEstatica {
    public static void main(String[] args) {
        TelefonoEstatico t1 = new TelefonoEstatico();
        TelefonoEstatico t2 = new TelefonoEstatico();
        TelefonoEstatico t3 = new TelefonoEstatico();

        System.out.println(t2.getSerie());
        System.out.println(t3.getSerie());
        System.out.println(t1.getSerie());

        t1.imprimeConsecutivo();
        t2.imprimeConsecutivo();
        t3.imprimeConsecutivo();

        System.out.println(t1.getConsecutivo());
        System.out.println(TelefonoEstatico.getConsecutivo());
    }

}
