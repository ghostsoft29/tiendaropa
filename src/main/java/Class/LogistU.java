/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
/**
 *
 * @author GHOSTSOFT
 */
public class LogistU {
    private static String user,pass;
    private static int cod,tip;
    private boolean aa=false;
    
    ArrayList<User1>usuario1=new ArrayList( (Collection) new User1("admin","admin"));
    
    public void acceso1(){
        
        User1 busqueda;
        busqueda = new User1(user,pass);
        for(int i=0;i<usuario1.size();i++){
            User1 a=usuario1.get(i);
            aa=a.equals(busqueda);
            if(aa==true){
                break;
            }
        }
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        LogistU.user = user;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        LogistU.pass = pass;
    }

    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        LogistU.cod = cod;
    }

    public static int getTip() {
        return tip;
    }

    public static void setTip(int tip) {
        LogistU.tip = tip;
    }

    public boolean isAa() {
        return aa;
    }

    public void setAa(boolean aa) {
        this.aa = aa;
    }

    

    
}
