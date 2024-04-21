/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author GHOSTSOFT
 */
public class Asignatura implements Comparable<Asignatura>{
    private String codigo;
    private int ciclo;
    private String nombre;
    private int creditos;

    public Asignatura(String codigo, int ciclo, String nombre, int creditos) {
        this.codigo = codigo;
        this.ciclo = ciclo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public Asignatura(String codigo) {
        this.codigo = codigo;
    }
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", ciclo=" + ciclo + ", nombre=" + nombre + ", creditos=" + creditos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Asignatura other = (Asignatura) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public int compareTo(Asignatura t) {
        return COMPARING_CODIGO.compare(this,t); 
    }
    private static final Comparator<Asignatura> COMPARING_CODIGO = Comparator.comparing(Asignatura::getCodigo);
    
    
}
