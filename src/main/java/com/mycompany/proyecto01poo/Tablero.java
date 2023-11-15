package com.mycompany.proyecto01poo;

public class Tablero {
    private Matriz casillas;
    private boolean casillaOcupada;
    private boolean turnoBlanca;

    public Tablero(Matriz casillas, boolean casillaOcupada, boolean turnoBlanca) {
        this.casillas = casillas;
        this.casillaOcupada = casillaOcupada;
        this.turnoBlanca = turnoBlanca;
    }

    public boolean getCasillaOcupada() {
        return casillaOcupada;
    }

    public void setCasillaOcupada(boolean casillaOcupada) {//el parametro deberia ser la casilla?
        this.casillaOcupada = casillaOcupada;
    }

    public boolean getTurnoBlanca() {
        return turnoBlanca;
    }

    public void setTurnoBlanca(boolean turnoBlanca) {
        this.turnoBlanca = turnoBlanca;
    }
    
    
}
