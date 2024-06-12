package com.mycompany.instrumentoinventario;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class InventarioHashMap {
    HashMap<String, Integer> productos;
    
    public InventarioHashMap () {
        productos = new HashMap<String, Integer>();
    }
    
    public void agregarProducto (String nombre) {
        if (!productos.containsKey(nombre)) { 
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial del producto"));
            
            productos.put(nombre, cantidad);
            JOptionPane.showMessageDialog(null, "Producto "+nombre+" agregado a la lista");
        } else {
            JOptionPane.showMessageDialog(null, "El producto ya existe en la lista");
        }
    }
    
    public void actualizarProducto (String nombre) {
       
        if (productos.containsKey(nombre)) {
            int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad del producto "+nombre));
            productos.put(nombre, nuevaCantidad);
        } else {
            JOptionPane.showMessageDialog(null, "El producto no se encuentra en la lista");
        }
    }
    
    public void mostrarInventario () {
       
        if (productos.size() > 0) {
            for (Map.Entry<String, Integer> producto : productos.entrySet()) {
                JOptionPane.showMessageDialog(null, "Producto "+producto.getKey()+": "+producto.getValue()+" unidades");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El inventario no cuenta con contenido");
        }
    }
    
    public void removerProducto (String nombre) {
        
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
        } else {
            JOptionPane.showMessageDialog(null, "El producto "+nombre+" no se en cuentra en la lista");
        }
    }
    
    public void consultarProductoPorNombre (String nombre) {
        
        if (productos.containsKey(nombre)) {
            JOptionPane.showMessageDialog(null, "Producto "+nombre+": "+productos.get(nombre)+" unidades");
        } else {
            JOptionPane.showMessageDialog(null, "El producto "+nombre+" no se en cuentra en la lista");
        }
    }
}

