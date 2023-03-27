package FES.ICO.POO2258;

import java.util.Scanner;

public class CafeteraDriver {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
      Cafetera cafetera = new Cafetera(5000,1000, 1500,50);

    boolean regreso = true;
    while(regreso) {
        System.out.println("Buen día que café llevara el día de hoy");
        System.out.println("Opciones disponbles: ");

        System.out.println("1.- Americano");
        System.out.println("2.- Expreso");
        System.out.println("3.- Capuchino");
        System.out.println("4.- Revisar materiales de la maquina");
        System.out.println("0.- Salir");
        System.out.printf("Selecciones el café que tomará: ");
        int menu = lector.nextInt();

        switch (menu) {
            case 0: {
                break;
            }
            case 1: {//americano
                cafetera.Americano();
                break;
            }
            case 2: {//expreso
                cafetera.Expreso();
                break;
            }
            case 3: {//capuchino
                cafetera.Capuchino();
                break;
            }
            case 4: {//deposito
                System.out.println(cafetera.Depositos());
            }
        }
        if(menu == 0){
            break;
        }
        System.out.println("Desea volver al menu?:");
        System.out.println("Escriba 'true' para voler o 'false' para terminar de hacer cafe");
        regreso = lector.nextBoolean();
    }
    }
}
