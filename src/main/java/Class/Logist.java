/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import static Class.Principal1.totalLinea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GHOSTSOFT
 */
public class Logist {
    public static int totalLinea(File ff) {
        FileReader fr;
        try {
            fr = new FileReader(ff);
            BufferedReader br = new BufferedReader(fr);
            return (int) br.lines().count();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Logist.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public void malla1(){
        String directorioActual = System.getProperty("user.dir");
        String rutaDelArchivo = "src/main/java/Class/pf.txt";
        String rutaCompleta = directorioActual + File.separator + rutaDelArchivo;
        File f = new File(rutaCompleta);
        int t = totalLinea(f);
        //System.out.println(t);

        Producto malla[] = new Producto[t];
        int c = 0;
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea1 = br.readLine();
            while (linea1 != null) {
                for (int i = 0; i < linea1.length() - 1; i++) {
                    String linea[] = linea1.split(",");
                    int codigo = Integer.parseInt(linea[0]);
                    String codproducto = linea[1];
                    String nombre = linea[2];
                    int creditos = Integer.parseInt(linea[3]);
                    malla[c] = new Producto(codigo, ciclo, nombre, creditos);
                }
                c++;
                linea1 = br.readLine();
            }
            fr.close();
            } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal1.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
