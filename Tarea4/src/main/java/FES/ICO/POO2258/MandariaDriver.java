package FES.ICO.POO2258;

public class MandariaDriver {
    public static void main(String[] args) {
        Mandarina mandarina1 = new Mandarina(true,"octubre","dulce", (byte) 2,"C");

        System.out.println("Las caracteristicas de las mandarinas son:"+mandarina1);

        System.out.println("Cuantas mandarinas comprara?:");
        System.out.println(mandarina1.ComprarMan());
        System.out.println(mandarina1.RevisarMan());
        System.out.println(mandarina1.Comer());
    }
}
