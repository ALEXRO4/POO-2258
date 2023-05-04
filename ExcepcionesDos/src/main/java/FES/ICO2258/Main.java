package FES.ICO2258;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    LeerArchivo lectura = new LeerArchivo();

    try {
        lectura.metodoUno("de.txt");
    }catch (IOException e){
        e.printStackTrace();
    }






    }
}