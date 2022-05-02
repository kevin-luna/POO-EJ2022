package Tema1;

public class Palmera {
    private double altura;
    private String colorHojas;
    private int cantidadCocos;

    //Aplicar encapsulamiento
    //1) Hacer privados sus atributos
    //2) Proporcionar modificadores de acceso
    //

    public Palmera(){
        System.out.println("Construyendo una palmera");
    }

    public void setAltura(double nuevoValor){
        altura=nuevoValor;
    }

    public void setColorHojas(String nuevoValor){
        colorHojas=nuevoValor;
    }

    public void setCantidadCocos(int nuevaCantidadCocos){
        cantidadCocos=nuevaCantidadCocos;
    }

    //getters

    public double getAltura(){
        return altura;
    }

    public String getColorHojas(){
        return colorHojas;
    }

    public int getcantidadCocos(){
        return cantidadCocos;
    }

    public double crecer(double incremento){
        altura+=incremento;
        return altura;
    }

    public int darFrutos(int cantidad){
        if(cantidad<=cantidadCocos){
            cantidadCocos-=cantidad;
            return cantidadCocos;
        }
        else
            return -1;
    }
}
