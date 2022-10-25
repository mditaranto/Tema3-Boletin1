package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num;
		int suma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuacion se sumaran todos los numeros introducidos"
				+ "para finalizar el programa inserte un numero negativo");
		num = sc.nextInt();
		
		while (num>=0) {
			suma += num;
			num = sc.nextInt();
		}
		System.out.println("La suma total de todos los numeros es: " + suma);

	}

}
