/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;

/**
 *
 * @author ferviu
 */
public class Semana {

    public enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES,
        VIERNES, SABADO, DOMINGO
    }

    public static void main( String[] args) {
        DiaSemana hoy
                = DiaSemana.VIERNES;
        DiaSemana ultimo
                = DiaSemana.DOMINGO;
        System.out.println("Hoy es " + hoy
                + "\n Y el ultimo dia es " + ultimo);
    }
}
