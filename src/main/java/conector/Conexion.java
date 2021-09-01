package conector;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexion {
    private String USERNAME = "root";
    private String PASSWORD = "123456";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "loginjsp";
    private String CLASSENAME = "com.mysql.cj.jdbc.Driver";
    private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;

    public Conexion(){
        try {
            Class.forName(CLASSENAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (ClassNotFoundException e) {
            System.err.println("error-------- clas note"+e);

        }catch(SQLException e){
            System.err.println("error-------- sql"+e);
        }
    }

    public Connection getConexion(){
        return con;
    }
    
    public Connection mandaConexion(){
        
        try {
            Connection conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return conexion;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }

    }
    


    
}