package FES.ICO.GRUPO2258;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("numero para dividir");

        Scanner lector = new Scanner(System.in);
        try {
      int a = 10;
      int b = Integer.parseInt(lector.nextLine());


          System.out.println("Division: " + (a / b));

      }catch (ArithmeticException e){
          System.out.println("No se puede dividir entre 0");
      }catch (NumberFormatException nfe){
            System.out.println("no se capturo el dato correctamente");
        }

        System.out.println("fin del programa");

      }
}