package FES.ICO2258.Persistencia;

import FES.ICO2258.Modelo.Libro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DemoLibroDB {
    public DemoLibroDB() {
    }

    public void insertarStatement(){
        String elTitulo = "Arrancame la vida";
        String elAutor = "Angeles";
    try {
    Statement stm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().createStatement();
    String sqlInsert = "INSERT INTO libros(titulo,autor) VALUES('"+elTitulo+"','"+elAutor+"')";
    int rowCount = stm.executeUpdate(sqlInsert);
        System.out.println("Se insertaron "+ rowCount+ " Registros");
    }catch (SQLException sqle){
    System.out.println("Error al conectar" + sqle.getMessage());
}
}
    public void insertarPreparedStatement(){
            String elTitulo = "El principito";
        String elAutor = "No me acuerdo";

        String sqlInsert = "INSERT INTO libros(titulo,autor) VALUES(?,?)";

        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1,elTitulo);
            pstm.setString(2,elAutor);
            int rowCount = pstm.executeUpdate();
            System.out.println("Se insertaron "+rowCount+" Registros");
        }catch (SQLException sqle ){
            System.out.println("Error Prepared statement" + sqle.getMessage());
        }
    }

    public boolean insertarLibro(Libro libro){
        String sqlInsert = "INSERT INTO libros(titulo,autor) VALUES(?,?)";
        int rowCount = 0;

        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1,libro.getTitulo());
            pstm.setString(2, libro.getAtutor());
            rowCount = pstm.executeUpdate();

        }catch (SQLException sqle ){
            System.out.println("Error Prepared statement" + sqle.getMessage());
        }
        return rowCount > 0;
    }

    public Libro buscarLibroPorId(int id){

        String sql = "SELECT * FROM libros WHERE id = ?;";
        Libro libro = null;
        try {
        PreparedStatement pstm= ConexionSingleton.getInstance("LibrosDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1,id);
            ResultSet rst = pstm.executeQuery();
            if(rst.next()){
                libro = new Libro(rst.getInt(1),rst.getString(2), rst.getString(3));

            }
        }catch (SQLException sqle){
            System.out.println("Error al buscar");

        }
        return libro;
    }

    public ArrayList<Libro> obtenerTodos(){
        String sql = "SELECT * FROM libros";
        ArrayList<Libro> resultado = new ArrayList<>();
        try{
            Statement stm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()){
                resultado.add(new Libro(rst.getInt(1),rst.getString(2),rst.getString(3)));
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

}
