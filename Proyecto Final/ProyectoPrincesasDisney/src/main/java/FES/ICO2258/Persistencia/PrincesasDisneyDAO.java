package FES.ICO2258.Persistencia;

import FES.ICO2258.Modelo.PrincesasDisney;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PrincesasDisneyDAO implements InterfazDAO{
    public PrincesasDisneyDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO PrincesasDisney(Nombre,Cuento,ColorVestido,Imagen,Antagonista) VALUES(?,?,?,?,?)";
        int rowCount = 0;


        PreparedStatement pstm = ConexionSingleton.getInstance("PrincesasDisney.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((PrincesasDisney) obj).getNombre());
        pstm.setString(2, ((PrincesasDisney) obj).getCuento());
        pstm.setString(3, ((PrincesasDisney) obj).getColorVestido());
        pstm.setString(4, ((PrincesasDisney) obj).getImagenUrl());
        pstm.setString(5, ((PrincesasDisney) obj).getAntagonista());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean updte(Object obj,int Id) throws SQLException {
        String sqlUpdate = "UPDATE PrincesasDisney SET Nombre = ?, Cuento = ?, ColorVestido = ?, Imagen = ?, Antagonista = ? WHERE Id = "+Id+";";
        int rowCount = 0;


        PreparedStatement pstm = ConexionSingleton.getInstance("PrincesasDisney.db").getConnection().prepareStatement(sqlUpdate);


        pstm.setString(1, ((PrincesasDisney) obj).getNombre());
        pstm.setString(2, ((PrincesasDisney) obj).getCuento());
        pstm.setString(3, ((PrincesasDisney) obj).getColorVestido());
        pstm.setString(4, ((PrincesasDisney) obj).getImagenUrl());
        pstm.setString(5, ((PrincesasDisney) obj).getAntagonista());


        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        String sqlDelete = "DELETE FROM PrincesasDisney WHERE id = ?;";
        int rowCount =0;
        PreparedStatement pstm = ConexionSingleton.getInstance("PrincesasDisney.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,id);
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM PrincesasDisney";
        ArrayList<PrincesasDisney> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.getInstance("PrincesasDisney.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new PrincesasDisney(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),
                    rst.getString(5),rst.getString(6)));
        }


        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM PrincesasDisney WHERE Id = ?;";
        PrincesasDisney princesa = null;

        PreparedStatement pstm= ConexionSingleton.getInstance("PrincesasDisney.db").getConnection().prepareStatement(sql);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if(rst.next()){
            princesa = new PrincesasDisney(rst.getInt(1),rst.getString(2), rst.getString(3),
                    rst.getString(4),rst.getString(5),rst.getString(6));
            return princesa;
        }
            return null;

    }

    public boolean cambiarPorCeldas(String datoActualizado, int Id,int colIndex) throws SQLException {
        String sqlUpdate;
        PreparedStatement pstm;
        int rowCount;

        switch (colIndex){

            case 1:
                sqlUpdate = "UPDATE PrincesasDisney SET Nombre = ? WHERE Id = "+Id+";";
                rowCount = 0;
                pstm = ConexionSingleton.getInstance("PrincesasDisney.db").getConnection().prepareStatement(sqlUpdate);
                pstm.setString(1, (datoActualizado));
                rowCount = pstm.executeUpdate();

                return rowCount > 0;


            case 2:
                sqlUpdate = "UPDATE PrincesasDisney SET Cuento = ? WHERE Id = "+Id+";";
                rowCount = 0;
                pstm = ConexionSingleton.getInstance("PrincesasDisney.db").getConnection().prepareStatement(sqlUpdate);
                pstm.setString(1, (datoActualizado));
                rowCount = pstm.executeUpdate();

                return rowCount > 0;
            case 3:
                sqlUpdate = "UPDATE PrincesasDisney SET ColorVestido = ? WHERE Id = "+Id+";";
                rowCount = 0;
                pstm = ConexionSingleton.getInstance("PrincesasDisney.db").getConnection().prepareStatement(sqlUpdate);
                pstm.setString(1, (datoActualizado));
                rowCount = pstm.executeUpdate();

                return rowCount > 0;
            case 4:
                sqlUpdate = "UPDATE PrincesasDisney SET Imagen = ? WHERE Id = "+Id+";";
                rowCount = 0;
                pstm = ConexionSingleton.getInstance("PrincesasDisney.db").getConnection().prepareStatement(sqlUpdate);
                pstm.setString(1, (datoActualizado));
                rowCount = pstm.executeUpdate();

                return rowCount > 0;

            case 5:
                sqlUpdate = "UPDATE PrincesasDisney SET Antagonista = ? WHERE Id = "+Id+";";
                rowCount = 0;
                pstm = ConexionSingleton.getInstance("PrincesasDisney.db").getConnection().prepareStatement(sqlUpdate);
                pstm.setString(1, (datoActualizado));
                rowCount = pstm.executeUpdate();

                return rowCount > 0;


        }

        return false;
    }



}
