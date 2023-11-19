package com.mycompany.proyecto01poo;

public class Reina extends Ficha { 
    public Reina (String nombre, boolean disponibilidad, Ficha actualFicha) {
        super(nombre, disponibilidad, actualFicha);
    }
    
    @Override
    public boolean validarMovimiento(int casillaInicial, int casillaFinal) { 
        return Math.abs(casillaFinal - casillaInicial) % 8 == 0 ||
               Math.abs(casillaFinal - casillaInicial) % 9 == 0 || 
               Math.abs(casillaFinal - casillaInicial) % 7 == 0 || 
               Math.abs(casillaFinal - casillaInicial) <= 7;
    }   
}
