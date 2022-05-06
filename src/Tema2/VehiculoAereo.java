package Tema2;

public abstract class VehiculoAereo extends Vehiculo{
    String nombreAereo;

    public VehiculoAereo(String nombreVehiculo, String nombreAereo) {
        super(nombreVehiculo);
        this.nombreAereo = nombreAereo;
    }

    @Override
    public void transportar(){
        System.out.println("Se desplaza en el aire.");
    }

    protected abstract void volar();
}
