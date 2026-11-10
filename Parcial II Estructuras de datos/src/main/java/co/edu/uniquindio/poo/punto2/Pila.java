package co.edu.uniquindio.poo.punto2;

public class Pila<T> {

    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo<T> cima;
    private int tamanio;

    public Pila() {
        this.cima = null;
        this.tamanio = 0;
    }

    public boolean esVacia() {
        return this.cima == null;
    }

    public void apilar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.siguiente = this.cima;
        this.cima = nuevo;
        this.tamanio++;
    }

    public T desapilar() {
        if (esVacia()) {
            return null;
        }
        T datoAux = this.cima.dato;
        this.cima = this.cima.siguiente;
        this.tamanio--;
        return datoAux;
    }

    public T verTope() {
        if (esVacia()) {
            return null;
        }
        return this.cima.dato;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public Pila<T> clone() {
        Pila<T> pilaAuxiliar = new Pila<>();
        Pila<T> pilaClon = new Pila<>();

        Nodo<T> actual = this.cima;
        while (actual != null) {
            pilaAuxiliar.apilar(actual.dato);
            actual = actual.siguiente;
        }

        while (!pilaAuxiliar.esVacia()) {
            pilaClon.apilar(pilaAuxiliar.desapilar());
        }

        return pilaClon;
    }
}
