/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.ing.sis.ofertaLaboral.controlador.logica;

import co.edu.usbbog.ing.sis.ofertaLaboral.controlador.persistencia.PanaderiaBD;
import co.edu.usbbog.ing.sis.ofertaLaboral.modelo.Panaderia;
import co.edu.usbbog.ing.sis.ofertaLaboral.modelo.Venta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author nico_
 */
public class PanaderiaLogica {
    
    private ArrayList<Panaderia> listaPanaderia;

    public PanaderiaLogica() {
     
        this.listaPanaderia = new ArrayList<>();
    }
    PanaderiaBD pan = new PanaderiaBD();

    public boolean agregar(Panaderia a) {
//       if(listaPanaderia.add(a)){
           pan.agregar(a);
//           for (Panaderia panaderia : listaPanaderia) {
//               System.out.println(listaPanaderia);  
//           }
           return true;
//       }else{
//           return false;
//       }
    }
public DefaultTableModel setTitulos(){     
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("id");
        tabla.addColumn("Producto");
        tabla.addColumn("fecha_vencimiento");
        tabla.addColumn("marca");
        tabla.addColumn("Precio");
        tabla.addColumn("cantidad");
        return tabla;           
    }
  
public DefaultTableModel mostrar(){
     setTitulos();
    DefaultTableModel  a = pan.buscarPorId(setTitulos());
    return a;
  }

//    public void mostrar1(ArrayList<Object> listaP) {
//        for (Object object : listaP) {
//            return listaP; 
//        }
//        return null;
//        
//    }

    public void agregarV(Venta a) {
         pan.agregarV(a);
    }

    public DefaultTableModel mostrar2() {
    setTitulos2();
    DefaultTableModel  b = pan.buscarPorId2(setTitulos2());
    return b;
    }

    public DefaultTableModel setTitulos2() {
       DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("id");
        tabla.addColumn("fecha");
        tabla.addColumn("total");
        return tabla;
    }
  
}
