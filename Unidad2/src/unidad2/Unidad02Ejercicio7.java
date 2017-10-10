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
public class Unidad02Ejercicio7 {
    public static void main(String[] args) {
        double inversion = 2000;
        double interes = 2.75;
        double interesMensual= inversion * 2.75 / 100 /12;
        double plazoFijo = interesMensual * 6;
        double retencion = plazoFijo * 18 /100 ;
        double total = plazoFijo - retencion;
        System.out.println(total);
        
        
    }
    
}
