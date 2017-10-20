/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nando
 */
public class Unidad3Ejercicio11b {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner (System.in);
        
        int num, intentos = 1;
        int aleatorio = random.nextInt(100) + 1;
        System.out.print(aleatorio);
        
        System.out.println("Adivina el número.\n Introduce un num: ");
        num = scanner.nextInt();
        
        
        while (num != aleatorio) {
                if (num > aleatorio) {
                    System.out.println("Es menor que " + num + ": ");
                    intentos++;
                    num = scanner.nextInt();
                }
                else {
                    System.out.println("Es mayor que " + num + ": ");
                    intentos++;
                    num = scanner.nextInt();
                }
            
        }
        System.out.print("Correcto!");
        System.out.println("Consegido en " + intentos + " intentos");
    }
    
}
