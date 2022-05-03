package Tema2;

public class ProfesorAsignatura extends Profesor{
    private String asignatura;
    private int horas;

    public ProfesorAsignatura(){
        super();
    }

    public ProfesorAsignatura(String nombre,String categoria,int id,String asignatura,int horas){
        super(nombre,categoria,id);
        this.asignatura=asignatura;
        this.horas=horas;
    }

    /*
    Sobreescritura de métodos o comportamientos
    Redefinición de métodos o comportamientos

     */
    @Override
    public String obtenerDatos(){
        String data = super.obtenerDatos()+",\nAsignatura: "+this.asignatura+",\nHoras: "+this.horas;
        return data;
    }
}
