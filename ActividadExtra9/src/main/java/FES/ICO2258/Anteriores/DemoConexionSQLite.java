package FES.ICO2258.Anteriores;

import java.sql.*;

public class DemoConexionSQLite {
    public static void main(String[] args){

        String DB_URL = "jdbc:sqlite:LibrosDB.db";
        Connection conexion = null;

        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(DB_URL);
            Statement stm = conexion.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM libros");
            while (rst.next()){
                System.out.println(rst.getString(1) + " "+rst.getString(2));
            }
            conexion.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }


    }

}
