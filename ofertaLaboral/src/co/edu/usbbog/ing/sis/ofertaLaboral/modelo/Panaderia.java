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
public class Panaderia {
    int id;
    private String producto ;
    private String fecha_vencimiento;
    private String marca;
    private int precio;
    private int cantindad;

    public Panaderia(int id) {
        this.id = id;
    }

    public Panaderia(int id, String producto, String fecha_vencimiento, String marca, int precio, int cantindad) {
        this.id = id;
        this.producto = producto;
        this.fecha_vencimiento = fecha_vencimiento;
        this.marca = marca;
        this.precio = precio;
        this.cantindad = cantindad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantindad() {
        return cantindad;
    }

    public void setCantindad(int cantindad) {
        this.cantindad = cantindad;
    }

    @Override
    public String toString() {
        return "Panaderia{" + "id=" + id + ", producto=" + producto + ", fecha_vencimiento=" + fecha_vencimiento + ", marca=" + marca + ", precio=" + precio + ", cantindad=" + cantindad + '}';
    }

   
    
}
