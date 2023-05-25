package FES.ICO2258.Anteriores;

import FES.ICO2258.Controlador.ControladorLibro;
import FES.ICO2258.Modelo.Libro;
import FES.ICO2258.Persistencia.DemoLibroDB;
import FES.ICO2258.Persistencia.LibroDAO;
import FES.ICO2258.Vista.VentanaLibro;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaLibro ventana = new VentanaLibro("MVC y JDBC");
        ControladorLibro controlador = new ControladorLibro(ventana);



    }
}