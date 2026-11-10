package co.edu.uniquindio.poo.punto2;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   PROBANDO PUNTO 2: Segmento de Pila");
        System.out.println("========================================");

        Pila<Accion> historialOriginal = new Pila<>();
        historialOriginal.apilar(new Accion("A1", "Escribir texto"));
        historialOriginal.apilar(new Accion("A2", "Borrar palabra"));
        historialOriginal.apilar(new Accion("A3", "Copiar"));
        historialOriginal.apilar(new Accion("A4", "Pegar"));
        historialOriginal.apilar(new Accion("A5", "Deshacer"));
        historialOriginal.apilar(new Accion("A6", "Guardar"));

        System.out.println("Pila Historial Original (Cima -> Fondo):");
        Pila<Accion> tempOriginal = historialOriginal.clone();
        while (!tempOriginal.esVacia()) {
            Accion a = tempOriginal.desapilar();
            System.out.println(" - " + a.getCodigo() + ": " + a.getDescripcion());
        }

        System.out.println("----------------------------------------");

        int inicio = 2;
        int fin = 4;

        GestorHistorial gestor = new GestorHistorial();
        Pila<Accion> segmento = gestor.obtenerSegmento(historialOriginal, inicio, fin);

        System.out.println(
                "Mostrando el segmento obtenido para Inicio = " + inicio + " al Fin = " + fin + " (Cima -> Fondo):");
        while (!segmento.esVacia()) {
            Accion a = segmento.desapilar();
            System.out.println(" - " + a.getCodigo() + ": " + a.getDescripcion());
        }

    }
}
