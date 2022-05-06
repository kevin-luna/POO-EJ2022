package Tema2;

public class Barco extends VehiculoAcuatico{
    public Barco(String nombreVehiculo, String nombreAcuatico) {
        super(nombreVehiculo, nombreAcuatico);
    }

    public void encenderMotor(){
        System.out.println("Ruuuuuuuuuun");
    }

    @Override
    public void navegar(){
        System.out.println("El motor empuja el barco");
    }
}
