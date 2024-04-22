/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author GHOSTSOFT
 */
public class User {
    
    ArrayList<Integer> codigo = new ArrayList(Arrays.asList(1));
    ArrayList<String> usuario = new ArrayList(Arrays.asList("admin"));
    ArrayList<String> contraseña = new ArrayList(Arrays.asList("admin"));
    ArrayList<String> tipo = new ArrayList(Arrays.asList("admin"));
    
    private static String user,pass;
    private static int cod;
    private boolean a;
    
    public void acceso(){
        for(int i=0;i<codigo.size();i++){
            if(usuario.get(i).equals(user) && contraseña.get(i).equals(pass)){
                a=true;
                break;
            }
        }       
    }
    
    public void registrar(){
        
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        User.user = user;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        User.pass = pass;
    }

    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        User.cod = cod;
    }

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }
   
}

