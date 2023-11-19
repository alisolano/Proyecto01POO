package com.mycompany.proyecto01poo;

public class Alfil extends Ficha {
    public Alfil (String nombre, boolean disponibilidad, Ficha actualFicha) {
        super(nombre, disponibilidad, actualFicha);
    }
    
    @Override
    public boolean validarMovimiento(int casillaInicial, int casillaFinal) { 
        return Math.abs(casillaFinal - casillaInicial) % 9 == 0 || 
               Math.abs(casillaFinal - casillaInicial) % 7 == 0;
    }   
}
