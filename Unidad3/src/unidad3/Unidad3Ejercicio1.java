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
public class Unidad3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("introduce tu edad: ");
        edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Mayor de 25 años");
        }
        else{
            System.out.println("Menor de 25 años");
        }
        
    }
    
}
