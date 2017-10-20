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
public class Unidad3Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, num2;
        System.out.println("introduce el primer número: ");
         num = scanner.nextInt();
        System.out.println("introduce el segundo número: ");
         num2 = scanner.nextInt();
        if (num > num2){
            System.out.println("Mayor " + num);
            System.out.println("Menor " + num2);
        }
        if (num < num2){
            System.out.println("Menor " + num);
            System.out.println("Mayor " + num2);
        }
        if (num == num2){
            System.out.println("El " + num + " es igual que " + num2);
        }
    }
}
