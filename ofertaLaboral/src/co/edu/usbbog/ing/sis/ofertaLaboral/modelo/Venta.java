/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.ing.sis.ofertaLaboral.modelo;

/**
 *
 * @author nico_
 */
public class Venta {
    int id;
    String fecha; 
    int total;

    public Venta(int id, String fecha, int total) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", fecha=" + fecha + ", total=" + total + '}';
    }
    
}
