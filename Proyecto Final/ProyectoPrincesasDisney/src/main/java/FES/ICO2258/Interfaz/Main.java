package FES.ICO2258.Interfaz;

import FES.ICO2258.Controlador.ControladorPrincesas;
import FES.ICO2258.Modelo.ModeloTablaPrincesa;
import FES.ICO2258.Modelo.PrincesasDisney;
import FES.ICO2258.Persistencia.PrincesasDisneyDAO;

import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
     VentanaPrincesas vista = new VentanaPrincesas("Princesas Disney");

        ControladorPrincesas controlador = new ControladorPrincesas(vista);




    }
}