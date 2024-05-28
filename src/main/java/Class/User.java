/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import javax.swing.JTextArea;
/**
 *
 * @author GHOSTSOFT
 */
public class User {
    private static String user,user1,pass;
    private static int cod,cod1,tip,tip1,u=1;
    private boolean a;
    
    private static ArrayList<Integer> codigo = new ArrayList(Arrays.asList(u));
    private static ArrayList<String> usuario = new ArrayList(Arrays.asList("admin"));
    private static ArrayList<String> contraseña = new ArrayList(Arrays.asList("admin"));
    private static ArrayList<Integer> tipo = new ArrayList(Arrays.asList(1));
    
    
    private static LinkedList<Usuario>usuarios=new LinkedList<>(
            Arrays.asList(new Usuario(u,"admin","admin",1)));
    
    //acceso con Linked List
    public void acceso1(){
        for(Usuario item:usuarios){
            if(item.getUsuario().equals(user)&&item.getContrasenia().equals(pass)){
                a=true;
                user1=item.getUsuario();
                tip1=item.getCodigo();
            }
        }
    }
    
    
    
    public void acceso(){
        for(int i=0;i<codigo.size();i++){
            if(usuario.get(i).equals(user) && contraseña.get(i).equals(pass)){
                a=true;
                user1=user;
                tip1=tipo.get(i);
                break;
            }
        }       
    }
    
    
    public void comparadorUser1(){
        a=false;
        for(Usuario item:usuarios){
            if(item.getUsuario().equals(user)){
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
    
    //insertar en linkedlist
    public void insertar1(){
        u=u+1;
        Usuario en=new Usuario(u,user,pass,tip);
        usuarios.addLast(en);
    }
    
    public void insertar(){
        u=u+1;
        codigo.add(u);
        usuario.add(user);
        contraseña.add(pass);
        tipo.add(tip);
    }
    
    
    public void listar1(JTextArea list){
        list.setText("LISTA DE Usuarios\n");
        for(Usuario item:usuarios){
            list.append("\n"+item);

        }
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
    
    public static Usuario buscar(LinkedList<Usuario>usuarios,int data){
        for(Usuario item:usuarios){
            if(item.getCodigo()==data)
                return item;
        }
        return null;
    } 
    public void ModificarCod(JTextArea list){
        Usuario info=buscar(usuarios,cod1);
        if(info==null)
            list.setText("No se encuentra");
        else{
           info.setUsuario(user);
           info.setContrasenia(pass);
           info.setTipo(tip);  
           listar1(list);

        }
    }

    public static int getCod1() {
        return cod1;
    }

    public static void setCod1(int cod1) {
        User.cod1 = cod1;
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

    public static String getUser1() {
        return user1;
    }

    public static void setUser1(String user1) {
        User.user1 = user1;
    }

    public static int getTip1() {
        return tip1;
    }

    public static void setTip1(int tip1) {
        User.tip1 = tip1;
    }
   
}

