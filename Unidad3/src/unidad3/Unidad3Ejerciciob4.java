/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Unidad3Ejerciciob4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList listaPares = new ArrayList();
        
        int A, B;
        
        System.out.println("Introduce un número A: ");
        A = scanner.nextInt();
        
        System.out.println("Introduce un número B, mayor que A: ");
        B = scanner.nextInt();
        
        if (A >= B) {
            System.out.println("A es mayor que B");
            
        }
        else {
                int aux = A;
                while (B >= aux) {
                    if (aux%2 == 0) { 
                        listaPares.add(aux);
                        aux = aux +1;
                    }    
                    else  
                        aux = aux +1;
                }            
        
            
                System.out.println("Los números pares entre " + A +
                " y " + B + " son: ");
                System.out.println(listaPares);
        }        
    }    
}
