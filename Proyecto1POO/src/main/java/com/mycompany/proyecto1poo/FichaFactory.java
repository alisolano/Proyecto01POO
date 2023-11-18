/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1poo;

/**
 *
 * @author JP113
 */
public class FichaFactory implements Factory {
    @Override
    public Ficha crearFicha() {
        // Puedes implementar la lógica para crear instancias específicas de Ficha
        // Por ejemplo, puedes usar un método que devuelva una subclase de Ficha
       return new Peon();
    }
}
