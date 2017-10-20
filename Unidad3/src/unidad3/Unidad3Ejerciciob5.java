/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.ArrayList;

/**
 *
 * @author ferviu
 */
public class Unidad3Ejerciciob5 {
    public static void main(String[] args) {
        ArrayList contarPares = new ArrayList();
        ArrayList contarImpares = new ArrayList();
        ArrayList contarMultip4 = new ArrayList();
        ArrayList contarMultip7 = new ArrayList();
        
        int num = 1;
        int impares= 0;
        int pares = 0;
        int multip4 = 0;
        int multip7 = 0;
        int sumpar = 0;
        int sumimpar = 0;
        int summultip4 = 0;
        int summultip7 = 0;
        
        while (num <= 100) {
            if (num%4 ==0) {
                multip4 = multip4 + 1;
                contarMultip4.add(num);
                summultip4 = summultip4 + num;
            }
            if (num%7 == 0) {
                multip7 = multip7 +1;
                contarMultip7.add(num);
                summultip7 = summultip7 + num;
            }
            if (num%2 == 0) {
                pares = pares + 1;
                contarPares.add(num);
                sumpar = sumpar + num;
            }
            if (num%2 != 0) {
                    impares = impares +1;
                    contarImpares.add(num);
                    sumimpar = sumimpar + num;
            }
             num = num +1;
        }
        System.out.println("Número total de pares de 1 a 100: " + pares);
        System.out.println("Números pares: " + contarPares);
        System.out.println("La suma de los números pares de 1 a 100 es: " + sumpar);
        System.out.println("Número total de impares de 1 a 100: " + impares);
        System.out.println("Números impares: " + contarImpares);
        System.out.println("La suma de los números impares de 1 a 100 es: " + sumimpar);
        System.out.println("Número total de multiplos de 4 de 1 a 100: " + multip4);
        System.out.println("Números Multiplos de 4: " + contarMultip4);
        System.out.println("La suma de los números multiplos de 4 de 1 a 100 es: " + summultip4);
        System.out.println("Número total de multiplos de 7 de 1 a 100: " + multip7);
        System.out.println("Números Multiplos de 7: " + contarMultip7);
        System.out.println("La suma de los números pares de 1 a 100 es: " + summultip7);
   }
}

