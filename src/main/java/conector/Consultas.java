package conector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Consultas extends Conexion {

    public boolean autenticacion(String USUARIO, String Contraseña) {
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            String consulta = "select * from usuarios where usuario = ? and password = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, USUARIO);
            pst.setString(2, Contraseña);
            rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("error------ Fatal");
            e.getMessage();
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
                ;

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return false;
    }

    public boolean registrar(String nombre, String apellido, String usuario, String password) {

        PreparedStatement pst = null;
        try {
            String consulta = "insert into usuarios (nombre, apellido, usuario, password) values(?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, usuario);
            pst.setString(4, password);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;

    }

    public int getTipo(String usuario) {

        int tipo = 0;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            String consulta = "select * from usuarios where usuario = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            rs = pst.executeQuery();

            if (rs.next()) {
                tipo = rs.getInt("tipo");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("error------ Fatal");
            e.getMessage();
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
                ;

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return tipo;
    }
    
    public static void main(String[] args) {
        Consultas con = new Consultas();
        System.out.println(con.getTipo("Pablo12xela"));
    }

}
