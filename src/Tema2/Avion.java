package Tema2;

public class Avion extends VehiculoAereo{

    public Avion(String nombreVehiculo, String nombreAereo) {
        super(nombreVehiculo, nombreAereo);
    }

    public void bajarTrenAterrizaje(){
        System.out.println("Bajando tren de aterrizaje...");
    }

    @Override
    public void volar(){
        System.out.println("Vuela gracias a sus alas y un par de turbinas.");
    }
}
