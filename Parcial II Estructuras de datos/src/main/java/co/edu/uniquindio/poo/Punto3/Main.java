package co.edu.uniquindio.poo.Punto3;

import co.edu.uniquindio.poo.Punto3.Cola;
import co.edu.uniquindio.poo.Punto3.EjercicioPunto3;
import co.edu.uniquindio.poo.Punto3.Prioridad;
import co.edu.uniquindio.poo.Punto3.Solicitud;

public class Main {

    public static void main(String[] args) {

        Cola<Solicitud> pendientes =
                new Cola<>(10);


        pendientes.encolar(
                new Solicitud(
                        "S1",
                        Prioridad.NORMAL,
                        10
                )
        );


        pendientes.encolar(
                new Solicitud(
                        "S2",
                        Prioridad.ALTA,
                        30
                )
        );


        pendientes.encolar(
                new Solicitud(
                        "S3",
                        Prioridad.ALTA,
                        15
                )
        );


        pendientes.encolar(
                new Solicitud(
                        "S4",
                        Prioridad.NORMAL,
                        5
                )
        );


        System.out.println(
                "SOLICITUDES PENDIENTES ANTES:"
        );

        pendientes.imprimir();


        Cola<Solicitud> seleccionadas =
                EjercicioPunto3
                        .seleccionarSolicitudes(
                                pendientes,
                                25
                        );


        System.out.println(
                "\nSOLICITUDES SELECCIONADAS:"
        );

        seleccionadas.imprimir();


        System.out.println(
                "\nSOLICITUDES PENDIENTES DESPUES:"
        );

        pendientes.imprimir();


        // ---------------------------------------------
        // PRUEBA CON TIEMPO IGUAL A CERO
        // ---------------------------------------------

        Cola<Solicitud> pruebaCero =
                new Cola<>(5);


        pruebaCero.encolar(
                new Solicitud(
                        "S1",
                        Prioridad.NORMAL,
                        10
                )
        );


        pruebaCero.encolar(
                new Solicitud(
                        "S2",
                        Prioridad.ALTA,
                        30
                )
        );


        Cola<Solicitud> seleccionadasCero =
                EjercicioPunto3
                        .seleccionarSolicitudes(
                                pruebaCero,
                                0
                        );


        System.out.println(
                "\nPRUEBA CON 0 MINUTOS:"
        );


        if (seleccionadasCero.getSize()
                == 0) {

            System.out.println(
                    "Cola de seleccionadas vacia"
            );
        }


        System.out.println(
                "\nPENDIENTES DESPUES DE LA PRUEBA:"
        );

        pruebaCero.imprimir();
    }
}