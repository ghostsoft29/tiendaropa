/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Objects;

/**
 *
 * @author INFORMATICA
 */
public class Comida {
    private String codplato;
    private String empresa;
    private String detalle;
    private double precio;

    public Comida(String codplato, String empresa, String detalle, double precio) {
        this.codplato = codplato;
        this.empresa = empresa;
        this.detalle = detalle;
        this.precio = precio;
    }
    
    public String getCodplato() {
        return codplato;
    }

    public void setCodplato(String codplato) {
        this.codplato = codplato;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Codigo Comida= " + codplato + " " + empresa + " " + detalle + " " + precio + "\n";
    }
 

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Comida other = (Comida) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.codplato, other.codplato)) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        return Objects.equals(this.detalle, other.detalle);
    }

     
}
