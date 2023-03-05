package FES.ICO.POO2258;

import java.sql.SQLOutput;

public class GatoDriver {
    public static void main(String[] args) {

        Gato Cat = new Gato("siames","M", (byte) 8,"Atun", true);
        System.out.println("Pongale nombre a su gato:");
        System.out.println("Su gato se llama ahora:"+Cat.Nombrar());
        System.out.println(Cat);
        System.out.println("El gato estara dormido?");
        System.out.println(Cat.Dormir());

        System.out.println(Cat.Alimentar());

    }
}
