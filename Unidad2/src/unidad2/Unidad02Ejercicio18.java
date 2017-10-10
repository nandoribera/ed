/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Unidad02Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float lado;
        System.out.println("Introduce el tamaño del lado del triangulo equilátero: ");
        lado = scanner.nextInt();
        double altura = sqrt(lado*3)/(lado/2) / 2;
        float perimetro = lado * 3;
        float area = sqrt(3);
    }
}
