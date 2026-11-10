package co.edu.uniquindio.poo.punto2;

public class GestorHistorial {

    public Pila<Accion> obtenerSegmento(Pila<Accion> pilaOriginal, int inicio, int fin) {
        if (pilaOriginal == null) {
            return new Pila<>();
        }

        Pila<Accion> clon = pilaOriginal.clone();

        Pila<Accion> pilaInvertida = new Pila<>();
        int tamanio = 0;
        while (!clon.esVacia()) {
            pilaInvertida.apilar(clon.desapilar());
            tamanio++;
        }

        if (inicio < 1 || inicio > fin || fin > tamanio) {
            return new Pila<>();
        }

        Pila<Accion> resultadoFinal = new Pila<>();
        int posicionActual = tamanio;

        while (!pilaInvertida.esVacia()) {
            Accion acc = pilaInvertida.desapilar();

            if (posicionActual >= inicio && posicionActual <= fin) {
                resultadoFinal.apilar(acc);
            }

            posicionActual--;
        }

        return resultadoFinal;
    }
}

