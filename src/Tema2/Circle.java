package Tema2;

public class Circle extends Shape{
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    //Polimorfismo de comportamiento
    @Override
    public double calculateArea(){
        this.area=Math.PI*radio*radio;
        return this.area;
    }

    @Override
    public void display(){
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println(" *** ");
    }
}
