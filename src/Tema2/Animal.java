package Tema2;

public class Animal {
    private String especie;
    private String tipoAlimentacion;

    public Animal(String especie, String tipoAlimentacion) {
        this.especie = especie;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    void comer(String alimento){
        System.out.println("El "+especie+" está comiendo "+alimento);
    }

    void caminar(){
        System.out.println("Caminando...");
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getEspecie() {
        return especie;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }
}
