package FES.ICO.GRUPO2258;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerArchivo {

    public static void main(String[] args) throws FileNotFoundException {
        String ruta = "datos.txt";
        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
        }catch (FileNotFoundException Fnfe){
            System.out.println("El archivo no existe");
            System.out.println(Fnfe.getMessage());
        }
    }

}
