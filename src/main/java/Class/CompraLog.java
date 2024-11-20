/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.LinkedList;
import javax.swing.JTextArea;

/**
 *
 * @author INFORMATICA
 */
public class CompraLog {

    public static int u = 0, codcliente,cantidad,cantidadcli;
    public static String codproducto,codcli;
    public static double total;
    
    public static LinkedList<Compra> compra = new LinkedList<>();
    
    public void listar(JTextArea list) {
        list.setText("LISTA DE COMIDAS\n");
        for (Compra item : compra) {
            list.append("\n" + item);

        }
    }
    
    public void listarCarrito(JTextArea list) {
        list.setText("Recibo de Compra\n");
            list.append("\n" + compra.getLast());      
    }
    
    public void PagarComida() {
        u=u+1;
        Compra en = new Compra(u,codcliente,ComidaLog.getComidac(),cantidad,ComidaLog.getPg());
        compra.addLast(en);
    }
    //De acuerdo al cliente llama cuanta venat tiene actual
    public void sumac(){
        Cliente us = buscarc(ClienteLog.clientes, codcli);
        
            //cantidadcl=0;
            cantidadcli = us.getCantidad();
        
    }
    //De acuerdo al cliente llena la nueva cantidad en el cliente
    public void sumad(){
        Cliente us = buscarc(ClienteLog.clientes, codcli);
        
            us.setCantidad(cantidadcli);
        
    }
    
    public static Cliente buscarc(LinkedList<Cliente> clientes, String data) {
        for (Cliente item : clientes) {
            if (item.getCliente().equals(data)) {
                return item;
            }
        }
        return null;
    }

    public static int getU() {
        return u;
    }

    public static void setU(int u) {
        CompraLog.u = u;
    }

    public static int getCodcliente() {
        return codcliente;
    }

    public static void setCodcliente(int codcliente) {
        CompraLog.codcliente = codcliente;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        CompraLog.cantidad = cantidad;
    }

    public static int getCantidadcli() {
        return cantidadcli;
    }

    public static void setCantidadcli(int cantidadcl) {
        CompraLog.cantidadcli = cantidadcl;
    }

    public static String getCodproducto() {
        return codproducto;
    }

    public static void setCodproducto(String codproducto) {
        CompraLog.codproducto = codproducto;
    }

    public static String getCodcli() {
        return codcli;
    }

    public static void setCodcli(String codcli) {
        CompraLog.codcli = codcli;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
