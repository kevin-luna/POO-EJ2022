package Tema2;

public class PeleaEspadas {
    public static void main(String[] args) {
        Espada e1 = new Espada("Espada de Hierro",5,20);
        Espada e2 = new Espada("Espada de Diamante",8,60);
        EspadaTierra e3 = new EspadaTierra("Espada de tierra",5);
        EspadaDefinitiva e4 = new EspadaDefinitiva("Espada infinita",10);

        System.out.println("=====Pelea 1=====");

        while(e2.getUsos()>0 && e4.getUsos()>0){
            e2.atacar(e4);
        }

        if(e4.getUsos()>0) System.out.println("La "+e2.nombre+" se rompió primero");
        else System.out.println("La "+e4.nombre+"se rompió primero");

        System.out.println("=====Pelea 2=====");

        while(e1.getUsos()>0 && e3.getUsos()>0){
            e1.atacar(e3);
        }

        if(e3.getUsos()>0) System.out.println("La "+e1.nombre+" se rompió primero");
        else System.out.println("La "+e3.nombre+"se rompió primero");
    }
}
