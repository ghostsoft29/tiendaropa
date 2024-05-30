/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Arrays;
import java.util.LinkedList;
import javax.swing.JTextArea;

/**
 *
 * @author GHOSTSOFT
 */
public class VentaL {
    public LinkedList<Venta>ventas=new LinkedList<>(Arrays.asList(new Venta(1,"cod1",1,"lol")));
    public int u=0,cantidad;
    public String codproducto,estado;
    
    public void AgregarVenta(){
        u=u+1;
        Venta en=new Venta(u,codproducto,cantidad,estado);
        ventas.addLast(en);
        System.out.print(en);
    }
    
    public void listar(JTextArea list){
        
        list.setText("LISTA de Venta\n");
        for(Venta item:ventas){
            System.out.println(item);
            list.append("\n"+item);
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
