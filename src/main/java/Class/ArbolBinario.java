/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author GHOSTSOFT
 */
public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void agregarUsuario(Usuario usuario) {
        raiz = agregarRecursivo(raiz, usuario);
    }

    private Nodo agregarRecursivo(Nodo actual, Usuario usuario) {
        if (actual == null) {
            return new Nodo(usuario);
        }

        if (usuario.getCodigo() < actual.getUsuario().getCodigo()) {
            actual.setIzquierda(agregarRecursivo(actual.getIzquierda(), usuario));
        } else if (usuario.getCodigo() > actual.getUsuario().getCodigo()) {
            actual.setDerecha(agregarRecursivo(actual.getDerecha(), usuario));
        } else {
            // ID ya existe, no se agrega el usuario
            return actual;
        }

        return actual;
    }

    public void recorrerInOrden() {
        recorrerInOrdenRecursivo(raiz);
    }

    private void recorrerInOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            recorrerInOrdenRecursivo(nodo.getIzquierda());
            System.out.println(nodo.getUsuario());
            recorrerInOrdenRecursivo(nodo.getDerecha());
        }
    }
}
