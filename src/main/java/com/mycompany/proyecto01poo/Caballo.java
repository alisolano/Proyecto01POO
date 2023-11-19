package com.mycompany.proyecto01poo;

public class Caballo extends Ficha {
    public Caballo(String nombre, boolean disponibilidad, Ficha actualFicha) {
        super(nombre, disponibilidad, actualFicha);
    }
    
    @Override
    public boolean validarMovimiento(int casillaInicial, int casillaFinal) {
       return Math.abs(casillaFinal - casillaInicial) == 6 ||
              Math.abs(casillaFinal - casillaInicial) == 10||
              Math.abs(casillaFinal - casillaInicial) == 15||
              Math.abs(casillaFinal - casillaInicial) == 17;
    
    }
}
