/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import javax.swing.JTextArea;

/**
 *
 * @author GHOSTSOFT
 */
public class ClienteLog {
    private static String user,user1,pass,name;
    private static int cod,cod1,tip,tip1,edad,u,uu;
    private boolean a;
    
    private static LinkedList<Cliente>clientes=new LinkedList<>();
    public void acceso1(){
        for(Cliente item:clientes){
            if(item.getCliente().equals(user)&&item.getContrasenia().equals(pass)){
                a=true;
                user1=item.getCliente();
                uu=item.getCodigo();
            }
        }
    }
    
    public void comparadorUser1(){
        a=false;
        for(Cliente item:clientes){
            if(item.getCliente().equals(user)){
                a=true;
                break;
            }
        }
    }
    
    public void insertar1(){
        u=u+1;
        Cliente en=new Cliente(u,name,user,pass,edad);
        clientes.addLast(en);
    }

    public void listar1(JTextArea list){
        list.setText("LISTA DE CLIENTES\n");
        for(Cliente item:clientes){
            list.append("\n"+item);

        }
    }

    public static int getUu() {
        return uu;
    }

    public static void setUu(int uu) {
        ClienteLog.uu = uu;
    }
    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        ClienteLog.user = user;
    }

    public static String getUser1() {
        return user1;
    }

    public static void setUser1(String user1) {
        ClienteLog.user1 = user1;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        ClienteLog.pass = pass;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ClienteLog.name = name;
    }

    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        ClienteLog.cod = cod;
    }

    public static int getCod1() {
        return cod1;
    }

    public static void setCod1(int cod1) {
        ClienteLog.cod1 = cod1;
    }

    public static int getTip() {
        return tip;
    }

    public static void setTip(int tip) {
        ClienteLog.tip = tip;
    }

    public static int getTip1() {
        return tip1;
    }

    public static void setTip1(int tip1) {
        ClienteLog.tip1 = tip1;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        ClienteLog.edad = edad;
    }

    public static int getU() {
        return u;
    }

    public static void setU(int u) {
        ClienteLog.u = u;
    }

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public static LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(LinkedList<Cliente> clientes) {
        ClienteLog.clientes = clientes;
    }

    
    
    
}
