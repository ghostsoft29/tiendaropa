/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.JTextArea;
import java.io.*;
import java.util.*;
/**
 *
 * @author GHOSTSOFT
 */
public class Grafo {

    public static Map<Usuario, LinkedList<Usuario>> adyacencia;

    public Grafo() {
        adyacencia = new HashMap<>();
    }

    public void agregarUsuario(Usuario usuario) {
        adyacencia.putIfAbsent(usuario, new LinkedList<>());
    }

    public void agregarRelacion(Usuario usuario1, Usuario usuario2) {
        adyacencia.putIfAbsent(usuario1, new LinkedList<>());
        adyacencia.putIfAbsent(usuario2, new LinkedList<>());
        adyacencia.get(usuario1).add(usuario2);
    }
    
    public void mostrarGrafo(JTextArea list) {
        list.setText("LISTA DE DEPENDENCIA\n");
        for (Usuario usuario1 : adyacencia.keySet()) {
            list.append(usuario1.getUsuario() + " -> ");
            for (Usuario adyacente : adyacencia.get(usuario1)) {
                list.append(adyacente.getUsuario() + " ");
            }
            list.append("\n");
        }
    }
}
