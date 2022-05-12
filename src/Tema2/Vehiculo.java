package Tema2;

public abstract class Vehiculo {
    public String nombreVehiculo;

    public Vehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public abstract void transportar();
}
