package Tema2;

public class DemoHerenciaAnimal {
    public static void main(String[] args) {
        Animal iguana = new Animal("Iguana","Hervíboro");
        iguana.comer("hojas");

        AnimalSalvaje leon = new AnimalSalvaje("León","Carnívoro","Sabana",true);
        leon.comer("antílope");
        leon.pelearTerritorio();

        AnimalDomestico perro = new AnimalDomestico("Loro","Hervíboro","Pancho",true);
        perro.caminar();
        perro.molestarVisitas();
    }
}
