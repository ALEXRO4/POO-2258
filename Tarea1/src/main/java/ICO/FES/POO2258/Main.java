package ICO.FES.POO2258;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);


        System.out.println("Escribe el nombre / profesión / país" );
        String datos = lector.nextLine();

        String[] espacios = datos.split(" ");

        System.out.println( "Nombre:" + espacios[0].toUpperCase());
        System.out.println("Profesión: "+ espacios[1].toUpperCase());
        System.out.println("País: "+ espacios[2].toUpperCase());


    }
}