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
public class Unidad3Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("introduce un número: ");
        num = scanner.nextInt();
        int resto;
        resto = num % 2;
        if (resto == 0) {
        System.out.println("El número " + num + " es par");
        }
        else {
        System.out.println("El número " + num + " es impar");
        }
    }
}
