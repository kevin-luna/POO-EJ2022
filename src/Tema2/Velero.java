package Tema2;

public class Velero extends VehiculoAcuatico{
    public Velero(String nombreVehiculo, String nombreAcuatico) {
        super(nombreVehiculo, nombreAcuatico);
    }

    public void izarVelas(){
        System.out.println("Izando velas...");
    }

    @Override
    public void navegar(){
        System.out.println("El viento empuja al barco");
    }
}
