package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
//		Generar número aleatorio		
		Random random = new Random();
		int valorDado = random.nextInt(1000)+1;  // Entre 0 y 1000.
//		System.out.print(valorDado);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Adivina el numero (Entre 1 y 1000): ");
		String Numero = scanner.nextLine();
		int num = Integer.parseInt(Numero);
		while (valorDado != num) {
			if (valorDado < num)
				System.out.print("Es menor que ese. Vuelve a intentarlo: ");
			else
				System.out.print("Es mayor que ese. Vuelve a intentarlo: ");
			Numero = scanner.nextLine();
			num = Integer.parseInt(Numero);
		}
		System.out.println("Correcto");
	}
}