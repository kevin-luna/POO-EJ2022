package Tema2;

public class Helicoptero extends VehiculoAereo{
    public Helicoptero(String nombreVehiculo, String nombreAereo) {
        super(nombreVehiculo, nombreAereo);
    }

    public void encenderHelices(){
        System.out.println("Zuuuuuuuuuuum");
    }

    @Override
    public void volar(){
        System.out.println("Vuela gracias a sus hélices.");
    }
}
