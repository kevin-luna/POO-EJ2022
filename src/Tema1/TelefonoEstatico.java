package Tema1;

public class TelefonoEstatico {
    private int serie;
    public static int consecutivo = 0;

    public TelefonoEstatico(){
        this.serie=consecutivo+1;
        consecutivo=consecutivo+1;
    }

    public int getSerie(){
        return this.serie;
    }

    public void imprimeConsecutivo(){
        System.out.println(consecutivo);
    }

    public static int getConsecutivo(){
        return consecutivo;
    }
}
