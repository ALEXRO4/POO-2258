package FES.ICO.GRUPO2258;

public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion = new Camion("Diesel", 3);
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println();

        System.out.println("motocicleta");
        Motocicleta moto = new Motocicleta(150, "Yamaha");

        System.out.println(moto);
        System.out.println(moto.encender());
        moto.avanzar();
        moto.hacerCabillito();
        moto.frenar();
        System.out.println(moto.apagar());
    }
}
