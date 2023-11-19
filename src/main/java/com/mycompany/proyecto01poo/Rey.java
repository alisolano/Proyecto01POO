package com.mycompany.proyecto01poo;

public class Rey extends Ficha {
    public Rey(String nombre, boolean disponibilidad, Ficha actualFicha) {
        super(nombre, disponibilidad, actualFicha);
    }
    
    @Override
    public boolean validarMovimiento(int casillaInicial, int casillaFinal) { 
        return Math.abs(casillaFinal - casillaInicial) <= 9;         
    }   
}

