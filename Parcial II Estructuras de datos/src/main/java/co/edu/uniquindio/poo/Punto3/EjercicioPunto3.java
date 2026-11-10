package co.edu.uniquindio.poo.Punto3;

public class EjercicioPunto3 {

    public static Cola<Solicitud> seleccionarSolicitudes(
            Cola<Solicitud> pendientes,
            int minutosDisponibles) {

        Cola<Solicitud> seleccionadas =
                new Cola<>(
                        pendientes.getSize()
                );


        if (minutosDisponibles <= 0) {

            return seleccionadas;
        }


        // ---------------------------------------------
        // PRIMER RECORRIDO:
        // Solicitudes de prioridad ALTA
        // ---------------------------------------------

        int cantidad =
                pendientes.getSize();


        for (int i = 0;
             i < cantidad;
             i++) {

            Solicitud solicitud =
                    pendientes.desencolar();


            if (solicitud.getPrioridad()
                    == Prioridad.ALTA
                    &&
                    solicitud.getDuracion()
                            <= minutosDisponibles) {


                seleccionadas.encolar(
                        solicitud
                );


                minutosDisponibles -=
                        solicitud.getDuracion();

            } else {

                pendientes.encolar(
                        solicitud
                );
            }
        }


        // ---------------------------------------------
        // SEGUNDO RECORRIDO:
        // Solicitudes de prioridad NORMAL
        // ---------------------------------------------

        cantidad =
                pendientes.getSize();


        for (int i = 0;
             i < cantidad;
             i++) {

            Solicitud solicitud =
                    pendientes.desencolar();


            if (solicitud.getPrioridad()
                    == Prioridad.NORMAL
                    &&
                    solicitud.getDuracion()
                            <= minutosDisponibles) {


                seleccionadas.encolar(
                        solicitud
                );


                minutosDisponibles -=
                        solicitud.getDuracion();

            } else {

                pendientes.encolar(
                        solicitud
                );
            }
        }


        return seleccionadas;
    }
}