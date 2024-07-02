/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author GHOSTSOFT
 */
public class Cliente {
    private int codigo;
    private String nombre;
    private String cliente;
    private String contrasenia;
    private int edad;

    public Cliente(int codigo, String nombre, String cliente, String contrasenia, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cliente = cliente;
        this.contrasenia = contrasenia;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", nombre=" + nombre + ", cliente=" + cliente + ", contrasenia=" + contrasenia + ", edad=" + edad + '}';
    } 
    
}
