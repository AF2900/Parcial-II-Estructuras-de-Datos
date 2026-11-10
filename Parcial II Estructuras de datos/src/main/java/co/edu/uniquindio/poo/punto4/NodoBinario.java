package co.edu.uniquindio.poo.punto4;

public class NodoBinario<T extends Comparable<T>> {
    private T dato;
    private NodoBinario<T> hijoIzquierdo;
    private NodoBinario<T> hijoDerecho;
    private NodoBinario<T> padre;

    public NodoBinario(T dato, NodoBinario<T> padre) {
        this.dato = dato;
        this.padre = padre;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoBinario<T> getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoBinario<T> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoBinario<T> getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoBinario<T> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public NodoBinario<T> getPadre() {
        return padre;
    }

    public void setPadre(NodoBinario<T> padre) {
        this.padre = padre;
    }
}
