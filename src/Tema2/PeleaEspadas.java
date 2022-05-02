package Tema2;

public class PeleaEspadas {
    public static void main(String[] args) {
        Espada espadaHierro = new Espada("Espada de Hierro",5,20);
        Espada espadaDiamante = new Espada("Espada de Diamante",8,60);

        while(espadaHierro.getUsos()>0 && espadaDiamante.getUsos()>0){
            espadaHierro.atacar(espadaDiamante);
        }

        if(espadaDiamante.getUsos()>0) System.out.println("La espada de hierro se rompió primero");
        else System.out.println("La espada de diamante murio primero");
    }
}
