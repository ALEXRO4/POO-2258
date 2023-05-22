package FES.ICO2258.Persistencia;

import FES.ICO2258.Modelo.Libro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public interface InterfazDAO {


    public abstract boolean insertar(Object obj) throws SQLException;


    boolean updte(Object obj) throws SQLException;

    public abstract boolean delete(String id) throws SQLException;
    public abstract ArrayList obtenerTodo() throws SQLException;
    public abstract Object buscarPorId(String id) throws SQLException;

}
