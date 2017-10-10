/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author ferviu
 */
public class unidad02Ejercicio12 {
    public static void main(String[] args) {
        double diametro = 15.5;
        double altura = 42.4;
        double radio = diametro / 2;
        double PI = Math.PI;
        double area = (2*PI)*radio*(radio+altura);
        double volumen= (PI*(radio*radio))* altura;
        System.out.println("El area es : " + area + "cm²");
        System.out.println("El volumen es: " + volumen + "cm³");
        
        
        
        
        
    }
}
