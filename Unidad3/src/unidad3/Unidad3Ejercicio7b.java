/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.Scanner;

/**
 *
 * @author nando
 */
public class Unidad3Ejercicio7b {
    public static void main(String[] args) {
        
        System.out.println("Calcular Potencias de dos números enteros A y B");
        
        Scanner scanner = new Scanner(System.in);
        
        int A, B;
        
        System.out.println("Introduce un número A: ");
        A = scanner.nextInt();
        
        System.out.println("Introduce un número B par potencia de A = A^B: ");
        B = scanner.nextInt();
        
        System.out.println("Resultado de " + A + " elevado a " + B +" = " + Math.pow(A,B));
    }
}
