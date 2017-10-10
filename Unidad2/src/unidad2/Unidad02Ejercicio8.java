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
public class Unidad02Ejercicio8 {
    public static void main(String[] args) {
        double inversion = 2000;
        double interes = 2.75;
        double interesMensual= inversion * 2.75 / 100 /12;
        System.out.println("calculando interés mensual:");
        System.out.print(interesMensual);
        System.out.println("%");
        double plazoFijo = interesMensual * 6;
        System.out.println("calculando intereses a 6 meses:");
        System.out.print(plazoFijo);
        System.out.println("€");
        double retencion = plazoFijo * 18 /100 ;
        System.out.println("Calculando el 18% correspondiente a retención:");
        System.out.print(retencion);
        System.out.println("€");
        System.out.println("Calculando el total de intereses menos retención:");
        double total = plazoFijo - retencion;
        System.out.println("Total intereses a 6 meses:");
        System.out.print(total);
        System.out.println("€");
    }
}
