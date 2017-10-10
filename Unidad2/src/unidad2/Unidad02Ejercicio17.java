/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Unidad02Ejercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float segundos;
        System.out.println("Introduce los segundos a convertir: ");
        segundos = scanner.nextInt();
        float minutos = segundos / 60;
        float horas = minutos / 60;
        float dias = horas / 24;
        System.out.printf("Dias %10.2f \n", dias);
        System.out.printf("Horas %10.2f \n", horas);
        System.out.printf("Minutos %10.2f \n", minutos);
        System.out.printf("Segundos %10.2f \n", segundos);

    }

}
