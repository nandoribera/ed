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
public class Unidad3Ejercicio5 {
    public enum Notas {
        MD, INS, SUF, BIEN, NOT, SOB
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        System.out.println("Escribe la calificación: ");
        nota = scanner.nextInt();
        if (nota <= 3){
            System.out.println(Notas.MD);
        }
        if (nota > 3 && nota < 5){
            System.out.println(Notas.INS);
        }
        if (nota == 5){
            System.out.println(Notas.SUF);
        }
        if (nota == 6){
            System.out.println(Notas.BIEN);
        }
        if (nota >= 7 && nota < 9){
            System.out.println(Notas.NOT);
        }
        if (nota >=9 && nota <= 10 ){
            System.out.println(Notas.NOT);
        }
    }
    
}
