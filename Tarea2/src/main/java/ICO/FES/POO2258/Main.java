package ICO.FES.POO2258;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);


        boolean siONo = false;
        System.out.println("Introduzca una cadena de caracteres :");
        String cad = lector.nextLine();

        Integer[] numAsc = new Integer[cad.length()];


        for (int i = 0; i < cad.length()-1 ; i++) {
            numAsc[i] = (int)cad.charAt(i);
            int numComparador1 = numAsc[i] + 1;


           if(numComparador1 == (int)cad.charAt(i+1)){
               siONo = true;

           }else{
              siONo = false;

              break;

           }
        }

        System.out.println(siONo);

        }




    }
