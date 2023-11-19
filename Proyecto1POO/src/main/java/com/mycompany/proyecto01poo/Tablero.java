package com.mycompany.proyecto01poo;

public class Tablero {
    
    
   public static String[][] tablero = new String[8][8];

    
   void iniciarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = "";
            }
        }

        for (int i = 0; i < 8; i++) {
            tablero[1][i] = "B_peon";
            tablero[6][i] = "A_peon";
        }

        tablero[0][0] = "B_torre";
        tablero[0][1] = "B_caballo";
        tablero[0][2] = "B_alfil";
        tablero[0][3] = "B_reina";
        tablero[0][4] = "B_rey";
        tablero[0][5] = "B_alfil";
        tablero[0][6] = "B_caballo";
        tablero[0][7] = "B_torre";

        tablero[7][0] = "A_torre";
        tablero[7][1] = "A_caballo";
        tablero[7][2] = "A_alfil";
        tablero[7][3] = "A_reina";
        tablero[7][4] = "A_rey";
        tablero[7][5] = "A_alfil";
        tablero[7][6] = "A_caballo";
        tablero[7][7] = "A_torre";
    }
    
    
    //private Matriz casillas;
    private boolean casillaOcupada;
    private boolean turnoBlanca;
    private Ficha fichas;

    public Tablero(boolean casillaOcupada, boolean turnoBlanca) {
       //this.casillas = casillas;
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
