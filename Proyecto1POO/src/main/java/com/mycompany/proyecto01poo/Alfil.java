package com.mycompany.proyecto01poo;

public class Alfil extends Ficha {
    public Alfil () {
        super();
    }
    
    @Override
    public boolean validarMovimiento(int casillaInicial, int casillaFinal) { 
        return Math.abs(casillaFinal - casillaInicial) % 9 == 0 || 
               Math.abs(casillaFinal - casillaInicial) % 7 == 0;
    }   
}
