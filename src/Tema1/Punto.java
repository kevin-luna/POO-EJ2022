package Tema1;

public class Punto {
    public int x;
    public int y;
    public String color;

    public Punto(int x,int y){
        this.x = x;
        this.y = y;
    }

    public double distancia(Punto p){
        double d = 0.0;
        d = Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
        return d;
    }
}
