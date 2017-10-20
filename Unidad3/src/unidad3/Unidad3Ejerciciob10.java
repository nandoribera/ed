/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

/**
 *
 * @author nando
 */
public class Unidad3Ejerciciob10 {

    public static void main(String[] args) {

        int cara = 0;
        int cruz = 0;
        int moneda;
        int intentos = 0;

        moneda = (int) Math.round(Math.random());

        while (intentos < 10) {
            if (moneda == 1) {
                cara = cara + 1;
                intentos = intentos + 1;
            }  
            if (moneda != 0){
                cruz = cruz + 1;
                intentos = intentos + 1;
                moneda = (int) Math.round(Math.random());
            }
        }

        System.out.println(cara);
        System.out.println(cruz);
        System.out.println(intentos);
    }

}
