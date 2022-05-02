package Tema2;

public class AnimalDomestico extends Animal{
    String nombre;
    boolean vacunado;

    public AnimalDomestico(String especie,String tipoAlimentacion,String nombre, boolean vacunado) {
        super(especie,tipoAlimentacion);
        this.nombre = nombre;
        this.vacunado = vacunado;
    }

    void jugar(){
        System.out.println(nombre+" está jugando con su juguete");
    }

    void molestarVisitas(){
        System.out.println(nombre+" está molestando a las visitas");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isVacunado() {
        return vacunado;
    }
}
