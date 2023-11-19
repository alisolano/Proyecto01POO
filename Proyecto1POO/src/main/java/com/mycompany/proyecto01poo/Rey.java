package com.mycompany.proyecto01poo;

public class Rey extends Ficha {
    public Rey() {
        super();
    }
    
    @Override
    public boolean validarMovimiento(int casillaInicial, int casillaFinal) { 
        return Math.abs(casillaFinal - casillaInicial) <= 9;         
    }   
}

