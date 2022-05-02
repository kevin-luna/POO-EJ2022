package Tema2;

public class EspadaDefinitiva extends Espada{

    public EspadaDefinitiva(String nombre, int damage) {
        super(nombre, damage,1000000);
    }

    @Override
    int recibirDamage(int d){
        this.usos-=0;
        return 1;
    }
}
