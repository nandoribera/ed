package unidad2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferviu
 */
public class Unidad02Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta nota del primer parcial: ");
        int parcial1;
        parcial1 = scanner.nextInt();
        System.out.println("Inserta nota del segundo parcial: ");
        int parcial2;
        parcial2 = scanner.nextInt();
        int cont=2;
        int suma = parcial1 + parcial2;
        int media = suma / cont;
        System.out.println("Asignatura de Programación");
        System.out.println(parcial1);
        System.out.println(parcial2);
        System.out.println(media);
    }
    
}
