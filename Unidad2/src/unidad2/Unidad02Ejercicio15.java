/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author ferviu
 */
public class Unidad02Ejercicio15 {
    public enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES,
        VIERNES, SABADO, DOMINGO}
    public static void main(String[] args) {
        DiaSemana martes = DiaSemana.MARTES;
        DiaSemana domingo = DiaSemana.DOMINGO;
        System.out.println("Hoy es " + martes + 
                " Y el último dia de la semana es " + domingo + ".");
    }
    
}
