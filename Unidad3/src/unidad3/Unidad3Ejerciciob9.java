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
public class Unidad3Ejerciciob9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num,aux;
        
        System.out.println("Descomposición factorial en primos de un número entero \n"
                + "Introduce un número: ");
        num = scanner.nextInt();
        
        if (num > 1) {
            int factor = 2;
            aux = num;
            System.out.print(aux + " = ");
            while (aux > factor) {
                if (aux % factor == 0) {
                    aux /= factor;
                    System.out.print(factor + " * ");
                } else {
                    factor++;
                }
            }
            System.out.println(factor);
        }    
            
    }
}    
    

