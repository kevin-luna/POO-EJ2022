package Tema2;

public class Profesor {
    private String nombre;
    private String categoria;
    private int id;

    public Profesor(){

    }

    public Profesor(String nombre,String categoria,int id){
        this.nombre = nombre;
        this.categoria=categoria;
        this.id=id;
    }

    public String obtenerDatos(){
        String data="Nombre: "+this.nombre+",\nCategoria: "+this.categoria+",\nId: "+this.id;
        return data;
    }
}
