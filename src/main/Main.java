/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import persistencia.FicheroLibros;
import vista.VentanaPrincipal;

/**
 *
 * @author joeli
 */
public class Main {
    
    public static FicheroLibros fl = new FicheroLibros();

    public static VentanaPrincipal vp = new VentanaPrincipal();
    
    public static void main(String[] args) {
        
    fl.crear();
        
    vp.setVisible(true);
        
    }
    
}
