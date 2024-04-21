/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal1 {

    public static int totalLinea(File ff) {
        FileReader fr;
        try {
            fr = new FileReader(ff);
            BufferedReader br = new BufferedReader(fr);
            return (int) br.lines().count();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        String directorioActual = System.getProperty("user.dir");
        String rutaDelArchivo = "src/main/java/Class/pf.txt";
        String rutaCompleta = directorioActual + File.separator + rutaDelArchivo;
        File f = new File(rutaCompleta);
        int t = totalLinea(f);
        //System.out.println(t);

        Asignatura malla[] = new Asignatura[t];
        int c = 0;
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea1 = br.readLine();
            while (linea1 != null) {
                for (int i = 0; i < linea1.length() - 1; i++) {
                    String linea[] = linea1.split(",");
                    String codigo = linea[0];
                    int ciclo = Integer.parseInt(linea[1]);
                    String nombre = linea[2];
                    int creditos = Integer.parseInt(linea[3]);
                    malla[c] = new Asignatura(codigo, ciclo, nombre, creditos);
                }
                c++;
                linea1 = br.readLine();
            }
            fr.close();
            System.out.println("Datos originales");

            for (Asignatura item : malla) {
                System.out.println(item);
            }
            
            //busqueda lineal por codigo
            Asignatura a1=new Asignatura("100000N08I");
            
            int idx=SearchUTP.linearSearch(malla,a1);
            if(idx<0)
                System.out.println("\nNo se encuentra");
            else
                System.out.println("\n"+malla[idx]);
            
            //Ordenar lista
            Ordena.quickSort(malla);
            System.out.println("\nDatos Orginales");

            for (Asignatura item : malla) {
                System.out.println(item);
            }

            //busqueda binaria por codigo
            Asignatura a2=new Asignatura("100000I17N");
            
            int idx1=SearchUTP.binarySearch(malla,a2);
            if(idx1<0)
                System.out.println("\nNo se encuentra");
            else
                System.out.println("\n"+malla[idx1]);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
