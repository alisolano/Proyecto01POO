/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1poo;

import static com.mycompany.proyecto1poo.Tablero.tablero;
import java.awt.event.ActionEvent;
import GUI.VistaTablero;


/**
 *
 * @author JP113
 */
public class Ajedrez {
    private static Ajedrez instancia = null;
    private Factory factory;
    private Tablero tablero;
    private char turnoJugador = 'A';

    private Ajedrez() {
        // Puedes inicializar el factory aquí o pasarlo como parámetro al constructor
        this.factory = new FichaFactory();
        this.tablero = new Tablero();
        tablero.iniciarTablero();
        VistaTablero vista = new VistaTablero();
        vista.setVisible(true);
        //añadirActionEvents();
        //movimientos = new Movimientos();
    }
    
    // Método para obtener la instancia única de Ajedrez
    public static Ajedrez obtenerInstancia() {
        if (instancia == null) {
            instancia = new Ajedrez();
        }
        return instancia;
    }
    
    //La instancia del singleton se obtendra de la siguiente manera: Ajedrez juegoDeAjedrez = Ajedrez.obtenerInstancia();
    
    
    //@Override
    public void actionPerformed(ActionEvent ae) {

    }
    
    private String getBotonPosicionString(Object boton) {
        if (boton == VistaTablero.c00) {
            return "00";
        } else if (boton == VistaTablero.c01) {
            return "01";
        } else if (boton == VistaTablero.c02) {
            return "02";
        } else if (boton == VistaTablero.c03) {
            return "03";
        } else if (boton == VistaTablero.c04) {
            return "04";
        } else if (boton == VistaTablero.c05) {
            return "05";
        } else if (boton == VistaTablero.c06) {
            return "06";
        } else if (boton == VistaTablero.c07) {
            return "07";
        } else if (boton == VistaTablero.c10) {
            return "10";
        } else if (boton == VistaTablero.c11) {
            return "11";
        } else if (boton == VistaTablero.c12) {
            return "12";
        } else if (boton == VistaTablero.c13) {
            return "13";
        } else if (boton == VistaTablero.c14) {
            return "14";
        } else if (boton == VistaTablero.c15) {
            return "15";
        } else if (boton == VistaTablero.c16) {
            return "16";
        } else if (boton == VistaTablero.c17) {
            return "17";
        } else if (boton == VistaTablero.c20) {
            return "20";
        } else if (boton == VistaTablero.c21) {
            return "21";
        } else if (boton == VistaTablero.c22) {
            return "22";
        } else if (boton == VistaTablero.c23) {
            return "23";
        } else if (boton == VistaTablero.c24) {
            return "24";
        } else if (boton == VistaTablero.c25) {
            return "25";
        } else if (boton == VistaTablero.c26) {
            return "26";
        } else if (boton == VistaTablero.c27) {
            return "27";
        } else if (boton == VistaTablero.c30) {
            return "30";
        } else if (boton == VistaTablero.c31) {
            return "31";
        } else if (boton == VistaTablero.c32) {
            return "32";
        } else if (boton == VistaTablero.c33) {
            return "33";
        } else if (boton == VistaTablero.c34) {
            return "34";
        } else if (boton == VistaTablero.c35) {
            return "35";
        } else if (boton == VistaTablero.c36) {
            return "36";
        } else if (boton == VistaTablero.c37) {
            return "37";
        } else if (boton == VistaTablero.c40) {
            return "40";
        } else if (boton == VistaTablero.c41) {
            return "41";
        } else if (boton == VistaTablero.c42) {
            return "42";
        } else if (boton == VistaTablero.c43) {
            return "43";
        } else if (boton == VistaTablero.c44) {
            return "44";
        } else if (boton == VistaTablero.c45) {
            return "45";
        } else if (boton == VistaTablero.c46) {
            return "46";
        } else if (boton == VistaTablero.c47) {
            return "47";
        } else if (boton == VistaTablero.c50) {
            return "50";
        } else if (boton == VistaTablero.c51) {
            return "51";
        } else if (boton == VistaTablero.c52) {
            return "52";
        } else if (boton == VistaTablero.c53) {
            return "53";
        } else if (boton == VistaTablero.c54) {
            return "54";
        } else if (boton == VistaTablero.c55) {
            return "55";
        } else if (boton == VistaTablero.c56) {
            return "56";
        } else if (boton == VistaTablero.c57) {
            return "57";
        } else if (boton == VistaTablero.c60) {
            return "60";
        } else if (boton == VistaTablero.c61) {
            return "61";
        } else if (boton == VistaTablero.c62) {
            return "62";
        } else if (boton == VistaTablero.c63) {
            return "63";
        } else if (boton == VistaTablero.c64) {
            return "64";
        } else if (boton == VistaTablero.c65) {
            return "65";
        } else if (boton == VistaTablero.c66) {
            return "66";
        } else if (boton == VistaTablero.c67) {
            return "67";
        } else if (boton == VistaTablero.c70) {
            return "70";
        } else if (boton == VistaTablero.c71) {
            return "71";
        } else if (boton == VistaTablero.c72) {
            return "72";
        } else if (boton == VistaTablero.c73) {
            return "73";
        } else if (boton == VistaTablero.c74) {
            return "74";
        } else if (boton == VistaTablero.c75) {
            return "75";
        } else if (boton == VistaTablero.c76) {
            return "76";
        } else if (boton == VistaTablero.c77) {
            return "77";
        }
        return null;
    }
}
