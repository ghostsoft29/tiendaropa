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
public static int u=0,cantidad;
public static double precio;
public String codproducto,detalle,marca,categoria;

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

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        ProductoLog.cantidad = cantidad;
    }

    public static double getPrecio() {
        return precio;
    }

    public static void setPrecio(double precio) {
        ProductoLog.precio = precio;
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
