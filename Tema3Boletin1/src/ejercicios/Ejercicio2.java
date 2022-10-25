package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuacion se contaran todos los numeros introducidos"
				+ " para finalizar el programa inserte un numero negativo");
		num = sc.nextInt();
		
		while (num>=0) {
			cont++;
			num = sc.nextInt();
		}

		System.out.println("ha introducido: " + cont + " numeros");
	}

}
