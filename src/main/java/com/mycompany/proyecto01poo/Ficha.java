
package com.mycompany.proyecto01poo;

/**
 *
 * @author JP113
 */
public abstract class Ficha {
    private boolean disponibilidad;
    private Ficha fichaActual;
    private int posicionActual;
    private int nuevaPosicion;
    private Tablero tablero;

    // Constructor
    public Ficha(String nombre, boolean disponibilidad, Ficha actualFicha) {
        // Implementa tu lógica para inicializar la ficha
    }

    // Métodos getters y setters
    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Ficha getActualFicha() {
        return fichaActual;
    }

    public void setActualFicha(Ficha fichaActual) {
        this.fichaActual = fichaActual;
    }

    // Método abstracto para validar el movimiento, implementado por las subclases
    public abstract boolean validarMovimiento(int casillaInicial, int casillaFinal);
}