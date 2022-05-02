package Tema2;

public class EspadaTierra extends Espada{

    public EspadaTierra(String nombre, int damage) {
        super(nombre, damage, 1);
    }

    @Override
    int recibirDamage(int d){
        this.usos=0;
        return 1;
    }
}
