/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

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
public class Read {
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
    
}
