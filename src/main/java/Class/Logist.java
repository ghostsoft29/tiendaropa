/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

//import static Class.Principal1.totalLinea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author GHOSTSOFT
 */
public class Logist {
    
    public static int sel;
    public static String bcod;
    
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
    
    public void malla1(JTextArea list) throws IOException{
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
                    String detalle = linea[2];
                    String marca=linea[3];
                    String categoria=linea[4];
                    double precio=Double.parseDouble(linea[5]);
                    int cantidad = Integer.parseInt(linea[6]);
                    malla[c] = new Producto(codigo, codproducto, detalle, marca,categoria,precio,cantidad);
                }
                c++;
                linea1 = br.readLine();
                
                
            }
            fr.close();
            switch(sel){
                    case 1:{
                        list.setText("LISTA DE PRODUCTOS\n");
                        for (Producto item : malla) {
                        list.append("\n"+item);
                        }
                    }break;
                        case 2:{
                        Ordena.quickSort(malla);
                        list.setText("LISTA DE ORDENADA\n");
                        for (Producto item : malla) {
                        list.append("\n"+item);
                        }
                        }break;
                        case 3:{
                        Ordena.quickSort(malla);
                        Producto a2=new Producto(bcod);
                        int idx1=SearchUTP.binarySearch(malla,a2);
                        if(idx1<0)
                        list.setText("\nNo se encuentra");
                        else
                        list.setText("\n"+malla[idx1]);
                        }break;
                    }            
            } catch (FileNotFoundException ex) {
            Logger.getLogger(Logist.class.getName()).log(Level.SEVERE, null, ex);
            }       
    }
    
    public static int getSel() {
        return sel;
    }

    public static void setSel(int sel) {
        Logist.sel = sel;
    }

    public static String getBcod() {
        return bcod;
    }

    public static void setBcod(String bcod) {
        Logist.bcod = bcod;
    }
    
   
}
