package co.edu.uniquindio.poo.punto4;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n========================================");
        System.out.println("   PROBANDO PUNTO 4: Conteo en Rango ABB");
        System.out.println("========================================");

        ArbolBinarioBusqueda<Integer> arbol = new ArbolBinarioBusqueda<>();
        int[] valores = { 50, 30, 70, 20, 40, 60, 80, 55, 65 };
        for (int v : valores) {
            arbol.insertar(v);
        }

        int limInf = -40;
        int limSup = 6500;
        int cantidad = arbol.contarEquiposEnRango(limInf, limSup);

        System.out.println("Equipos: " + java.util.Arrays.toString(valores));

        System.out.println("Cantidad de equipos en el rango [" + limInf + ", " + limSup + "]: " + cantidad);
    }
}
