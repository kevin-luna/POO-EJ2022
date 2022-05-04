package Tema2;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //Polimorfismo de comportamiento

    @Override
    public double calculateArea(){
        this.area=(base*height)/2;
        return this.area;
    }

    @Override
    public void display(){
        int points = 1;
        for (int i=0;i<height;i++){
            for (int j=0;j<points;j++){
                System.out.print("*");
            }
            System.out.println("\n");
            points++;
        }
    }
}
