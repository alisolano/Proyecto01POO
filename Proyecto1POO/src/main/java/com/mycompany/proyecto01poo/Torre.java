package com.mycompany.proyecto01poo;

public class Torre extends Ficha {
    public Torre() {
        super();
    }
    
    @Override
    public boolean validarMovimiento(int casillaInicial, int casillaFinal) { 
        return Math.abs(casillaFinal - casillaInicial) % 8 == 0 || Math.abs(casillaFinal - casillaInicial) <= 7;
    }   
}
