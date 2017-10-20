package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
//		Generar número aleatorio		
		Random random = new Random();
		int valorDado = random.nextInt(1000)+1;  // Entre 1 y 1000.
//		System.out.print(valorDado);
		
		Scanner scanner = new Scanner(System.in);
		int contadorDeIntentos = 1;
		
		System.out.printf("Adivina el numero (Entre 1 y 1000) [intento %d]: ", 
				contadorDeIntentos);
		String Numero = scanner.nextLine();
		int num = Integer.parseInt(Numero);
		while (valorDado != num) {
			contadorDeIntentos++;
			if (valorDado < num)
				System.out.printf("Es menor que ese. Vuelve a intentarlo [intento %d]: ", 
						contadorDeIntentos);
			else
				System.out.printf("Es mayor que ese. Vuelve a intentarlo [intento %d]: ", 
						contadorDeIntentos);
			Numero = scanner.nextLine();
			num = Integer.parseInt(Numero);
		}
		System.out.printf("Enhorabuena. Has acertado en %s %s.", 
				contadorDeIntentos, contadorDeIntentos == 1 ? "intento" : "intentos");
	}
}