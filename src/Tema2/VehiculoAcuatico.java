package Tema2;

public abstract class VehiculoAcuatico extends Vehiculo{
    protected  String nombreAcuatico;

    public VehiculoAcuatico(String nombreVehiculo, String nombreAcuatico) {
        super(nombreVehiculo);
        this.nombreAcuatico = nombreAcuatico;
    }

    @Override
    public void transportar(){
        System.out.println("Se desplaza sobre el agua.");
    }
    protected abstract void navegar();
}
