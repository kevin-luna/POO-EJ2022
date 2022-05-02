package Tema1;

public class CuerpoCeleste {
    private String tipo;
    private String nombre;
    private CuerpoCeleste orbital;

    public CuerpoCeleste(String tipo,String nombre){
        this.tipo=tipo;
        this.nombre=nombre;
    }

    public CuerpoCeleste(String tipo,String nombre,CuerpoCeleste orbital){
        this.tipo = tipo;
        this.nombre = nombre;
        this.orbital = orbital;
    }

    public String getOrbital() {
        if(this.orbital==null) return null;
        return orbital.getNombre();
    }

    public String getNombre() {
        return nombre;
    }
}
