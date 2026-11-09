package co.edu.uniquindio.poo.Punto1;

public class EjercicioPunto1 {

    public static Pila<Operacion> obtenerUltimasConfirmadas(
            Pila<Operacion> historial,
            int n) {

        Pila<Operacion> resultado =
                new Pila<>();

        if (n <= 0) {
            return resultado;
        }

        Pila<Operacion> copia =
                historial.clone();

        Pila<Operacion> auxiliar =
                new Pila<>();

        int contador = 0;

        while (!copia.isEmpty()
                && contador < n) {

            Operacion operacion =
                    copia.pop();

            if (operacion.getEstado()
                    == EstadoOperacion.CONFIRMADA) {

                auxiliar.push(
                        operacion
                );

                contador++;
            }
        }

        while (!auxiliar.isEmpty()) {

            resultado.push(
                    auxiliar.pop()
            );
        }

        return resultado;
    }
}