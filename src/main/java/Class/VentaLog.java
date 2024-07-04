/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.JTextArea;

/**
 *
 * @author GHOSTSOFT
 */
public class VentaLog {

    public static LinkedList<Venta> ventas = new LinkedList<>();
    public static LinkedList<Venta> ventacola = new LinkedList<>();
    //public static LinkedList<Producto>productos=new LinkedList<>();
    public static int u = 0, cantidad, codv, codc, codv1, codvf1,cantidadc;
    public static String codproducto, estado;

    //Declarar Compradores
    Comparator<Venta> porCodC = Comparator.comparing(Venta::getCodc);
    Comparator<Venta> porCodP = Comparator.comparing(Venta::getCodp);
    Comparator<Venta> porCantidad = Comparator.comparing(Venta::getCantidad);

    //Reglas del Negocio
    Comparator<Venta> porClienteyCantidad = porCodC.thenComparing(porCantidad.reversed());
    Comparator<Venta> porProductoyCantidad = porCodP.thenComparing(porCantidad.reversed());

    public void porClienteCantidad(JTextArea list) {

        list.setText("LISTA de Venta\n");
        ventacola.sort(porClienteyCantidad);
        for (Venta item : ventacola) {
            list.append("\n" + item);
        }
        codv1 = ventacola.getFirst().getCodv();
        codvf1 = ventacola.getLast().getCodv();
    }

    public void porProductoCantidad(JTextArea list) {
        list.setText("LISTA de Venta\n");
        ventacola.sort(porProductoyCantidad);
        for (Venta item : ventacola) {
            list.append("\n" + item);
        }
        codv1 = ventacola.getFirst().getCodv();
        codvf1 = ventacola.getLast().getCodv();
    }

    public void AgregarVenta() {
        u = u + 1;
        Venta en = new Venta(u, codc, codproducto, cantidad, estado);
        ventas.addLast(en);
        ventacola.addLast(en);
    }

    public void listar(JTextArea list) {
        list.setText("LISTA de Venta\n");
        for (Venta item : ventas) {
            list.append("\n" + item);
        }
    }

    public void listar1(JTextArea list) {
        list.setText("LISTA de Venta\n");
        for (Venta item : ventacola) {
            list.append("\n" + item);
        }
    }

    //atender cola
    public Venta dequeue(JTextArea list) {
        if (ventacola.size() == 0) {
            list.setText("Sin Ventas\n");
            return null;
        } else {
            Venta e = ventacola.getFirst();
            Venta f = ventas.getFirst();
            f.setEstado(estado);
            ventacola.remove(0);
            if (ventacola.isEmpty()) {
                codv1 = 0;
            } else {
                codv1 = ventacola.getFirst().getCodv();
            }
            return e;

        }
    }

    //atender pila
    public Venta pop(JTextArea list) {
        if (ventacola.size() > 0) {
            Venta e = ventacola.getLast();
            ventacola.remove(ventacola.size() - 1);
            if (ventacola.isEmpty()) {
                codvf1 = 0;
            } else {
                codvf1 = ventacola.getLast().getCodv();
            }
            return e;
        } else {
            System.out.println("Sin ventas");
            return null;
        }
    }

    public void CambiarDetalle() {
        Venta us = buscar(ventas, codv);
        if (us != null) {
            us.setEstado(estado);
        }
    }

    public static Venta buscar(LinkedList<Venta> ventas, int data) {
        for (Venta item : ventas) {
            if (item.getCodv() == data) {
                return item;
            }
        }
        return null;
    }
    
    public static Producto buscarp(LinkedList<Producto> productos, String data) {
        for (Producto item : productos) {
            if (item.getCodproducto().equals(data)) {
                return item;
            }
        }
        return null;
    }

    public void ini() {
        if (ventacola.isEmpty()) {
            codv1 = 0;
            codvf1 = 0;
        } else {
            codv1 = ventacola.getFirst().getCodv();
            codvf1 = ventacola.getLast().getCodv();
        }
    }

    public void controlca(){
        Producto us = buscarp(ProductoLog.productos, codproducto);
        if (us != null) {
            cantidadc=us.getCantidad();
        }
    }

    public static int getCantidadc() {
        return cantidadc;
    }

    public static void setCantidadc(int cantidadc) {
        VentaLog.cantidadc = cantidadc;
    }
    
    
    public static int getCodvf1() {
        return codvf1;
    }

    public static void setCodvf1(int codvf1) {
        VentaLog.codvf1 = codvf1;
    }

    public static int getCodv1() {
        return codv1;
    }

    public static void setCodv1(int codv1) {
        VentaLog.codv1 = codv1;
    }

    public int getCodc() {
        return codc;
    }

    public void setCodc(int codc) {
        this.codc = codc;
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
