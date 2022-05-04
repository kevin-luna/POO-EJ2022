package Tema2;

public class ShapesImplementation {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,4);
        System.out.println("El area del rectangulo es: "+r1.calculateArea());
        r1.display();

        Circle c1 = new Circle(9);
        System.out.println("El area del circulo es:"+c1.calculateArea());
        c1.display();

        Triangle t1 = new Triangle(5,7);
        System.out.println("El area del triangulo es: "+t1.calculateArea());
        t1.display();
    }
}
