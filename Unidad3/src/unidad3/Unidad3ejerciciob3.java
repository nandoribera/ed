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
public class Unidad3ejerciciob3 {
    public static void main(String[] args) {
        
        ArrayList contarMultip5 = new ArrayList();
        ArrayList contarPares = new ArrayList();
        ArrayList contarImpares = new ArrayList();
        
        int num = 1;
        int impares= 0;
        int pares = 0;
        int multiplos5 = 0;
        
        while (num < 100) {
            if (num%5 ==0) {
                multiplos5 = multiplos5 + 1;
                contarMultip5.add(num);
            }
            if (num%2 == 0) {
                    pares = pares + 1;
                    contarPares.add(num);
            }
            if (num%2 != 0) {
                    impares = impares +1;
                    contarImpares.add(num);
                }
            num = num +1;
        }
        
        System.out.println("Número total de pares de 1 a 99: " + pares);
        System.out.println("Números pares: " + contarPares);
        System.out.println("Número total de impares de 1 a 99: " + impares);
        System.out.println("Números impares: " + contarImpares);
        System.out.println("Número total de multiplos de 5 de 1 a 99: " + multiplos5);
        System.out.println("Números Multiplos de 5: " + contarMultip5);
    }
}
