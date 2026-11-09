package co.edu.uniquindio.poo.Punto1;

public class Pila<T> {

    private int size;
    private Nodo<T> cima;

    public Pila() {
        size = 0;
        cima = null;
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public void push(T dato) {

        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (isEmpty()) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cima);
            cima = nuevoNodo;
        }

        size++;
    }

    public T pop() {

        if (cima == null) {
            throw new RuntimeException(
                    "No hay elementos en la pila"
            );
        }

        T dato = cima.getDato();

        cima = cima.getSiguiente();

        size--;

        return dato;
    }

    public int getSize() {
        return size;
    }

    public void imprimir() {

        Nodo<T> auxiliar = cima;

        while (auxiliar != null) {

            System.out.println(
                    auxiliar.getDato()
            );

            auxiliar =
                    auxiliar.getSiguiente();
        }
    }

    @Override
    public Pila<T> clone() {

        Pila<T> pilaAuxiliar =
                new Pila<>();

        Pila<T> pilaClon =
                new Pila<>();

        Nodo<T> actual =
                cima;

        while (actual != null) {

            pilaAuxiliar.push(
                    actual.getDato()
            );

            actual =
                    actual.getSiguiente();
        }

        while (!pilaAuxiliar.isEmpty()) {

            pilaClon.push(
                    pilaAuxiliar.pop()
            );
        }

        return pilaClon;
    }
}