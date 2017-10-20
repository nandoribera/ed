/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.ArrayList;

/**
 *
 * @author nando
 */
public class Unidad3Ejerciciob6 {
    public static void main(String[] args) {
        ArrayList tablaMultip1 = new ArrayList();
        ArrayList tablaMultip2 = new ArrayList();
        ArrayList tablaMultip3 = new ArrayList();
        ArrayList tablaMultip4 = new ArrayList();
        ArrayList tablaMultip5 = new ArrayList();
        ArrayList tablaMultip6 = new ArrayList();
        ArrayList tablaMultip7 = new ArrayList();
        ArrayList tablaMultip8 = new ArrayList();
        ArrayList tablaMultip9 = new ArrayList();
        ArrayList tablaMultip10 = new ArrayList();
        
        int num = 1;
        
        while (num <= 10) {
            int aux = num;
            aux = num * 1;
            tablaMultip1.add(aux);
            num = num + 1;    
        }
        num = num - 10;
        while (num <= 10) {
            int aux = num;
            aux = num * 2;
            tablaMultip2.add(aux);
            num = num + 1; 
        }
        num = num - 10;
         while (num <= 10) {
            int aux = num;
            aux = num * 3;
            tablaMultip3.add(aux);
            num = num + 1; 
        }
         num = num - 10;
         while (num <= 10) {
            int aux = num;
            aux = num * 4;
            tablaMultip4.add(aux);
            num = num + 1; 
        }
         num = num - 10;
         while (num <= 10) {
            int aux = num;
            aux = num * 5;
            tablaMultip5.add(aux);
            num = num + 1; 
        }
         num = num - 10;
         while (num <= 10) {
            int aux = num;
            aux = num * 6;
            tablaMultip6.add(aux);
            num = num + 1; 
        }
         num = num - 10;
         while (num <= 10) {
            int aux = num;
            aux = num * 7;
            tablaMultip7.add(aux);
            num = num + 1; 
        }
         num = num - 10;
         while (num <= 10) {
            int aux = num;
            aux = num * 8;
            tablaMultip8.add(aux);
            num = num + 1; 
        }
         num = num - 10;
         while (num <= 10) {
            int aux = num;
            aux = num * 9;
            tablaMultip9.add(aux);
            num = num + 1; 
        }
         num = num - 10;
         while (num <= 10) {
            int aux = num;
            aux = num * 10;
            tablaMultip10.add(aux);
            num = num + 1; 
        }
         System.out.println("Tabla de multiplicar del 1 al 10");
         System.out.println("Tabla de Multiplicar del 1: " + tablaMultip1);
         System.out.println("Tabla de Multiplicar del 2: " + tablaMultip2);
         System.out.println("Tabla de Multiplicar del 3: " + tablaMultip3);
         System.out.println("Tabla de Multiplicar del 4: " + tablaMultip4);
         System.out.println("Tabla de Multiplicar del 5: " + tablaMultip5);
         System.out.println("Tabla de Multiplicar del 6: " + tablaMultip6);
         System.out.println("Tabla de Multiplicar del 7: " + tablaMultip7);
         System.out.println("Tabla de Multiplicar del 8: " + tablaMultip8);
         System.out.println("Tabla de Multiplicar del 9: " + tablaMultip9);
         System.out.println("Tabla de Multiplicar del 10: " + tablaMultip10);
    }
}
