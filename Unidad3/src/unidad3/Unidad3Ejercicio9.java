/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Unidad3Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int dia, mes, año;
       
        
        System.out.println("Introduce el día: ");
        dia = scanner.nextInt();
        System.out.println("Introduce el mes: ");
        mes = scanner.nextInt();
        System.out.println("Introduce el año: ");
        año = scanner.nextInt();
       
       
        if(mes > 12) {
            System.out.println("El mes no és válido");
        }
        else{
        switch (mes) {
            case 1:case 3:case 5:case 7:case 8:
            case 10:case 12:
                if (dia > 31) {
                    System.out.println("El día no és válido");
                    break;
                }
                else {
                    
                }  
            case 4: case 6: case 9: case 11:
                if (dia > 30) {
                    System.out.println("El mes no és válido");
                    break;    
                }
                else {
                }
            case 2:
                if (año % 4 == 0)
                    if (dia > 29) {
                        System.out.println("El mes no és válido");
                        break;
                    }
                    else {            
                    }    
                else {    
                    if (dia > 28) {
                        System.out.println("El mes no és válido");    
                        break;
                    }
                    else {
                    }
                }    
            default:
                System.out.println("La fecha es: " + dia + "/" 
                        + mes + "/" + año);
                
                
        }
        }
    }
      
}
