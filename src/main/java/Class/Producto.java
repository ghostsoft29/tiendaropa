/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author GHOSTSOFT
 */
public class Producto implements Comparable<Producto> {
    private int codigo;
    private String codproducto;
    private String detalle;
    private String marca;
    private String categoria;
    private double precio;
    private int cantidad;

    public Producto(int codigo, String codproducto, String detalle, String marca, String categoria, double precio, int cantidad) {
        this.codigo = codigo;
        this.codproducto = codproducto;
        this.detalle = detalle;
        this.marca = marca;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto(String codproducto) {
        this.codproducto = codproducto;
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return  codigo + "\t"+ codproducto + "\t" + detalle + "\t" + marca + "\t" + categoria + "\t" + precio + "\t" + cantidad;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.codproducto, other.codproducto);
    }

     @Override
    public int compareTo(Producto t) {
        return COMPARING_CODIGOPRO.compare(this, t);
    }
    public static final Comparator<Producto> COMPARING_CODIGOPRO = Comparator.comparing(Producto::getCodproducto);
    
    
}
