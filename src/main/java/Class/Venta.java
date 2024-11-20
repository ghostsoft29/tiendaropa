/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Objects;

/**
 *
 * @author GHOSTSOFT
 */
public class Venta {
    private int codv;
    private int codc;
    private String codp;
    private int cantidad;
    private String estado;

    public Venta(int codv, int codc, String codp, int cantidad, String estado) {
        this.codv = codv;
        this.codc = codc;
        this.codp = codp;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    

    public int getCodc() {
        return codc;
    }

    public void setCodc(int codc) {
        this.codc = codc;
    }
    public int getCodv() {
        return codv;
    }

    public void setCodv(int codv) {
        this.codv = codv;
    }

    public String getCodp() {
        return codp;
    }

    public void setCodp(String codp) {
        this.codp = codp;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "venta= "+codv +"cliente= "+ codc +"producto= " + codp + " " + cantidad + " " + estado;
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
        final Venta other = (Venta) obj;
        if (this.codv != other.codv) {
            return false;
        }
        if (this.codc != other.codc) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (!Objects.equals(this.codp, other.codp)) {
            return false;
        }
        return Objects.equals(this.estado, other.estado);
    }
    
    
}
