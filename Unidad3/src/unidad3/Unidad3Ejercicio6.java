/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Unidad3Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float dinero, centimos; 
        int cont200 = 0, cont100 = 0, cont50 = 0, 
            cont20 = 0, cont10 = 0, cont5 = 0, cont1 = 0;
        System.out.println("Introduce una cantidad en euros: ");
        dinero = scanner.nextFloat();
        //Se transforman los euros en centimos para simplificar la operación
        centimos = dinero * 100;
        while (centimos >=200){
        centimos = centimos - 200;
        cont200 = cont200 + 1;
        }
        while (centimos >=100){
        centimos = centimos - 100;
        cont100 = + 1;
        }
        while (centimos >=50){
        centimos = centimos - 50;
        cont50 = + 1;
        }
        while (centimos >=20){
        centimos = centimos - 20;
        cont20 = + 1;
        }
          while (centimos >=10){
        centimos = centimos - 10;
        cont10 = + 1;
        }
        while (centimos >=5){
        centimos = centimos - 5;
        cont5 = + 1;
        }
          while (centimos >=1){
        centimos = centimos - 1;
        cont1 = + 1;
        }
            System.out.println("El cambio es " + 
                    cont200 +" Monedas de 2€\n "+
                    "El cambio es " + 
                    cont100 +" Monedas de 1€\n "+
                    "El cambio es " + 
                    cont50 +" Monedas de 0,50€\n "+
                    "El cambio es " + 
                    cont20 +" Monedas de 0,20€\n "+
                    "El cambio es " + 
                    cont10 +" Monedas de 0,10€\n "+
                    "El cambio es " + 
                    cont5 +" Monedas de 0,5€\n "+
                    "El cambio es " + 
                    cont1 +" Monedas de 0,1€\n ");
    }
}
    
