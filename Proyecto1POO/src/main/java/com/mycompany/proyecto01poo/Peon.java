package com.mycompany.proyecto01poo;

public class Peon extends Ficha {
    public Peon() {
        super();
    }
    
    @Override
    public boolean validarMovimiento(int casillaInicial, int casillaFinal) {
       return Math.abs(casillaFinal - casillaInicial) % 8 == 0;
    
    }

}



