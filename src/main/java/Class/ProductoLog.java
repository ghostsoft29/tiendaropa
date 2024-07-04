/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.LinkedList;
import javax.swing.JTextArea;

/**
 *
 * @author GHOSTSOFT
 */
public class ProductoLog {
public static LinkedList<Producto>productos=new LinkedList<>();
public  int u=0,cantidad;
public  double precio;
public  String codproducto,detalle,marca,categoria;
private boolean a;

//Agregar Productos
    public void AgregarProductos(){
        u=u+1;
        Producto en=new Producto(u,codproducto,detalle,marca,categoria,precio,cantidad);
        productos.addLast(en);
    }
    
    public void listar(JTextArea list){
        list.setText("LISTA DE Productos\n");
        for(Producto item:productos){
            list.append("\n"+item);
        }
    }
    
    public void ModificarProduc(JTextArea list){
        Producto info=buscar(productos,codproducto);
        if(info==null)
            list.setText("No se encuentra");
        else{
           info.setDetalle(detalle);
           info.setMarca(marca);
           info.setCategoria(categoria);
           info.setPrecio(precio);
           info.setCantidad(cantidad);
           listar(list);
        }
    }
    
    public void EliminarProduc(JTextArea list){
        Producto us=buscar(productos,codproducto);
         if(us!=null){
            productos.remove(us);
            listar(list);
            }
            else{
            list.setText("No se encontro estudiante");
            }
    }
    
    public static Producto buscar(LinkedList<Producto>productos,String data){
        for(Producto item:productos){
            if(item.getCodproducto().equals(data))
                return item;
        }
        return null;
    } 
    
    public void CambiarCant(){
        Producto us=buscar(productos,codproducto);
         if(us!=null){
            us.setCantidad(us.getCantidad()-cantidad);
            
            }
    }

    public void comparadorUser1(){
        a=false;
        for(Producto item:productos){
            if(item.getCodproducto().equals(codproducto)){
                a=true;
                break;
            }
        }
    }

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
    
}
