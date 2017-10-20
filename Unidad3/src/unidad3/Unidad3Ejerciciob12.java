/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.Random;

/**
 *
 * @author nando
 */
public class Unidad3Ejerciciob12 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int dado = random.nextInt(6 + 1);
        int uno = 0,dos = 0,tres = 0,cuatro = 0,cinco = 0,seis = 0;
        int cont = 0;
        
        while (cont < 1000000) {
            cont++;
            if (dado == 1){
            uno++;
            }
            if (dado == 2){
            dos++;
            }
            if (dado == 3){
            tres++;
            }
            if (dado == 4){
            cuatro++;
            }
            if (dado == 5){
            cinco++;
            }
            if (dado == 6){
            seis++;
            }
        dado = random.nextInt(6 + 1);
        }
        int unopor = uno * 100 / cont;
        int dospor = dos * 100 / cont;
        int trespor = tres * 100 / cont;
        int cuatropor = cuatro * 100 / cont;
        int cincopor = cinco * 100 / cont;
        int seispor = seis * 100 / cont;
        
        System.out.println("Probabilidad de uno: " + unopor + "%");
        System.out.println("Probabilidad de dos: " + dospor + "%");
        System.out.println("Probabilidad de tres: " + trespor + "%");
        System.out.println("Probabilidad de cuatro: " + cuatropor + "%");
        System.out.println("Probabilidad de cinco: " + cincopor + "%");
        System.out.println("Probabilidad de seis: " + seispor + "%");
    }
}
