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
public class Unidad3Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cuota = 500;
        String mayor;
        String menor;
        String socio;
        System.out.print("Aplicación de descuentos:\n"+
                "¿Mayor de 65? Responda si o no: ");
        mayor = scanner.next();
        if (mayor.charAt(0) == 's' || mayor.charAt(0) == 'S' ){
            cuota = cuota - (cuota * 0.50);
        }
        else {
            System.out.println("¿El nuevo miembro es menor de 18 años? Responda si o no: ");
            menor = scanner.next();
            if (menor.charAt(0) == 's' || menor.charAt(0) == 'S' ){
                System.out.println("¿Es hijo de socio? Responda si o no: ");
                socio = scanner.next();
                if (socio.charAt(0) == 's' || socio.charAt(0) == 'S' ) {
                    cuota = cuota - (cuota * 0.35);
                }
                else {
                    cuota = cuota - (cuota * 0.25);
                }    
            }
            
        }
        System.out.println("La cuota total para el cliente son " + cuota + "€");
    }
}

