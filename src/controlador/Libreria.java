/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;
import modelo.Libro;
import persistencia.FicheroLibros;

/**
 *
 * @author joeli
 */

public class Libreria {
    
    public static HashMap<String, Libro> libros = new HashMap<String, Libro>();

    public static void guardar() {

        FicheroLibros.guardar(libros);

    }

    public static void cargar() {

        libros = FicheroLibros.cargar();

    }
    
    public static void anadir(Libro l) {

        if (!libros.containsKey(l.getKey())) {
            libros.put(l.getKey(),l);
            JOptionPane.showMessageDialog(null, "Libro anadido correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Libro ya registrado");
        }

    }
    
    public static void eliminar(String key) {
    
        if (libros.containsKey(key)) {
            libros.remove(key);
            JOptionPane.showMessageDialog(null, "Libro eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Libro no registrado");
        }
    }
    
    public static void actualizar(Libro l) {

        if (libros.containsKey(l.getKey())) {
            libros.put(l.getKey(),l);
            JOptionPane.showMessageDialog(null, "Libro actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Libro no registrado");
        }

    }
      
}
