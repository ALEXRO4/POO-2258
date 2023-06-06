package FES.ICO2258.Modelo;

import FES.ICO2258.Interfaz.VentanaPrincesas;
import FES.ICO2258.Persistencia.PrincesasDisneyDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaPrincesa implements TableModel {

    private ArrayList<PrincesasDisney> datos;
    private PrincesasDisneyDAO pdao;

    public static final int COLUMNAS = 6;

    public ModeloTablaPrincesa() {
        pdao = new PrincesasDisneyDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaPrincesa(ArrayList<PrincesasDisney> datos) {

        this.datos = datos;
        pdao = new PrincesasDisneyDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS;
    }

    @Override
    public String getColumnName(int columnIndex) {


        switch (columnIndex) {

            case 0:
                return "Id";

            case 1:
                return "Nombre";
            case 2:
                return "Fabula";
            case 3:
                return "ColorVestido";
            case 4:
                return "Imagen";
            case 5:
                return "Antagonista";
            default:
                return null;

        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return int.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;

            default:
                return String.class;


        }


    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PrincesasDisney tmp = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getCuento();
            case 3:
                return tmp.getColorVestido();
            case 4:
                return tmp.getImagenUrl();
            case 5:
                return tmp.getAntagonista();

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                //datos.get(rowIndex).setId(Integer.parseInt((String) aValue));
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setCuento((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setColorVestido((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setImagenUrl((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setAntagonista((String) aValue);
                break;
            default:
                System.out.println("No se modifico nada");
                break;
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos() {

        try {
            ArrayList<PrincesasDisney> tirar = pdao.obtenerTodo();

            datos = pdao.obtenerTodo();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean agregarPrincesa(PrincesasDisney princesa) {
        boolean resultado = false;
        try {
            if (pdao.insertar(princesa)) {
                datos.add(princesa);
                resultado = true;
            } else {

                resultado = false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    public PrincesasDisney getPrincesaAtIndex(int i) {

        return datos.get(i);
    }

    public boolean borrarFila( int index) throws SQLException {

        if (pdao.delete(index)) {

            return true;

        } else {
            return false;
        }
    }


    public boolean actualizarCelda(String datoActualizado, int id, int colIndex) throws SQLException {
        if (pdao.cambiarPorCeldas(datoActualizado,id,colIndex)){
            return true;
        }else {
            return false;
        }
    }



}