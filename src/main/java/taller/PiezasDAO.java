/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import conector.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerson Reynoso
 */
public class PiezasDAO {
        Connection conexion;
    
    public PiezasDAO(){
        Conexion con = new Conexion();
        conexion = con.mandaConexion();
               
    }
    public List<Piezas> listarPiezas(){
     
        PreparedStatement ps;
        ResultSet rs;
        List<Piezas> lista = new ArrayList<>();
        
        try {
            ps = conexion.prepareStatement("select id, codigo, descripcion, cantidad, costo from piezas");
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id= rs.getInt("id");
                String codigo= rs.getString("codigo");
                String descripcion= rs.getString("descripcion");
                int cantidad= rs.getInt("cantidad");
                double costo= rs.getDouble("costo");
                System.out.println(descripcion+ " "+ cantidad+ " "+ costo);
                
                Piezas pieza = new Piezas(id, codigo, cantidad, descripcion, costo);
                
                lista.add(pieza);
                System.out.println(lista.toString());
                System.out.println(descripcion+ " "+ cantidad+ " "+ costo);
            }
            return lista;
            
        } catch (Exception e) {
            System.err.println(e.toString());
            return null;
        }
    }
    public static void main(String[] args) {
        PiezasDAO mn = new PiezasDAO();
        
        List<Piezas> ps = mn.listarPiezas();
        for (int i = 0; i < ps.size(); i++) {
            System.out.println(ps.get(i).getDescripcion());
            
        }
    }
    
    public Piezas mostrarPieza(int _id){
     
        PreparedStatement ps;
        ResultSet rs;
        Piezas pieza = null; 
        
        try {
            ps = conexion.prepareStatement("select id, codigo, descripcion, cantidad, costo from piezas where id = ?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id= rs.getInt("id");
                String codigo= rs.getString("codigo");
                String descripcion= rs.getString("descripcion");
                int cantidad= rs.getInt("cantidad");
                double costo= rs.getDouble("costo");
                
                pieza = new Piezas(id, codigo, cantidad, descripcion, costo);
                
            }
            return pieza;
            
        } catch (Exception e) {
            System.err.println(e.toString());
            return null;
        }
    }
    
    public boolean insertar(Piezas pieza){
     
        PreparedStatement ps;
        
        try {
            ps = conexion.prepareStatement("insert into piezas (codigo, descripcion, cantidad, costo) values (?,?,?,?)");
            
            ps.setString(1, pieza.getCodigo());
            ps.setString(2, pieza.getDescripcion());
            ps.setInt(3, pieza.getExistencias());
            ps.setDouble(1, pieza.getCosto());
            ps.execute();
            
            
            return true;
            
        } catch (Exception e) {
            System.err.println(e.toString());
            return false;
        }
    }
    
    public boolean actualizar(Piezas pieza){
     
        PreparedStatement ps;
        
        try {
            ps = conexion.prepareStatement("update piezas set codigo=?, descripcion=?, cantidad=? costo=? where id=?");
            
            ps.setString(1, pieza.getCodigo());
            ps.setString(2, pieza.getDescripcion());
            ps.setInt(3, pieza.getExistencias());
            ps.setDouble(4, pieza.getCosto());
            ps.setInt(5, pieza.getId());
            ps.execute();
            
            
            return true;
            
        } catch (Exception e) {
            System.err.println(e.toString());
            return false;
        }
    }
        public boolean eliminar(int _id){
     
        PreparedStatement ps;
        
        try {
            ps = conexion.prepareStatement("delete from piezas id=?");
            
            ps.setInt(1, _id);
            ps.execute();
            
            
            return true;
            
        } catch (Exception e) {
            System.err.println(e.toString());
            return false;
        }
    }
}
