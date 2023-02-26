package ICO.FES.POO2258;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String gato = lector.nextLine();

        System.out.println(gato);

        if (gato.length() < 9){
        System.out.println("-----");
        System.out.println("|"+gato.charAt(0)+gato.charAt(1)+gato.charAt(2)+"|");
        System.out.println("|"+gato.charAt(3)+gato.charAt(4)+gato.charAt(5)+"|");
        System.out.println("|"+gato.charAt(6)+gato.charAt(7)+gato.charAt(8)+"|");
        System.out.println("-----");
        }else{
            System.out.println("introduzca una cadena de 9 caracteres");
        }
    }
}