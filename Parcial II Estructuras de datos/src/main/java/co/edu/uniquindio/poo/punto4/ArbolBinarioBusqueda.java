package co.edu.uniquindio.poo.punto4;

public class ArbolBinarioBusqueda<T extends Comparable<T>> {
    private NodoBinario<T> raiz;
    private int peso;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
        this.peso = 0;
    }

    public NodoBinario<T> getRaiz() {
        return raiz;
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public void insertar(T dato) {
        raiz = insertarRecursivo(raiz, dato, null);
    }

    private NodoBinario<T> insertarRecursivo(NodoBinario<T> raizAux, T dato, NodoBinario<T> padre) {
        if (raizAux == null) {
            peso++;
            return new NodoBinario<>(dato, padre);
        }

        int cmp = raizAux.getDato().compareTo(dato);
        if (cmp > 0) {
            raizAux.setHijoIzquierdo(insertarRecursivo(raizAux.getHijoIzquierdo(), dato, raizAux));
        } else if (cmp < 0) {
            raizAux.setHijoDerecho(insertarRecursivo(raizAux.getHijoDerecho(), dato, raizAux));
        }

        return raizAux;
    }

    public int contarEquiposEnRango(T limInf, T limSup) {
        return contarEquiposEnRangoRecursivo(this.raiz, limInf, limSup);
    }

    private int contarEquiposEnRangoRecursivo(NodoBinario<T> nodo, T limInf, T limSup) {
        if (nodo == null || limInf.compareTo(limSup) > 0) {
            return 0;
        }

        int cmpInf = nodo.getDato().compareTo(limInf);
        int cmpSup = nodo.getDato().compareTo(limSup);

        if (cmpInf < 0) {
            return contarEquiposEnRangoRecursivo(nodo.getHijoDerecho(), limInf, limSup);
        }

        if (cmpSup > 0) {
            return contarEquiposEnRangoRecursivo(nodo.getHijoIzquierdo(), limInf, limSup);
        }

        return 1 + contarEquiposEnRangoRecursivo(nodo.getHijoIzquierdo(), limInf, limSup)
                + contarEquiposEnRangoRecursivo(nodo.getHijoDerecho(), limInf, limSup);
    }
}
