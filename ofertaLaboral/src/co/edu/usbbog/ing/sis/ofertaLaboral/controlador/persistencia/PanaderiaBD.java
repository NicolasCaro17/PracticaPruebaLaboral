/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.ing.sis.ofertaLaboral.controlador.persistencia;

import co.edu.usbbog.ing.sis.ofertaLaboral.controlador.logica.PanaderiaLogica;
import co.edu.usbbog.ing.sis.ofertaLaboral.modelo.Panaderia;
import co.edu.usbbog.ing.sis.ofertaLaboral.modelo.Venta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author nico_
 */
public class PanaderiaBD {
    private final ConexionMySQL mySQL;
     private ArrayList<Object> listaP;
    PanaderiaLogica logica;
     

    
  public PanaderiaBD() {
        //this.mySQL = new ConexionMySQL("127.0.0.1", 3306, "trabajoanalisis", "root", "papasfritas2012");
        this.mySQL = new ConexionMySQL("127.0.0.1", 3306, "trabajoanalisis", "caro", "password");
         this.listaP = new ArrayList<>();
    }
  public boolean agregar(Panaderia panaderia) {
        if (panaderia!=null) {
            String sql="INSERT INTO panaderia VALUES(";
            sql+=panaderia.getId()+", ";
            sql+="\""+panaderia.getProducto()+"\""+", ";            
            sql+="\""+panaderia.getFecha_vencimiento()+"\""+",";
            sql+="\""+panaderia.getMarca()+"\""+", "; 
            sql+=panaderia.getPrecio()+", "; 
            sql+=panaderia.getCantindad(); 
            sql+=");";
            System.out.println(sql);
            if(this.mySQL.conectar()){
                Connection con = this.mySQL.getCon();
                try {
                    Statement stm = con.createStatement();
                    stm.execute(sql);
                    stm.close();
                    con.close();
                    return true;
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    return false;
                }
            }else{
                return false;
            }           
        } else {
            return false;
        }    
    }

    public boolean modificar(Panaderia panaderia, int id) {
        String sql = "UPDATE panaderia SET ";
        sql += "id = " + panaderia.getId() + ", ";
        sql += "producto = \"" + panaderia.getProducto() + "\", ";
        sql += "fecha_vencimiento = \"" + panaderia.getFecha_vencimiento()+ "\", ";
        sql += "marca = \"" + panaderia.getMarca() + "\", ";
        sql += "precio = " + panaderia.getPrecio()+",";
        sql += "cantidad = " + panaderia.getCantindad();
        sql += " WHERE id = " + id + ";";
        System.out.println(sql);
        if (this.mySQL.conectar()) {
            Connection con = this.mySQL.getCon();
            try {
                Statement stm = con.createStatement();
                stm.execute(sql);
                stm.close();
                con.close();
                return true;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        } else {
            return false;
        }                    
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM trabajoanalisis.panaderia WHERE " + "id = " + id + ";";
        System.out.println(sql);
        if (this.mySQL.conectar()) {
            Connection con = this.mySQL.getCon();
            try {
                Statement stm = con.createStatement();
                stm.execute(sql);
                stm.close();
                con.close();
                return true;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        } else {
            return false;
        }
    }

    

        public DefaultTableModel buscarPorId(DefaultTableModel tabla) {
        String sql="SELECT * FROM panaderia;";
        System.out.println(sql);
        if(this.mySQL.conectar()){
            try {
                Connection con = this.mySQL.getCon();
                Statement stm = con.createStatement();
                ResultSet rs = (ResultSet) stm.executeQuery(sql);
                Object[]datos = new Object[6];
                while(rs.next()){
                datos[0]=rs.getInt(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getInt(5);
                datos[5]=rs.getInt(6);
                tabla.addRow(datos);
                }
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(PanaderiaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tabla;
    }
    
    public boolean agregarV(Venta venta) {
        if (venta!=null) {
            String sql="INSERT INTO venta VALUES(";
            sql+=venta.getId()+", ";
            sql+="\""+venta.getFecha()+"\""+", ";            
            sql+=venta.getTotal();
            sql+=");";
            System.out.println(sql);
            if(this.mySQL.conectar()){
                Connection con = this.mySQL.getCon();
                try {
                    Statement stm = con.createStatement();
                    stm.execute(sql);
                    stm.close();
                    con.close();
                    return true;
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    return false;
                }
            }else{
                return false;
            }           
        } else {
            return false;
        }    
    }

    public DefaultTableModel buscarPorId2(DefaultTableModel tabla) {
       String sql="SELECT * FROM venta;";
        System.out.println(sql);
        if(this.mySQL.conectar()){
            try {
                Connection con = this.mySQL.getCon();
                Statement stm = con.createStatement();
                ResultSet rs = (ResultSet) stm.executeQuery(sql);
                Object[]datos = new Object[3];
                while(rs.next()){
                datos[0]=rs.getInt(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                tabla.addRow(datos);
                }
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(PanaderiaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tabla;
    }
    
}