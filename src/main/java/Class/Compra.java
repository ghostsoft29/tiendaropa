/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.LinkedList;

/**
 *
 * @author INFORMATICA
 */
public class Compra {
    private int codcompra;
    private int Codcliente;
    private LinkedList<Comida> comida1; 
    private int cantidad;
    private double total;

    public Compra(int codcompra, int Codcliente, LinkedList<Comida> comida1, int cantidad, double total) {
        this.codcompra = codcompra;
        this.Codcliente = Codcliente;
        this.comida1 = comida1;
        this.cantidad = cantidad;
        this.total = total;
    }

    public int getCodcompra() {
        return codcompra;
    }

    public void setCodcompra(int codcompra) {
        this.codcompra = codcompra;
    }

    public int getCodcliente() {
        return Codcliente;
    }

    public void setCodcliente(int Codcliente) {
        this.Codcliente = Codcliente;
    }

    public LinkedList<Comida> getComida1() {
        return comida1;
    }

    public void setComida1(LinkedList<Comida> comida1) {
        this.comida1 = comida1;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "codigo de compra: " + codcompra + "\nCodigo de cliente: " + Codcliente + "\nPedidos:\n" + comida1 + "\nCantidad de Pedido: " + cantidad + "\nTotal a pagar: " + total;
    }
   
}
