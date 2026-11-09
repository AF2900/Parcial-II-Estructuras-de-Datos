package co.edu.uniquindio.poo.Punto1;

public class Operacion {

    private String codigo;
    private EstadoOperacion estado;

    public Operacion(String codigo, EstadoOperacion estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public EstadoOperacion getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return codigo + " - " + estado;
    }
}