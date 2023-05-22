package FES.ICO2258;

import FES.ICO2258.Modelo.Libro;
import FES.ICO2258.Persistencia.DemoLibroDB;
import FES.ICO2258.Persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DemoLibroDB demo = new DemoLibroDB();

        LibroDAO ldao = new LibroDAO();

        try {
          Libro res =(Libro) ldao.buscarPorId("1");
            System.out.println(res);
            System.out.println("---------------");
            for (Object lib: ldao.obtenerTodo()) {
                System.out.println((Libro)lib);
            }

        }catch (SQLException slqe){
            System.out.println(slqe.getMessage());
        }



    }
}