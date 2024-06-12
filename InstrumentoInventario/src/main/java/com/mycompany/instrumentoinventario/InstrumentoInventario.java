package com.mycompany.instrumentoinventario;

import javax.swing.JOptionPane;

public class InstrumentoInventario {
    public static void main(String[] args) {
        InventarioHashMap inv = new InventarioHashMap(); 
        int opt = 0;
        do {
            
            opt = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar producto \n2. Actualizar cantidad de producto \n3. Eliminar producto \n4. Mostrar inventario\n5. Consultar producto por su nombre \n6. Salir"));
            switch (opt) {
                case 1:
                   
                    inv.agregarProducto(JOptionPane.showInputDialog("Ingrese el nombre del producto"));
                    inv.mostrarInventario();
                    break;
                case 2:
                   
                    inv.actualizarProducto(JOptionPane.showInputDialog("Ingrese el nombre del producto"));
                    inv.mostrarInventario();
                    break;
                case 3:
                    
                    inv.removerProducto(JOptionPane.showInputDialog("Ingrese el nombre del producto"));
                    inv.mostrarInventario();
                    break;
                case 4:
                    
                    inv.mostrarInventario();
                    break;
                case 5:
                   
                    inv.consultarProductoPorNombre(JOptionPane.showInputDialog("Ingrese el nombre del producto"));
                    inv.mostrarInventario();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opción invalida");
            }
        } while (opt!=6);
    }
}
    