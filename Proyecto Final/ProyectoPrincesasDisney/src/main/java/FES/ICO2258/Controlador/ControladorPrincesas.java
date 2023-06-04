package FES.ICO2258.Controlador;

import FES.ICO2258.Interfaz.VentanaPrincesas;
import FES.ICO2258.Modelo.ModeloTablaPrincesa;
import FES.ICO2258.Modelo.PrincesasDisney;
import FES.ICO2258.Persistencia.PrincesasDisneyDAO;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class ControladorPrincesas extends MouseAdapter {

    private VentanaPrincesas vista;
    private ModeloTablaPrincesa modelo;


    public ControladorPrincesas(VentanaPrincesas vista) {
        this.vista = vista;
        this.vista.getTblPrincesas().addMouseListener(this);
        this.vista.getBtnCargar().addMouseListener(this);
        this.vista.getBtnAgregar().addMouseListener(this);
        modelo = new ModeloTablaPrincesa();
        this.vista.getTblPrincesas().setModel(modelo);
        this.vista.getBtnActualizar().addMouseListener(this);
        this.vista.getBtnBorrar().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.vista.getBtnCargar()){


                modelo.cargarDatos();
                this.vista.getTblPrincesas().setModel(modelo);
                this.vista.getTblPrincesas().updateUI();




        }
        if(e.getSource() == this.vista.getBtnAgregar()){

            PrincesasDisney princesa = new PrincesasDisney();
            princesa.setId(0);
            princesa.setNombre(this.vista.getTxtNombre().getText());
            princesa.setCuento(this.vista.getTxtCuento().getText());
            princesa.setColorVestido(this.vista.getTxtColorVestido().getText());
            princesa.setImagenUrl(this.vista.getTxtImagenUrl().getText());
            princesa.setAntagonista(this.vista.getTxtAntagonista().getText());

            if(modelo.agregarPrincesa(princesa)){
                JOptionPane.showMessageDialog(vista,"Se agrego correctamente","Confirmacion",JOptionPane.INFORMATION_MESSAGE);

                modelo.cargarDatos();
                this.vista.getTblPrincesas().setModel(modelo);
                this.vista.getTblPrincesas().updateUI();



            }else {
                JOptionPane.showMessageDialog(vista,"No se pudo agregar correctamente, revise su conexion","Error",JOptionPane.ERROR_MESSAGE);
            }
            this.vista.limpiar();

        }

        if (e.getSource() == this.vista.getTblPrincesas()){

            try {
                int index = this.vista.getTblPrincesas().getSelectedRow();
                PrincesasDisney tmp = modelo.getPrincesaAtIndex(index);
                this.vista.getLblImg().setIcon(tmp.getImagen());
            } catch (MalformedURLException ex) {
                throw new RuntimeException(ex);
            }
            this.vista.getLblImg().setText("");
        }

        if(e.getSource() == this.vista.getBtnBorrar()){
            int index = this.vista.getTblPrincesas().getSelectedRow();
            PrincesasDisney tmp = modelo.getPrincesaAtIndex(index);
           int resultado = JOptionPane.showConfirmDialog(vista,"Esta seguro que desea borrar el registro "+(tmp.getId())+"?","Confirmacion",JOptionPane.YES_NO_OPTION);
            if(resultado == JOptionPane.YES_NO_OPTION) {

                PrincesasDisney princesa = new PrincesasDisney();
                princesa.setNombre("");
                princesa.setCuento("");
                princesa.setColorVestido("");
                princesa.setImagenUrl("");
                princesa.setAntagonista("");



                try {
                    if (modelo.borrarFila(princesa,tmp.getId())) {
                        JOptionPane.showMessageDialog(vista, "Se borro correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        modelo.cargarDatos();
                        this.vista.getTblPrincesas().setModel(modelo);
                        this.vista.getTblPrincesas().updateUI();


                    } else {
                        JOptionPane.showMessageDialog(vista, "No se pudo borrar correctamente, revise su conexion", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }


            }

        }

        if (e.getSource() == this.vista.getBtnActualizar()) {
            int index = this.vista.getTblPrincesas().getSelectedRow();
            PrincesasDisney tmp = modelo.getPrincesaAtIndex(index);
            int id = tmp.getId();
            String datoActualizado = JOptionPane.showInputDialog(vista,"Inserte el dato a actualizar de "+
                    this.vista.getTblPrincesas().getColumnName(vista.getTblPrincesas().getSelectedColumn())+" del registro "
                    +id,"Actualizar",JOptionPane.INFORMATION_MESSAGE);


            int colIndex = this.vista.getTblPrincesas().getSelectedColumn();

            System.out.println(colIndex+""+datoActualizado+""+id);

            try {
                if(modelo.actualizarCelda(datoActualizado,id,colIndex)){
                    System.out.println("se logro");
                    modelo.cargarDatos();
                    this.vista.getTblPrincesas().setModel(modelo);
                    this.vista.getTblPrincesas().updateUI();

                }else{
                    System.out.println("no se logro");
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }


        }
    }

}
