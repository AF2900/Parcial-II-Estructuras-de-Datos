package co.edu.uniquindio.poo.Punto1;

import co.edu.uniquindio.poo.Punto1.EjercicioPunto1;
import co.edu.uniquindio.poo.Punto1.EstadoOperacion;
import co.edu.uniquindio.poo.Punto1.Operacion;
import co.edu.uniquindio.poo.Punto1.Pila;

public class Main {

    public static void main(String[] args) {

        Pila<Operacion> historial = new Pila<>();

        historial.push(
                new Operacion(
                        "O1",
                        EstadoOperacion.ANULADA
                )
        );

        historial.push(
                new Operacion(
                        "O2",
                        EstadoOperacion.CONFIRMADA
                )
        );

        historial.push(
                new Operacion(
                        "O3",
                        EstadoOperacion.CONFIRMADA
                )
        );

        historial.push(
                new Operacion(
                        "O4",
                        EstadoOperacion.ANULADA
                )
        );

        historial.push(
                new Operacion(
                        "O5",
                        EstadoOperacion.CONFIRMADA
                )
        );
        System.out.println(
                "HISTORIAL ORIGINAL:"
        );

        historial.imprimir();

        System.out.println(
                "\nCASO 1 - n = 2"
        );

        System.out.println(
                "ULTIMAS CONFIRMADAS:"
        );

        Pila<Operacion> resultado =
                EjercicioPunto1.obtenerUltimasConfirmadas(
                        historial,
                        2
                );

        resultado.imprimir();

        System.out.println(
                "\nCASO 2 - n = 0"
        );

        System.out.println(
                "Debe retornar una pila vacia:"
        );

        Pila<Operacion> resultadoCero =
                EjercicioPunto1.obtenerUltimasConfirmadas(
                        historial,
                        0
                );

        if (resultadoCero.isEmpty()) {

            System.out.println(
                    "Pila vacia"
            );

        } else {

            resultadoCero.imprimir();
        }

        System.out.println(
                "\nCASO 3 - n = 10"
        );

        System.out.println(
                "Solo existen 3 operaciones confirmadas:"
        );

        Pila<Operacion> resultadoMayor =
                EjercicioPunto1.obtenerUltimasConfirmadas(
                        historial,
                        10
                );

        resultadoMayor.imprimir();

        System.out.println(
                "\nHISTORIAL ORIGINAL DESPUES DE LAS PRUEBAS:"
        );

        historial.imprimir();
    }
}