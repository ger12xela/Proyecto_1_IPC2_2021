/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author Gerson Reynoso
 */
public class Piezas {
    private int id, existencias;
    private String codigo;
    private String descripcion;
    private Double costo;
    
    
    public Piezas(int id,String codigo,int existencias, String descripcion, Double costo){
        this.id = id;
        this.codigo=codigo;
        this.existencias = existencias;
        this.descripcion = descripcion;
        this.costo = costo;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double precio) {
        this.costo = precio;
    }
    
    
}
