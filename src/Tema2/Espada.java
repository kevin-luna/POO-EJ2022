package Tema2;

public class Espada {
    protected int damage;
    protected int usos;
    protected String nombre;

    public Espada(String nombre,int damage, int usos) {
        this.nombre = nombre;
        this.damage = damage;
        this.usos = usos;
    }

    void atacar(Espada e){
        if(this.getUsos()>0){
            this.usos-=1;
            System.out.println("a "+this.nombre+" le quedan "+this.usos+" usos después de atacar");
            e.recibirDamage(this.damage);
        }
    }

    int recibirDamage(int d){
        if(d<=this.usos){
            this.usos -=d;
            System.out.println("a "+this.nombre+" le quedan "+this.usos+" usos después de ser atacada");
            return 1;
        }else return -1;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setUsos(int usos) {
        this.usos = usos;
    }

    public int getDamage() {
        return damage;
    }

    public int getUsos() {
        return usos;
    }
}
