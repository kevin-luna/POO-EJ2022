package Tema2;

public class AnimalSalvaje extends Animal{
    String ecosistema;
    boolean peligroDeExtincion;

    public AnimalSalvaje(String especie, String tipoAlimentacion,String ecosistema, boolean peligroDeExtincion) {
        super(especie,tipoAlimentacion);
        this.ecosistema = ecosistema;
        this.peligroDeExtincion = peligroDeExtincion;
    }

    void conseguirAlimento(){
        System.out.println("Buscando comida...");
    }

    void pelearTerritorio(){
        System.out.println("Peleando territorio");
    }

    public void setEcosistema(String ecosistema) {
        this.ecosistema = ecosistema;
    }

    public void setPeligroDeExtincion(boolean peligroDeExtincion) {
        this.peligroDeExtincion = peligroDeExtincion;
    }

    public String getEcosistema() {
        return ecosistema;
    }

    public boolean isPeligroDeExtincion() {
        return peligroDeExtincion;
    }
}
