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
public class Unidad02Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio = 85.00;
        double descuento;
        System.out.println("Inserta el descuento: ");
        descuento = scanner.nextInt();
        double descuentoTotal = descuento / 100;
        double precioDescuento = precio * descuentoTotal;
        System.out.print("El precio de las zapatillas con descuento es ");
        System.out.print(precio - precioDescuento);
        System.out.println("€");
    }
}
