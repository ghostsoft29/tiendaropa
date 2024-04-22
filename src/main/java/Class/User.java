/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTextArea;
/**
 *
 * @author GHOSTSOFT
 */
public class User {
    private static String user,pass;
    private static int cod,tip,u=1;
    private boolean a;
    
    private static ArrayList<Integer> codigo = new ArrayList(Arrays.asList(u));
    private static ArrayList<String> usuario = new ArrayList(Arrays.asList("admin"));
    private static ArrayList<String> contraseña = new ArrayList(Arrays.asList("admin"));
    private static ArrayList<Integer> tipo = new ArrayList(Arrays.asList(1));
    
    
    
    public void acceso(){
        for(int i=0;i<codigo.size();i++){
            if(usuario.get(i).equals(user) && contraseña.get(i).equals(pass)){
                a=true;
                break;
            }
        }       
    }
    
    public void comparadorUser(){
        a=false;
        for(int i=0;i<codigo.size();i++){
            if(usuario.get(i).equals(user)){
                a=true;
                break;
            }
        }     
    }
    
    public void insertar(){
        u=u+1;
        codigo.add(u);
        usuario.add(user);
        contraseña.add(pass);
        tipo.add(tip);
    }
    
    public void listar(JTextArea list){
        list.setText("LISTA DE Usuarios\n");
            for(int i=0;i<codigo.size();i++){
                list.append(Integer.toString(codigo.get(i))+",");
                list.append(usuario.get(i)+",");
                list.append(contraseña.get(i)+",");
                list.append(Integer.toString(tipo.get(i))+"\n");
            }
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

    public static int getTip() {
        return tip;
    }

    public static void setTip(int tip) {
        User.tip = tip;
    }

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }
   
}

