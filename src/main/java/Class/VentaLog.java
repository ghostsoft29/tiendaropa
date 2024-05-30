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
public class VentaLog{
    public static LinkedList<Venta>ventas=new LinkedList<>();
    public static LinkedList<Venta>ventacola=new LinkedList<>();
    public int u=0,cantidad,codv;
    public String codproducto,estado;
    
    public void AgregarVenta(){
        u=u+1;
        Venta en=new Venta(u,codproducto,cantidad,estado);
        ventas.addLast(en);
        ventacola.addLast(en);
    }
    
    public void listar(JTextArea list){
        
        list.setText("LISTA de Venta\n");
        for(Venta item:ventas){
            list.append("\n"+item);
        }
    }
    
    public void listar1(JTextArea list){
        
        list.setText("LISTA de Venta\n");
        for(Venta item:ventacola){
            list.append("\n"+item);
        }
    }

    public Venta dequeue(){
        if(ventacola.size()==0){
            System.out.println("LA cola esta sin elementos");
            return null;
        }
        else{
            Venta e=ventacola.getFirst();
            Venta f=ventas.getFirst();
            f.setEstado(estado);
            ventacola.remove(0);
            return e;
            
        }
    }
    
    public void CambiarDetalle(){
        Venta us=buscar(ventas,codv);
         if(us!=null){
            us.setEstado(estado);         
            }
    }
    
    public static Venta buscar(LinkedList<Venta>ventas,int data){
        for(Venta item:ventas){
            if(item.getCodv()==data)
                return item;
        }
        return null;
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

    public int getCodv() {
        return codv;
    }

    public void setCodv(int codv) {
        this.codv = codv;
    }

    
    
    
}
