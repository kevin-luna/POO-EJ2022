package Tema2;

public class Rectangle extends Shape{
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //Polimorfismo de comportamiento
    @Override
    public double calculateArea(){
        this.area=base*height;
        return this.area;
    }

    @Override
    public void display(){
        for (int i=0;i<height;i++){
            for (int j=0;j<base;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
