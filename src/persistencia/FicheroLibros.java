/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import modelo.Libro;

/**
 *
 * @author joeli
 */
public class FicheroLibros {

    public static HashMap<String, Libro> libros = new HashMap<String, Libro>();

    public static String separator = File.separator;

    public static String ruta = System.getProperty("user.dir");

    public static File rutaCarpeta = new File(ruta + separator + "data");

    private static File rutaArchivo = new File(rutaCarpeta + separator + "Videojuegos.txt");

    public static void crear() {

        try {
            if (!rutaCarpeta.exists()) {
                rutaCarpeta.mkdir();
            }

            if (!rutaArchivo.exists()) {
                rutaArchivo.createNewFile();
            }

        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void guardar(HashMap<String, Libro> libros) {

        try {

            FileWriter fw = new FileWriter(rutaArchivo, false);
            BufferedWriter bw = new BufferedWriter(fw);

            Iterator it = libros.keySet().iterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                bw.write(libros.get(key).toString());
                bw.newLine();
                bw.flush();
            }

            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    public static HashMap<String, Libro> cargar() {

        try {

            FileReader fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] atributo = linea.split(";");
                Libro l = new Libro(atributo[0], atributo[1], Double.parseDouble(atributo[2]), Integer.parseInt(atributo[3]));
                libros.put(atributo[0], l);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error");
        }

        return libros;
    
    }

}
