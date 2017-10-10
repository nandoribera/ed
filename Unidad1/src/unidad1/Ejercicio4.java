/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;

import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Ejercicio4 {
    public static void main (String[] args) {
        int primerNum = Integer.parseint(0);
        System.out.println("Introduce el primer número:");
        Scanner primerNum = new Scanner(System.in);
        int segundoNum;
        System.out.println("Introduce el segundo número:");	
        Scanner segundoNum = new Scanner(System.in);
        int resultado;
        resultado = primerNum + segundoNum;
        System.out.println("La suma es " + primerNum + " + " + segundoNum + 
                " = " + resultado);
        
    }
}
