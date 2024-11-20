/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.LinkedList;
import javax.swing.JTextArea;

/**
 *
 * @author INFORMATICA
 */
public class ComidaLog {

    public static int u = 0,cantidad;
    public static boolean a,b;
    public static String codComida, plato;
    public static double pg=0;
    //nuevo
    public static LinkedList<Comida> comidas = new LinkedList<>(
            Arrays.asList(
                    new Comida("K1", "KFC", "Wrap Combo", 49.99),
                    new Comida("K2", "KFC", "Mega Promo", 59.99),
                    new Comida("K3", "KFC", "Mega Futbolero", 69.99),
                    new Comida("M1", "MAGD", "Banquete Power", 58.99),
                    new Comida("M2", "MAGD", "Mc Melt", 46.99),
                    new Comida("M3", "MAGD", "Big Mac", 51.99),
                    new Comida("CH1", "CHINAW", "Arroz frito", 18.99),
                    new Comida("CH2", "CHINAW", "Aereopuerto", 25.99),
                    new Comida("CH3", "CHINAW", "Taipan", 16.99)));

    public static LinkedList<Comida> comidap = new LinkedList<>();
    public static LinkedList<Comida> comidac = new LinkedList<>();
    
    //listar carrito
    public void listar2(JTextArea list) {
        list.setText("LISTA DE COMIDAS\n");
        for (Comida item : comidac) {
            list.append("\n" + item);

        }
    }
    //listar comidas API
    public void listar1(JTextArea list) {
        list.setText("LISTA DE COMIDAS\n");
        for (Comida item : comidas) {
            list.append("\n" + item);

        }
    }

    //LIstar Comida al Publico
    public void listar(JTextArea list) {
        list.setText("LISTA DE COMIDAS\n");
        for (Comida item : comidap) {
            list.append("\n" + item);

        }
    }

    //buscar por codigo comida
    public static Comida buscar(LinkedList<Comida> comidas, String data) {
        for (Comida item : comidas) {
            if (item.getCodplato().equals(data)) {
                return item;
            }
        }
        return null;
    }

    //agregar escoger comidas de la API
    public void AgregarComida() {
        Comida info = buscar(comidas, codComida);
        Comida en = new Comida(info.getCodplato(),
                info.getEmpresa(), info.getDetalle(), info.getPrecio());
        comidap.addLast(en);
        comidas.remove(info);
    }
    
    public void AgregarComidaC() {
        Comida info = buscar(comidap, codComida);
        Comida en = new Comida(info.getCodplato(),
                info.getEmpresa(), info.getDetalle(), info.getPrecio());
        comidac.addLast(en);
    }
    
    
    //Eliminar comidas de la Lista Mantenimiento
    public void EliminarComida() {
        Comida info = buscar(comidap, codComida);
        Comida en = new Comida(info.getCodplato(),
                info.getEmpresa(), info.getDetalle(), info.getPrecio());
        comidas.addLast(en);
        comidap.remove(info);
    }
    //Eliminar comidas de la Lista Carrito
    public void EliminarComidaC() {
        Comida info = buscar(comidac, codComida);
        comidac.remove(info);
    }
    //Elimina todo el carrito
    public void EliminarT(){
        comidac.clear();
    }
    
    public void comparadorComida() {
        a = false;
        for (Comida item : comidas) {
            if (item.getCodplato().equals(plato)) {
                a = true;
                break;
            }
        }
    }
    public void comparadorComidaP() {
        a = false;
        for (Comida item : comidap) {
            if (item.getCodplato().equals(plato)) {
                a = true;
                break;
            }
        }
    }
    public void comparadorComidaC() {
        a = false;
        for (Comida item : comidac) {
            if (item.getCodplato().equals(plato)) {
                a = true;
                break;
            }
        }
    }
    public void Pago(){
        pg=0;
        for (Comida item : comidac) {
            pg=pg+item.getPrecio();
        }
        
    }
    
    //validacion si hay al menos carrito
    public void ValidadorC(){
        b=!comidac.isEmpty();
    }
    
    //GET & SET de la CLase
    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        ComidaLog.cantidad = cantidad;
    }
    public static String getCodComida() {
        return codComida;
    }

    public static void setCodComida(String codComida) {
        ComidaLog.codComida = codComida;
    }

    public static boolean isA() {
        return a;
    }

    public static void setA(boolean a) {
        ComidaLog.a = a;
    }

    public static String getPlato() {
        return plato;
    }

    public static void setPlato(String plato) {
        ComidaLog.plato = plato;
    }

    public static LinkedList<Comida> getComidac() {
        return comidac;
    }

    public static void setComidac(LinkedList<Comida> comidac) {
        ComidaLog.comidac = comidac;
    }

    public static double getPg() {
        return pg;
    }

    public static void setPg(double pg) {
        ComidaLog.pg = pg;
    }

    public static boolean isB() {
        return b;
    }

    public static void setB(boolean b) {
        ComidaLog.b = b;
    }

    
    
    
}
