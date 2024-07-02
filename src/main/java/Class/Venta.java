/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

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

    public Venta(int codv, String codp, int cantidad, String estado) {
        this.codv = codv;
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
        return + codv + " " + codp + " " + cantidad + " " + estado;
    }
    
    
}
