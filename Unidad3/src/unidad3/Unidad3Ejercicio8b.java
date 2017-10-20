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
public class Unidad3Ejercicio8b {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num;
        
        System.out.println("Programa para identificar números primos."
                + " \nIntroduce un número entero: ");
        num = scanner.nextInt();
        
        if (num%2 == 0){
            System.out.println("No es primo");
        }
        else {
            if (num%5 == 0){
                System.out.println("No es primo");
            }
            else {
                System.out.println("El número " + num + " es primo");            }
            
        }    
                
                
    }
}
