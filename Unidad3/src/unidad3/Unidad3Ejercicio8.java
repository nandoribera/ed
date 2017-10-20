/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Unidad3Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar fecha = new GregorianCalendar();
        int diaAct, diaNac;
        int mesAct, mesNac;
        int añoAct, añoNac;
        
        System.out.println("Introduce la fecha de tu nacimiento: ");
        diaNac = scanner.nextInt();
        scanner.nextLine();
        mesNac = scanner.nextInt();
        scanner.nextLine();
        añoNac = scanner.nextInt();
        scanner.nextLine();
        diaAct = fecha.get(java.util.GregorianCalendar.DAY_OF_MONTH);
        mesAct = fecha.get(java.util.GregorianCalendar.MONTH);
        añoAct = fecha.get(java.util.GregorianCalendar.YEAR);
        System.out.println("Tu edad es:" );
        System.out.println("Años " + (añoAct - añoNac));
        System.out.println("Meses "+ (mesAct - mesNac));
        System.out.println("Dias " + (diaAct - diaNac));
                
    }
}
