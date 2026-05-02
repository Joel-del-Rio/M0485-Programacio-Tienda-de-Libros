/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author joeli
 */
public class Libro {
 
    private String key;
    private String titulo;
    private double precio;
    private int cantidadEnInventario;

    public Libro(String key, String titulo, double precio, int cantidadEnInventario) {
        this.key = key;
        this.titulo = titulo;
        this.precio = precio;
        this.cantidadEnInventario = cantidadEnInventario;
    }

    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }
    
    
    
    @Override
    public String toString() {
        return titulo + ";" + key + ";" + precio + ";" + cantidadEnInventario;
    }
    
}
